# Simple project template archetype

Start project archetype for rapid prototyping and ideas testing.

## Supported features and dependencies:

- Java source and target versions are **1.8**
- Testing: **JUnit(4.11)** + **Hamcrest(1.3)**
- Source assembly to **ZIP**

## Using

Before the first use you should call `mvn install` from the root of this project.

To create a new project from a template execute the following command:

`mvn archetype:generate -DarchetypeGroupId=com.evst -DarchetypeArtifactId=archetype-simple -DarchetypeVersion=1.0`
