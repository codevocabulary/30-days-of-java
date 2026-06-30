# ☕ Day 04 — Control Flow

<div align="center">

![Day](https://img.shields.io/badge/Day-04%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-green?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Control%20Flow-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Grade%20Classifier-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ if, else if, else blocks
- ✅ switch statement (traditional and expression form)
- ✅ Ternary operator for inline decisions
- ✅ Pattern matching with instanceof (Java 16+)
- ✅ Enhanced switch expressions (Java 14+)
- ✅ Fall-through in switch and when to use it
- ✅ Nested if-else vs switch — when to choose which

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `if/else` | Evaluates a boolean condition. else if chains test multiple conditions in order. |
| `switch (traditional)` | Tests one value against multiple cases. break prevents fall-through. |
| `switch expression (Java 14+)` | Returns a value. Uses -> arrow syntax. No fall-through by default. |
| `Ternary` | result = condition ? valueA : valueB — best for simple, readable inline conditions. |
| `Pattern matching instanceof` | if (obj instanceof String s) { } — casts AND tests in one line. |
| `Fall-through` | Without break, execution continues to next case. Useful for multiple cases doing same thing. |
| `Best practices` | Prefer switch expression for modern code. Use if/else for complex boolean conditions. |

---

## 📁 Files in This Project

```
day-04-control-flow/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── HOW_TO_RUN.md
```

---

## 🚀 How to Compile & Run

```bash
cd day-04-control-flow
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Grade Classifier** — Grade classifier + Day-of-week descriptor + season finder

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

**Day 05** continues building on today's concepts. Keep the momentum!
