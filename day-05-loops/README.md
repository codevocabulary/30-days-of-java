# ☕ Day 05 — Loops

<div align="center">

![Day](https://img.shields.io/badge/Day-05%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-green?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Loops-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Pattern%20Printer%20&%20FizzBuzz-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ for loop — syntax and use cases
- ✅ while loop — when to use vs for
- ✅ do-while loop — guaranteed first execution
- ✅ Enhanced for-each loop
- ✅ break — exit loop immediately
- ✅ continue — skip current iteration
- ✅ Labeled break/continue for nested loops
- ✅ Nested loops — multiplication tables, patterns
- ✅ Infinite loops and how to avoid them
- ✅ Loop performance considerations

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `for loop` | for(init; condition; update). Best when number of iterations is known. |
| `while loop` | while(condition). Best when iterations depend on runtime state, not a counter. |
| `do-while` | do { } while(condition). Body executes at LEAST once before condition is checked. |
| `for-each (enhanced for)` | for(Type item : collection). Cleaner iteration. Cannot modify index. |
| `break` | Immediately exits the innermost loop. With label, exits outer loop. |
| `continue` | Skips rest of current iteration, jumps to next iteration. |
| `Nested loops` | Loop inside a loop. Outer × inner iterations. Used for 2D data, patterns. |
| `Labels` | outerLoop: for(...) { for(...) { break outerLoop; } }. Rarely needed but powerful. |

---

## 📁 Files in This Project

```
day-05-loops/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── HOW_TO_RUN.md
```

---

## 🚀 How to Compile & Run

```bash
cd day-05-loops
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Pattern Printer & FizzBuzz** — Pyramid patterns + FizzBuzz + multiplication table + prime number finder

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

**Day 06** continues building on today's concepts. Keep the momentum!
