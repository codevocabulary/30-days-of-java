# ☕ Day 21 — Optional & Functional Interfaces

<div align="center">

![Day](https://img.shields.io/badge/Day-21%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Upper--Intermediate-yellow?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Optional%20%26%20Functional%20Interfaces-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Safe%20User%20Service-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Optional<T> — avoiding NullPointerException
- ✅ Creating Optional — of, ofNullable, empty
- ✅ Optional methods — isPresent, get, orElse, orElseGet, orElseThrow
- ✅ Optional chaining — map, flatMap, filter
- ✅ Function<T,R> — transform input to output
- ✅ Predicate<T> — test a condition
- ✅ Consumer<T> — accept input, return nothing
- ✅ Supplier<T> — provide a value
- ✅ BiFunction, UnaryOperator, BinaryOperator
- ✅ Composing functions — andThen, compose

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Optional` | Container that may or may not hold a value. Explicitly represents 'might be null'. Forces handling. |
| `Optional.ofNullable()` | Creates Optional from value that might be null. Use instead of Optional.of() for safety. |
| `orElse vs orElseGet` | orElse(default) ALWAYS evaluates default. orElseGet(() -> compute()) is LAZY — only if empty. |
| `Optional chaining` | opt.map(user -> user.getName()).orElse('Unknown') — safe navigation without null checks. |
| `Function<T,R>` | Takes T, returns R. Compose with andThen/compose: toUpper.andThen(trim). |
| `Predicate<T>` | Takes T, returns boolean. Combine with and(), or(), negate(): isAdult.and(isStudent). |
| `Consumer<T>` | Takes T, returns void. Used in forEach. Chain with andThen. |
| `Supplier<T>` | Takes nothing, returns T. Lazy evaluation. Used for expensive default values. |

---

## 📁 Files in This Project

```
day-21-optional-and-functional/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-21-optional-and-functional
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Safe User Service** — User service with Optional return types, functional transformations, safe null handling

Every concept from today is used in the project at the bottom of `Main.java`.
Study the project code carefully — it shows how individual concepts combine.

---

## 💪 Challenges

1. Extend the project with one additional feature not already implemented
2. Write your own version of the core logic from scratch without looking
3. Find and fix intentional bugs hidden in the code comments
4. Read the official Java documentation for the main class/concept used today
5. Explain each concept to someone else — teaching solidifies understanding

---



## ⏭️ What's Next?

**Day 22** continues building on today's concepts. Keep the momentum!
