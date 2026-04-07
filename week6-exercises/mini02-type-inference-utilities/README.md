# Mini-Assignment 2: Type Inference Utilities

## Objective
Use type inference in generic helper methods and constructors.

## Primary Competency
Applying Java type inference in utility APIs.

## Learning Objectives Alignment
Week 6 objectives 1 and 2.

## Estimated Time
20 to 30 minutes.

## Problem Statement
You are building utility methods for roster and score handling. Implement methods so Java infers types from call context while preserving clear API contracts.

## Requirements
Complete the code so that it:

* uses the diamond operator where appropriate
* implements a generic `pair` factory method
* implements a generic `chooseSecond` method
* includes one example of explicit type arguments for clarity
* prints deterministic output shown below

## Extension Challenge
Add `chooseNonNull(T first, T second)` and explain one situation where explicit typing improves readability.

## Self-Check

* Did you rely on inference where it makes code shorter and still clear?
* Did you avoid ambiguous calls that would confuse readers?

## Expected Output

```text
Pair: (Ada, 98)
Second name: Grace
Explicit value: fallback
```

## Run

```bash
mvn test
mvn exec:java
```

## Rubric Focus

* Correct generic method design
* Effective use of inference
* Readable examples
