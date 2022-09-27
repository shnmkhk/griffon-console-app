Basic Griffon Swing/Java project
--------------------------------
[Getting Started](http://griffon-framework.org/guide/2.16.0/#_getting_started)

You have just created a basic Griffon application with Swing as UI toolkit
and Java as main language. The project has the following file structure

    .
    ├── build.gradle
    ├── griffon-app
    │   ├── conf
    │   ├── controllers
    │   ├── i18n
    │   ├── lifecycle
    │   ├── models
    │   ├── resources
    │   ├── services
    │   └── views
    ├── pom.xml
    └── src
        ├── integration-test
        │   └── java
        ├── main
        │   ├── java
        │   └── resources
        └── test
            ├── java
            └── resources

Simply add your source files to `src/main/java`, your test cases to
`src/test/java` and then you will be able to build your project with

Maven then execute the following commands

    ./mvnw compile
    ./mvnw test
    ./mvnw -Prun

Don't forget to add any extra JAR dependencies to `pom.xml`!
