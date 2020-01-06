# Spring AOP Demo

A project that demonstrates how Spring AOP can be used. The project does not use Spring Boot.

The actual functionality shows how AOP can be used to write a log message before and after certain methods are invoked. An example of where this could be used in production would be if there was a requirement to keep a record of exactly what methods were invoked for audit or debug purposes.

### Prerequisites

Download and install the Java JDK from Oracle which can be found [here.](https://www.oracle.com/technetwork/java/javase/downloads/index.html)

Java version 11 or later must be used.

Check that it was installed correctly by running `java -v`, the output should look similar to this:

```
java version "11.0.4" 2019-07-16 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.4+10-LTS)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.4+10-LTS, mixed mode)
```
If the above command is not recognised, you may need to set you `JAVA_HOME` environment variable may not be set. Instructions can be found [here.](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-fix-common-JAVA_HOME-errors-quickly)

## Getting Started

The project uses Gradle wrapper with the `application` plugin.
To build and run the project, use:

 `gradlew run`

 However, since there is no way to invoke the service methods, tests should be run to demonstrate functionality using:

`gradlew test`
