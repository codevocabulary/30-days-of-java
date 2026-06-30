# ☕ Day 20 — Lambda Expressions & Stream API

<div align="center">

![Day](https://img.shields.io/badge/Day-20%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Upper--Intermediate-yellow?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Lambda%20Expressions%20%26%20Stream%20API-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Data%20Analytics%20Pipeline-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Lambda expressions — anonymous functions
- ✅ Functional interfaces (@FunctionalInterface)
- ✅ Method references — Class::method
- ✅ Stream creation — from collections, arrays, Stream.of()
- ✅ Intermediate operations — filter, map, sorted, distinct, limit
- ✅ Terminal operations — collect, forEach, reduce, count, findFirst
- ✅ Collectors — toList, toMap, groupingBy, joining
- ✅ Parallel streams — when and how to use
- ✅ Optional with streams

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Lambda` | (params) -> expression or (params) -> { statements; }. Replaces anonymous inner class. |
| `Functional interface` | Interface with exactly ONE abstract method. @FunctionalInterface annotation. Examples: Runnable, Callable, Comparator. |
| `Method reference` | ClassName::methodName. Shorthand for lambda. System.out::println instead of x -> System.out.println(x). |
| `Stream` | Pipeline of operations on a sequence of elements. LAZY — operations only run when terminal op is called. |
| `filter()` | Intermediate. Returns new stream with elements matching predicate. |
| `map()` | Intermediate. Transforms each element. stream.map(String::toUpperCase). |
| `collect()` | Terminal. Collects stream into collection: Collectors.toList(), toMap(), groupingBy(). |
| `reduce()` | Terminal. Folds stream to single value: stream.reduce(0, Integer::sum). |

---

## 📁 Files in This Project

```
day-20-lambda-and-streams/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-20-lambda-and-streams
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Data Analytics Pipeline** — Employee analytics: filter by dept, sort by salary, group, average, statistics

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

**Day 21** continues building on today's concepts. Keep the momentum!
