# Mini-Assignment 1: Generic Box and Methods

## Objective
Practice defining and using generic classes and generic methods.

## Primary Competency
Generic API fundamentals.

## Learning Objectives Alignment
Week 6 objectives 1 and 2.

## Estimated Time
20 to 25 minutes.

## Problem Statement
Create a small generic container and a utility method that returns the first element of a list. Use both with multiple types to demonstrate compile-time type safety.

## Requirements
Complete the code so that it:

* defines a generic `Box<T>` with `set` and `get`
* defines a generic method `<T> T first(List<T> values)`
* demonstrates usage with at least `String` and `Integer`
* prints deterministic output shown below
* avoids raw types

## Extension Challenge
Add a second generic utility method that returns the last item and throws a clear exception for empty lists.

## Self-Check

* Did your generic class avoid casts in caller code?
* Did your utility method infer type arguments without explicit casts?

## Expected Output

```text
Label: CIS-18B
Units: 4
First student: Ada
First score: 98
```

## Run

```bash
mvn test
mvn exec:java
```

## Rubric Focus

* Correct generic syntax
* Type-safe method usage
* Clear output and naming
