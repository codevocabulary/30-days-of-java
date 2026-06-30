# ☕ Day 11 — Abstract Classes & Interfaces

<div align="center">

![Day](https://img.shields.io/badge/Day-11%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Abstract%20Classes%20%26%20Interfaces-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Payment%20System-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ abstract class — partially implemented blueprint
- ✅ abstract method — no body, must override
- ✅ interface — pure contract (before Java 8)
- ✅ default methods in interfaces (Java 8+)
- ✅ static methods in interfaces (Java 8+)
- ✅ Implementing multiple interfaces
- ✅ interface vs abstract class — when to use which
- ✅ Functional interfaces
- ✅ Marker interfaces
- ✅ Interface inheritance

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `abstract class` | Cannot be instantiated. May have abstract methods (no body) and concrete methods. |
| `abstract method` | Has no body. Subclass MUST implement it or also be abstract. |
| `interface` | All methods implicitly public abstract (before Java 8). Defines a contract. |
| `default methods` | interface method with body. Allows adding methods without breaking existing implementations. |
| `implements` | class Dog implements Swimmable — Dog agrees to provide all interface methods. |
| `Multiple interfaces` | class Duck extends Bird implements Swimmable, Flyable — Java's multiple inheritance. |
| `abstract vs interface` | Use abstract class for IS-A with shared code. Use interface for CAN-DO contracts. |
| `Functional interface` | @FunctionalInterface — exactly one abstract method. Used with lambdas (Day 20). |

---

## 📁 Files in This Project

```
day-11-abstract-classes-interfaces/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-11-abstract-classes-interfaces
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Payment System** — Payment system: CreditCard, DebitCard, UPI all implementing Payable interface

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

**Day 12** continues building on today's concepts. Keep the momentum!
