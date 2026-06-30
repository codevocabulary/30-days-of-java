# ☕ Day 17 — Generics

<div align="center">

![Day](https://img.shields.io/badge/Day-17%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Upper--Intermediate-yellow?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Generics-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Generic%20Data%20Structures-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Why generics — type safety without casting
- ✅ Generic classes — class Box<T>
- ✅ Generic methods — <T> T method(T param)
- ✅ Bounded type parameters — <T extends Comparable<T>>
- ✅ Wildcard — <?>, <? extends T>, <? super T>
- ✅ Multiple type bounds
- ✅ Type erasure — how generics work at runtime
- ✅ Generic interfaces
- ✅ Raw types and why to avoid them

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Generic class` | class Pair<A, B> { } — type-safe container. Compiler enforces types. |
| `Type parameter` | <T> is a placeholder. Could be any letter but T (Type), E (Element), K/V (Key/Value) are conventions. |
| `Bounded wildcard` | <? extends Number> accepts Number or any subclass. <? super Integer> accepts Integer or superclass. |
| `Generic method` | public <T extends Comparable<T>> T max(T a, T b) — method has its OWN type parameter. |
| `Type erasure` | Generics are a compile-time feature. At runtime, all generic types become Object (or bound). No List<Integer>.class. |
| `PECS` | Producer Extends, Consumer Super. List<? extends T> = read from. List<? super T> = write to. |
| `Raw types` | List instead of List<String>. Unsafe — no type checking. Avoid in all modern code. |
| `Reifiable types` | Types fully available at runtime: int[], String, Object. Not: List<String>, T. |

---

## 📁 Files in This Project

```
day-17-generics/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-17-generics
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Generic Data Structures** — Generic Stack<T>, Pair<A,B>, generic sort, generic binary search

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

**Day 18** continues building on today's concepts. Keep the momentum!
