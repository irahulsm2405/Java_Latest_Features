This project was created in intellij which uses JDK 24 (which is the latest version as of 12/08/2025)
It contains features from java 8 to latest.

Java 8, 9, 10, 11 and 14 features will not run because of following error:  java: No enum constant javax.lang.model.element.Modifier.SEALED in this class
This is beacuse these are too old versions and anything below java 17 will give sealed class error.

To resolve this, do the following (In intellij):
- Go to File -> Project Structure -> Project Settings -> Project -> Language Level
- set the language level to what you are running. if you are trying to run java 9 classes, then select java 9 and save.
