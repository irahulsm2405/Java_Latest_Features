This project was created in intellij which uses JDK 21 (as of 12/08/2025). It contains features from java 8 to latest stable and major update.

Java 8-16 features will not run normally because of following error:  java: No enum constant javax.lang.model.element.Modifier.SEALED in this class
This is beacuse these are too old versions and anything below java 17 will give sealed class error in intellij.

To resolve this, do the following (In intellij):
- Go to File -> Project Structure -> Project Settings -> Project -> Language Level
- set the language level to what you are running. if you are trying to run java 9 classes, then select java 9 and save.

If not using intellij then ignore as it works fine in Eclipse and STS without any changes.

Preview features have been removed from java versions and it could cause compiler issues.
