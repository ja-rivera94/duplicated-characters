# Duplicate Character Removal Project in Java

This project contains a Java implementation to remove duplicate characters from a string.

## Introduction

The purpose of this project is to provide a simple and efficient solution for removing all duplicate characters from a string while maintaining the original order of non-duplicated characters.

## Prerequisites

Before running the project, make sure you have the following installed:
- Java JDK 17
- Gradle 8.4

## Installation and Execution

To install and run this project on your local machine, follow these steps:

1. Clone the repository to your local machine using Git:

   ```bash
   ./gradlew clone [Repository URL]
   ```
2. Navidate to the project
   ```
      cd [project directory name]
    ```
3. Run the project 
   ```
   ./gradlew build
   ./gradlew test
   ```


#### Usage
To use the removeDuplicates method, simply import the StringProcessor class into your Java program and call the method with your string as follows:

   ```
   String result = StringProcessor.removeDuplicates("your string here");
   ```