# ☕ Day 24 — Design Patterns — Creational

<div align="center">

![Day](https://img.shields.io/badge/Day-24%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Design%20Patterns%20--%20Creational-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Configuration%20Manager-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Why design patterns matter
- ✅ Singleton — one instance only
- ✅ Factory Method — delegate object creation
- ✅ Abstract Factory — families of objects
- ✅ Builder — step-by-step complex object construction
- ✅ Prototype — cloning objects
- ✅ Object Pool — reusing expensive objects
- ✅ Static Factory Methods

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Singleton` | Private constructor. Private static instance. Public static getInstance(). Thread-safe with double-checked locking. |
| `Factory Method` | Superclass defines creation method. Subclasses decide which class to instantiate. |
| `Builder` | Separate construction from representation. Fluent API: new Builder().name('Alice').age(25).build(). |
| `Prototype` | Clone existing object instead of creating from scratch. Implement Cloneable or copy constructor. |
| `When to use Singleton` | Database connections, configuration, logging, thread pools. NOT for everything! |
| `Builder benefits` | Avoids telescoping constructors. Readable. Validates before creating object. |
| `Factory benefits` | Hides instantiation details. Easy to switch implementations. Open/Closed Principle. |
| `Anti-patterns` | Singleton can become global state (bad for testing). Builder overkill for simple objects. |

---

## 📁 Files in This Project

```
day-24-design-patterns-creational/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-24-design-patterns-creational
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Configuration Manager** — App configuration using Singleton + Builder for config objects + Factory for validators

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

**Day 25** continues building on today's concepts. Keep the momentum!
