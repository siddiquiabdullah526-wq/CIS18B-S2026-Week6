# Mini-Assignment 5: Generics Restrictions and Workarounds

## Objective
Apply practical workaround patterns for common generic restrictions.

## Primary Competency
Designing safe APIs under generics constraints.

## Learning Objectives Alignment
Week 6 objective 5.

## Estimated Time
25 to 35 minutes.

## Problem Statement
Implement a small utility that creates typed default values without using illegal generic operations such as `new T()`.

## Requirements
Complete the code so that it:

* demonstrates why primitive type arguments are replaced by wrapper types
* uses `Supplier<T>` to create instances instead of `new T()`
* stores and retrieves values from a typed registry
* prints deterministic output shown below

## Extension Challenge
Add a `Class<T>` token-based lookup method and compare it with a supplier-based approach.

## Self-Check

* Did your design avoid illegal static generic field patterns?
* Did your factory path make instance creation explicit and testable?

## Expected Output

```text
Default retries: 3
Default status: NEW
Created message: Welcome
```

## Run

```bash
mvn test
mvn exec:java
```

## Rubric Focus

* Correct workaround usage
* API clarity
* Deterministic outputs
