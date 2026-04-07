# Week 6 Lesson: Generics and Pattern-Driven API Design

# How to use this README.md

This repository contains the lesson for this week (`README.md`, the file you're reading now), as well as your assignments for this week (`week6-exercises/`). Each exercise has its own `README.md` with setup, requirements, and run instructions.

Work through the lesson in order, run each sample in your IDE, and pause at each checkpoint question before moving on.

## Required External Readings

1. Intro to Generics:
   [https://dev.java/learn/generics/intro/](https://dev.java/learn/generics/intro/)
2. Type Inference:
   [https://dev.java/learn/generics/type-inference/](https://dev.java/learn/generics/type-inference/)
3. Wildcard Patterns:
   [https://dev.java/learn/generics/wildcards/](https://dev.java/learn/generics/wildcards/)
4. Type Erasure:
   [https://dev.java/learn/generics/type-erasure/](https://dev.java/learn/generics/type-erasure/)
5. Restrictions on Generics:
   [https://dev.java/learn/generics/restrictions/](https://dev.java/learn/generics/restrictions/)
6. GoF references:
   - Abstract Factory: [https://refactoring.guru/design-patterns/abstract-factory](https://refactoring.guru/design-patterns/abstract-factory)
   - Observer: [https://refactoring.guru/design-patterns/observer](https://refactoring.guru/design-patterns/observer)
   - Builder: [https://refactoring.guru/design-patterns/builder](https://refactoring.guru/design-patterns/builder)

## Learning Objectives

By the end of this lesson, you will be able to:

* explain why generics improve API safety and readability compared with raw types
* use Java type inference in variable declarations, constructors, and generic method calls
* apply wildcard bounds (`? extends` and `? super`) using PECS reasoning
* explain how type erasure impacts runtime behavior and debugging decisions
* identify core restrictions on Java generics and use practical workaround patterns
* implement pattern-oriented APIs (Observer and Abstract Factory) with generic type contracts
* evaluate when generics reduce casts and clarify intent in design pattern implementations

---

# Part 1 - Generics Overview

Estimated time: 20 to 30 minutes

## Reading Focus

Read the Intro to Generics lesson and focus on:

* generic classes and methods
* raw type risks
* compile-time type checking

## Why Generics Matter

Without generics, APIs often return `Object`, forcing casts and increasing runtime failure risk.

With generics, the compiler enforces type intent earlier.

```java
public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericIntroDemo {
    public static void main(String[] args) {
        Box<String> labelBox = new Box<>();
        labelBox.set("CIS-18B");
        System.out.println(labelBox.get().toUpperCase());
    }
}
```

Checkpoint:

* What bug class does `Box<T>` eliminate compared with `Box` that stores `Object`?
* Why is compile-time failure usually better than runtime failure?

---

# Part 2 - Type Inference

Estimated time: 20 to 30 minutes

## Reading Focus

Read Type Inference and watch how Java infers type arguments from:

* variable declarations
* method signatures
* constructor contexts

## Example

```java
import java.util.ArrayList;
import java.util.List;

public class TypeInferenceDemo {

    public static <T> T first(List<T> items) {
        return items.get(0);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Grace");

        String firstName = first(names);
        System.out.println(firstName);
    }
}
```

Sometimes explicit types improve clarity:

```java
String value = TypeInferenceDemo.<String>first(List.of("x", "y"));
```

Checkpoint:

* Where in this example does Java infer type arguments automatically?
* When might explicit type arguments make code easier to read?

---

# Part 3 - Wildcard Patterns

Estimated time: 25 to 35 minutes

## Reading Focus

Read Wildcards and concentrate on:

* invariance (`List<Integer>` is not `List<Number>`)
* upper bounds (`? extends`)
* lower bounds (`? super`)

## PECS Rule

Producer Extends, Consumer Super.

* If a structure only produces values for you to read, prefer `? extends T`.
* If a structure only consumes values that you add, prefer `? super T`.

```java
import java.util.List;

public class WildcardDemo {

    public static double sumNumbers(List<? extends Number> values) {
        double total = 0.0;
        for (Number n : values) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void addDefaults(List<? super Integer> target) {
        target.add(10);
        target.add(20);
    }
}
```

Checkpoint:

* Why can `sumNumbers` read safely from `List<? extends Number>` but not add arbitrary `Number` values?
* Why is `? super Integer` the safer choice for insertion methods?

---

# Part 4 - Type Erasure

Estimated time: 20 to 30 minutes

## Reading Focus

Read Type Erasure and focus on what generic information is available at compile-time vs runtime.

Key implications:

* most generic type arguments are erased at runtime
* `List<String>` and `List<Integer>` are both just `List` at runtime
* `instanceof List<String>` is illegal

```java
import java.util.ArrayList;
import java.util.List;

public class ErasureDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();

        System.out.println(names.getClass() == ids.getClass());
    }
}
```

Expected output:

```text
true
```

Checkpoint:

* Why can runtime reflection not recover `String` from `List<String>` in most cases?
* How should erasure change your debugging strategy?

---

# Part 5 - Restrictions on Generics

Estimated time: 25 to 35 minutes

## Reading Focus

Read Restrictions on Generics and identify practical coding consequences:

* no primitive type parameters (`List<int>` is illegal)
* no direct instantiation of type parameters (`new T()`)
* no static fields using class type parameters
* limited support for arrays of parameterized types

Workaround patterns:

* wrapper types (`Integer` instead of `int`)
* pass constructor/factory behavior as lambdas or suppliers
* accept `Class<T>` tokens when runtime typing is needed

```java
import java.util.function.Supplier;

public class FactoryBox<T> {
    private final Supplier<T> supplier;

    public FactoryBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T create() {
        return supplier.get();
    }
}
```

Checkpoint:

* Why is `new T()` disallowed by Java generics?
* When is `Supplier<T>` a clean replacement for direct construction?

---

# Part 6 - GoF Patterns Enhanced with Generics

Estimated time: 35 to 45 minutes

## Reading Focus

Revisit Abstract Factory, Observer, and Builder. Ask where generics can tighten contracts.

### Abstract Factory

Generics can preserve family compatibility and reduce casting:

```java
interface Button {
    String render();
}

interface UIFactory<T extends Button> {
    T createButton();
}
```

### Observer

Generics can guarantee event payload type consistency:

```java
interface Observer<T> {
    void onUpdate(T value);
}
```

### Builder

Generics can model fluent builders with stronger return typing.

Checkpoint:

* How do generics reduce accidental cross-family object creation in Abstract Factory?
* What runtime failures are avoided when Observer payloads are generic?
* Where does a generic builder improve API clarity for clients?

---

## Week 6 Exercise Path

Complete all mini-projects in `week6-exercises/` in order:

1. `mini01-generic-box-and-methods`
2. `mini02-type-inference-utilities`
3. `mini03-wildcards-pecs-clinic`
4. `mini04-type-erasure-lab`
5. `mini05-generics-restrictions-workarounds`
6. `mini06-generic-observer-pattern`
7. `mini07-generic-abstract-factory-capstone`

Minis 1 through 5 are formative. Minis 6 and 7 are summative and include required test verification.

## Weekly Self-Check

1. Can you explain PECS in your own words with one valid code example?
2. Can you describe one practical consequence of type erasure in debugging or reflection?
3. Can you implement a pattern API with generics without using raw types?
4. Did your summative mini tests pass with `mvn test`?
