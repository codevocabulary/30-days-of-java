# ☕ Day 14 — Enums & Records

<div align="center">

![Day](https://img.shields.io/badge/Day-14%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Enums%20%26%20Records-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Task%20Manager-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ enum basics — named constants
- ✅ enum with fields and methods
- ✅ enum constructors
- ✅ enum abstract methods
- ✅ Iterating over enum values
- ✅ enum in switch statements
- ✅ record classes (Java 16+) — immutable data carriers
- ✅ Compact constructors in records
- ✅ Sealed classes (Java 17+)
- ✅ Pattern matching with records

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `enum` | Type-safe constants. Better than int/String constants. Each value is an object. |
| `enum fields` | enum can have fields, constructors, methods. Constructor is always private. |
| `enum methods` | name(), ordinal(), values(), valueOf(). Plus your own custom methods. |
| `enum in switch` | switch(direction) { case NORTH -> ... }. Compiler checks exhaustiveness. |
| `record` | record Point(int x, int y) {} — immutable data class. Auto-generates constructor, getters, equals, hashCode, toString. |
| `Compact constructor` | Validate record fields without boilerplate. record Range(int min, int max) { Range { if(min > max) throw...; } } |
| `Sealed class` | sealed class Shape permits Circle, Rectangle {}. Restricts which classes can extend. |
| `Benefits` | Enums replace magic numbers/strings. Records eliminate boilerplate data classes. |

---

## 📁 Files in This Project

```
day-14-enums-and-records/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-14-enums-and-records
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Task Manager** — Task manager with Status/Priority enums and Task records

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

**Day 15** continues building on today's concepts. Keep the momentum!
