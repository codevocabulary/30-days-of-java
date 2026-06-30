# ☕ Day 12 — Encapsulation & Access Modifiers

<div align="center">

![Day](https://img.shields.io/badge/Day-12%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Encapsulation%20%26%20Access%20Modifiers-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Employee%20Management-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ private, protected, public, package-private (default) modifiers
- ✅ Getters and setters — controlled access
- ✅ Why encapsulation matters — data integrity
- ✅ Immutable classes — making objects unchangeable
- ✅ Builder pattern preview
- ✅ Data validation in setters
- ✅ Final fields and constructor injection
- ✅ Defensive copying for mutable objects

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `private` | Only accessible WITHIN the same class. Strongest restriction. Use for ALL fields. |
| `package-private (default)` | No keyword. Accessible within same package only. |
| `protected` | Accessible within same package AND all subclasses. |
| `public` | Accessible from EVERYWHERE. Use sparingly. Only for intentional public API. |
| `Getters/Setters` | Controlled read/write access. Setters can VALIDATE before changing. |
| `Immutable class` | All fields final, no setters, only constructor init. Thread-safe by default. |
| `Data validation` | Setter checks: if (salary < 0) throw new IllegalArgumentException(). |
| `Defensive copy` | Return new object instead of internal reference to prevent external modification. |

---

## 📁 Files in This Project

```
day-12-encapsulation-and-access/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-12-encapsulation-and-access
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Employee Management** — Employee management with validation, immutable records, controlled access

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

**Day 13** continues building on today's concepts. Keep the momentum!
