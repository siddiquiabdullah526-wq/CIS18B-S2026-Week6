# Mini-Assignment 6: Generic Observer Pattern

## Objective
Implement a strongly typed Observer pattern using generics.

## Primary Competency
Type-safe event notification contracts.

## Learning Objectives Alignment
Week 6 objectives 6 and 7.

## Estimated Time
45 to 60 minutes.

## Problem Statement
Build a generic alert stream where observers subscribe to one payload type and receive updates without casts.

## Requirements
Complete the code and tests so that it:

* defines generic `Observer<T>` and `Subject<T>` contracts
* supports subscribe and notify operations
* demonstrates notifications for a `SecurityAlert` payload type
* prints deterministic output in demo mode
* passes all JUnit tests

## Extension Challenge
Add an unsubscribe operation and a test that verifies removed observers no longer receive updates.

## Self-Check

* Did your observer and subject types match exactly without raw types?
* Does each notification deliver the expected payload values?

## Expected Output

```text
Dispatching alert: HIGH login attempts
Observer A received: HIGH
Observer B received: HIGH
```

## Run

```bash
mvn test
mvn exec:java
```

## Rubric Focus

* Correct generic pattern design
* Notification correctness
* Test quality
