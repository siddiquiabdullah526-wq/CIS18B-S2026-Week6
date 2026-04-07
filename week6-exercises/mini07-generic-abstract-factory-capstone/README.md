# Mini-Assignment 7: Generic Abstract Factory Capstone

## Objective
Design a generic Abstract Factory that preserves product-family type safety.

## Primary Competency
Strongly typed family-compatible factory APIs.

## Learning Objectives Alignment
Week 6 objectives 6 and 7.

## Estimated Time
50 to 70 minutes.

## Problem Statement
Create two UI families (Campus and Mobile). Use a generic factory interface so each family only creates compatible products without client-side casts.

## Requirements
Complete the code and tests so that it:

* defines product interfaces for `Button` and `Dialog`
* defines a generic factory contract that binds compatible product types
* provides at least two concrete families
* renders deterministic output for each family
* passes all JUnit tests

## Extension Challenge
Add a third family or add a typed builder that assembles a small UI screen object from factory products.

## Self-Check

* Did the compiler prevent cross-family mismatch by design?
* Did tests verify both product types and rendered text?

## Expected Output

```text
Campus UI: CampusButton + CampusDialog
Mobile UI: MobileButton + MobileDialog
```

## Run

```bash
mvn test
mvn exec:java
```

## Rubric Focus

* Factory type-safety
* Family consistency
* Test completeness
