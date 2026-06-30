# ☕ Day 06 — Methods

<div align="center">

![Day](https://img.shields.io/badge/Day-06%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-green?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Methods-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Math%20Utility%20Library-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Defining and calling methods
- ✅ Method parameters and return types
- ✅ Method overloading — same name, different parameters
- ✅ Static vs instance methods
- ✅ Recursion — methods calling themselves
- ✅ Varargs — variable number of arguments
- ✅ Pass by value — Java always passes by value
- ✅ Scope of variables inside methods
- ✅ The call stack — how Java tracks method calls

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Method syntax` | accessModifier returnType methodName(params) { body }. void = returns nothing. |
| `Method overloading` | Multiple methods with same name but different parameter lists. Java picks by signature. |
| `static methods` | Called on the class itself (Math.sqrt). No object needed. Cannot access instance fields. |
| `Recursion` | Method calls itself with smaller input. MUST have a base case to stop (else StackOverflow!). |
| `Varargs` | method(int... nums) accepts any number of ints. Inside, nums is an array. |
| `Pass by value` | Java copies primitive values. Object references are copied — but they point to SAME object. |
| `Call stack` | Each method call adds a frame. When it returns, frame is removed. Stack Overflow = too deep. |

---

## 📁 Files in This Project

```
day-06-methods/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── HOW_TO_RUN.md
```

---

## 🚀 How to Compile & Run

```bash
cd day-06-methods
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Math Utility Library** — Math utility library: factorial, fibonacci, power, GCD, LCM, prime check

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

**Day 07** continues building on today's concepts. Keep the momentum!
