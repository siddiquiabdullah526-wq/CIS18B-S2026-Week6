# Week 6 Exercises: Generics and Pattern-Driven API Design

This package contains 7 mini-assignments on Java generics and how they improve common design patterns.

Each assignment has its own folder, starter code, and local README instructions.

## Suggested package naming

Use the package names included in starter files.

Pattern:

`edu.norcocollege.cis18b.week6.mini0X`

## General submission expectations

* Complete all TODOs.
* Keep class names and package names unchanged unless your instructor says otherwise.
* Ensure each mini compiles before submission.
* Start with `mvn test` and use failures to guide your implementation.
* For runnable demos, also run `mvn exec:java` after tests pass.
* Include brief written reasoning when a mini asks you to justify a design choice.

## Async pacing guidance

* Mini 1: 20 to 25 minutes
* Mini 2: 20 to 30 minutes
* Mini 3: 30 to 40 minutes
* Mini 4: 20 to 30 minutes
* Mini 5: 25 to 35 minutes
* Mini 6: 45 to 60 minutes
* Mini 7: 50 to 70 minutes

## Grading use

* Minis 1 through 5 are formative practice.
* Minis 6 and 7 are summative mini-assessments.
* All minis are individual by default.

## Rubric focus for every mini

* Correctness: code behavior matches requirements.
* Type-safety reasoning: generic choices are justified.
* Code quality and readability: structure and naming are clear.

## Folders

1. `mini01-generic-box-and-methods`
   Primary competency: generic class and generic method fundamentals

2. `mini02-type-inference-utilities`
   Primary competency: applying Java type inference in utility APIs

3. `mini03-wildcards-pecs-clinic`
   Primary competency: wildcard bounds and PECS usage

4. `mini04-type-erasure-lab`
   Primary competency: reasoning about runtime behavior under erasure

5. `mini05-generics-restrictions-workarounds`
   Primary competency: designing around generic restrictions safely

6. `mini06-generic-observer-pattern`
   Primary competency: generic Observer contracts and event typing

7. `mini07-generic-abstract-factory-capstone`
   Primary competency: strongly typed Abstract Factory design

## Self-check before submission

1. Did you avoid raw types unless explicitly requested for comparison?
2. Did wildcard methods use bounds that match producer/consumer behavior?
3. Did your output match expected format where required?
4. If the mini includes tests, did they pass with `mvn test`?

## TDD workflow for this week

1. Run `mvn test` before editing code.
2. Implement one TODO chunk.
3. Run `mvn test` again.
4. Repeat until all tests pass.
5. Run `mvn exec:java` where demos are required.
