<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# jbang-idea-plugin Changelog

## [Unreleased]

## [0.7.0]

### Added

- Module JDK sync according to `//JAVA`
- Remove bundle of jbang.jar
- Dependencies sync adjusted to one way: from Gradle to DEPS or from DEPS to Gradle  

## [0.6.0]

### Added

- Add create script from JBang template
- Move all DEPS to module's jbang library

## [0.5.0]

### Added

- Add to sync DEPS to IDEA's module:  use `idea .` to open JBang project

## [0.4.0]

### Added

- JBang Run Line Marker for `///usr/bin/env jbang`
- `//GROOVY` directive completion for JBang Groovy script

## [0.3.0]

### Added

- Sync Dependencies Action: right click script file and sync dependencies between JBang and Gradle
- Add icon for `JBang run` in editor popup menu
- Append ` by JBang` to JBang run configuration to indicate it run by JBang

## [0.2.0]

### Added

- GAV directive added for completion
- Run configuration for Groovy: run Groovy by JBang

## [0.1.0]

### Added

- JDK sync from JBang to IntelliJ IDEA
- Json Schema support for jbang-catalog.json
- Run Configuration support: run JBang script by right click
- JBang script creation from file templates: New -> JBang Script
- JBang directives completion:  for example `//DEPS`, `//SOURCES`
