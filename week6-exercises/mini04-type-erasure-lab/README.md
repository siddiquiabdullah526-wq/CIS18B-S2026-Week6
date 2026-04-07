# Mini-Assignment 4: Type Erasure Lab

## Objective
Observe and explain runtime effects of type erasure.

## Primary Competency
Reasoning about compile-time vs runtime generic information.

## Learning Objectives Alignment
Week 6 objective 4.

## Estimated Time
20 to 30 minutes.

## Problem Statement
Use small runtime checks to show which generic details are erased and what can still be verified with reflection.

## Requirements
Complete the code so that it:

* compares runtime classes for `List<String>` and `List<Integer>`
* demonstrates legal `instanceof` usage with raw/parameterized boundaries
* prints clear statements about what erasure removes
* includes one reflection example using `Class<T>` tokens

## Extension Challenge
Add a short note (in comments) about how erasure influences API logging and diagnostics.

## Self-Check

* Did your output clearly distinguish compile-time type checks from runtime checks?
* Did you avoid illegal operations such as `instanceof List<String>`?

## Expected Output

```text
Same runtime class: true
List is instance of java.util.List: true
Course token simple name: String
```

## Run

```bash
mvn test
mvn exec:java
```

## Rubric Focus

* Correct erasure explanation
* Valid runtime checks
* Clear educational output
