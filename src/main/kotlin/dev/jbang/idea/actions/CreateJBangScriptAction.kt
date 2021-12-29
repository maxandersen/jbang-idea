package dev.jbang.idea.actions

import com.intellij.icons.AllIcons
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.SystemInfo
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiFile
import dev.jbang.idea.groovyIcon
import dev.jbang.idea.jbangIcon
import dev.jbang.idea.jshellIcon
import dev.jbang.idea.kotlinIcon
import java.io.File

class CreateJBangScriptAction : CreateFileFromTemplateAction(NAME, DESCRIPTION, jbangIcon), DumbAware {
    companion object {
        private const val NAME = "JBang Simple Script"
        private const val DESCRIPTION = "Create JBang script"
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle("New $NAME")
            .addKind("Java", AllIcons.FileTypes.Java, "JBang Java")
            .addKind("Kotlin", kotlinIcon, "JBang Kotlin")
            .addKind("SpringBootKotlin", kotlinIcon, "JBang Spring Boot Kotlin")
            .addKind("Groovy", groovyIcon, "JBang Groovy")
            .addKind("JShell", jshellIcon, "JBang JShell")
    }

    override fun getActionName(directory: PsiDirectory?, newName: String, templateName: String?): String = "Create $NAME $newName";

    override fun createFile(name: String, templateName: String, dir: PsiDirectory): PsiFile? {
        val scriptFile = super.createFile(name, templateName, dir)
        if (scriptFile != null && (SystemInfo.isLinux || SystemInfo.isMac)) {
            File(scriptFile.virtualFile.path).setExecutable(true)
        }
        return scriptFile
    }
}