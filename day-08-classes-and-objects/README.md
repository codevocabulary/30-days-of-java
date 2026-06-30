# ☕ Day 08 — Classes & Objects

<div align="center">

![Day](https://img.shields.io/badge/Day-08%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Classes%20%26%20Objects-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Bank%20Account%20System-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Class declaration and object instantiation
- ✅ Fields (instance variables) — state
- ✅ Methods — behavior
- ✅ Constructors — no-arg, parameterized, copy
- ✅ The 'this' keyword — referring to current object
- ✅ Encapsulation — private fields + public methods
- ✅ Multiple constructors (constructor overloading)
- ✅ The toString() method
- ✅ Static fields and methods (class-level vs instance-level)
- ✅ Object creation in memory (heap)

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Class vs Object` | Class = blueprint (Cookie Cutter). Object = instance (the Cookie). new creates objects. |
| `Fields` | Variables declared in class body. Each object gets its OWN copy. Represent STATE. |
| `Methods` | Functions in a class. Define BEHAVIOR. Can access all fields of the same object. |
| `Constructor` | Special method called with 'new'. Same name as class. No return type. Initializes object. |
| `this keyword` | Refers to the CURRENT object. Disambiguates field vs parameter with same name. |
| `Encapsulation` | Make fields private. Access only through public methods. Protects data integrity. |
| `toString()` | Override to provide meaningful string representation. Auto-called by println(). |
| `static` | Belongs to CLASS, not instance. Shared by all objects. Call via ClassName.method(). |

---

## 📁 Files in This Project

```
day-08-classes-and-objects/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-08-classes-and-objects
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Bank Account System** — Full Bank Account system: deposit, withdraw, transfer, history, balance

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

**Day 09** continues building on today's concepts. Keep the momentum!
