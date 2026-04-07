# Mini-Assignment 3: Wildcards and PECS Clinic

## Objective
Apply upper and lower wildcard bounds correctly.

## Primary Competency
Wildcard method design using PECS.

## Learning Objectives Alignment
Week 6 objective 3.

## Estimated Time
30 to 40 minutes.

## Problem Statement
Implement one producer-style method and one consumer-style method for score processing. Use wildcard bounds that reflect each method's behavior.

## Requirements
Complete the code so that it:

* implements `sumAll(List<? extends Number>)`
* implements `addPracticeScores(List<? super Integer>)`
* demonstrates invariance with commented examples
* prints deterministic output shown below
* includes a short PECS explanation comment in code

## Extension Challenge
Add `copyAll(List<? extends T> source, List<? super T> target)` and demo it with two compatible list types.

## Self-Check

* Did your producer method avoid unsafe writes?
* Did your consumer method accept broader destination types?

## Expected Output

```text
Total score: 265.5
After practice adds: [70, 75, 80]
Copied values: [70, 75, 80]
```

## Run

```bash
mvn test
mvn exec:java
```

## Rubric Focus

* Correct wildcard bounds
* PECS reasoning quality
* Deterministic behavior
