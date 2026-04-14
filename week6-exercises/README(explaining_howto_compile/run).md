# CIS18B Week 6 Assignment
This repository contains all Mini Assignments (1–7) for Week 6, covering Java Generics concepts including type safety, wildcards, type erasure, observer pattern, and abstract factory design.

## Setup (Codespaces)
This repository includes a devcontainer configuration that automatically installs Java 17 and Maven.

## How to Run Each Mini
Each mini is a separate Maven project.

### General Steps to run
First you got to Navigate to a mini folder:
```bash
cd week6-exercises/<mini-folder-name>

COMPILE AND RUN TESTS: mvn clean test (type in terminal)
RUN THE PROGRAM: mvn exec:java (type in terminal)

EXAMPLE OF WHAT IT SHOULD LOOK LIKE:
cd week6-exercises/mini01-generic-box-and-methods
mvn clean test
mvn exec:java
