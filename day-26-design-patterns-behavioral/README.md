# ☕ Day 26 — Design Patterns — Behavioral

<div align="center">

![Day](https://img.shields.io/badge/Day-26%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Design%20Patterns%20--%20Behavioral-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Event%20System-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Observer — publish/subscribe event system
- ✅ Strategy — swap algorithms at runtime
- ✅ Command — encapsulate actions as objects
- ✅ Template Method — skeleton algorithm
- ✅ Iterator — traverse collections uniformly
- ✅ State — change behavior with state
- ✅ Chain of Responsibility — pass request along a chain
- ✅ Mediator — centralize communication

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Observer` | Subject notifies registered observers of state changes. EventListener in Java, event bus. Loose coupling. |
| `Strategy` | Define family of algorithms. Encapsulate each. Make them interchangeable. SortStrategy: Bubble, Quick, Merge. |
| `Command` | Encapsulate action as object. Supports undo/redo. Queuing. Logging. RemoteControl example. |
| `Template Method` | Superclass defines algorithm skeleton. Subclasses fill in specific steps. Don't call us, we'll call you. |
| `State` | Object changes behavior when state changes. TrafficLight: Red→Green→Yellow→Red. |
| `Iterator` | Sequential access to collection elements without exposing internal structure. Hashmaps, Trees. |
| `Chain of Responsibility` | Request passes through chain of handlers. Each handles or passes to next. Middleware! |
| `Mediator` | Objects communicate through mediator, not directly. Chat room: users talk through server. |

---

## 📁 Files in This Project

```
day-26-design-patterns-behavioral/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-26-design-patterns-behavioral
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Event System** — Full event system: Observer for events, Strategy for handlers, Command for undo/redo

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

**Day 27** continues building on today's concepts. Keep the momentum!
