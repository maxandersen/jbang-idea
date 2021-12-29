jbang-intellij-plugin
======================
![Build](https://github.com/jbangdev/jbang-idea/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/18257.svg)](https://plugins.jetbrains.com/plugin/18257)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/18257.svg)](https://plugins.jetbrains.com/plugin/18257)

<!-- Plugin description -->
**JBang plugin** is a plugin for IntelliJ IDEA to integrate [JBang](https://www.jbang.dev/).

The following features are available:

* JSON Schema for jbang-catalog.json
* JDKs sync with JBang: sync JDKs from JBang to IntelliJ IDEA
* JBang script creation from file templates: New -> JBang Script
* JBang directives completion:  for example `//DEPS`, `//SOURCES`
* Sync Dependencies between JBang and Gradle
* Sync Dependencies to IDEA's module when using `idea .` to open JBang project
* JBang Run Line Marker for `///usr/bin/env jbang`
* Run Configuration support: run JBang script by right click
    * file name end with '.java', '.kt', '.groovy' or '.jsh'
    * file code should contain `///usr/bin/env jbang` or `//DEPS`

<!-- Plugin description end -->

## Sync Dependencies between JBang and Gradle

Right lick JBang script and Choose `Sync JBang DEPS` and sync dependencies between JBang script and build.gradle.

**Limitations**:

* Gradle Groovy support now: only detect `build.gradle`
* After sync, and you need to click `Refresh` floating button if without Auto-Reloading enabled 
* Dependency remove detection: if you want to delete dependencies, and you should delete lines in build.gradle and script file by hand. 

## Install

<kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "jbang"</kbd> > <kbd>Install Plugin</kbd>  > <kbd>Restart IntelliJ IDEA</kbd>

## Build

```
$ # JDK 11 required
$ ./gradlew -x test patchPluginXml buildPlugin
```

<kbd>Preferences</kbd> > <kbd>Plugins</kbd> >  <kbd>Gear Icon Right Click</kbd> > <kbd>Install Plugin from Disk</kbd> > <kbd>Choose
$PROJECT_DIR/build/distributions/jbang-intellij-plugin-0.x.0.zip</kbd>  > <kbd>Restart IntelliJ IDEA</kbd>
