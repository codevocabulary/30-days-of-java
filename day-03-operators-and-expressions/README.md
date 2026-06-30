# ☕ Day 03 — Operators & Expressions

<div align="center">

![Day](https://img.shields.io/badge/Day-03%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-green?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Operators%20%26%20Expressions-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Calculator%20App-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Arithmetic operators (+, -, *, /, %)
- ✅ Integer division vs float division
- ✅ Increment/Decrement (++, --) pre vs post
- ✅ Assignment operators (+=, -=, *=, /=, %=)
- ✅ Relational operators (==, !=, <, >, <=, >=)
- ✅ Logical operators (&&, ||, !)
- ✅ Bitwise operators (&, |, ^, ~, <<, >>, >>>)
- ✅ Ternary operator ? :
- ✅ Operator precedence and parentheses
- ✅ Type promotion in expressions

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Arithmetic` | Java's / with integers = integer division (5/2=2, not 2.5)! Cast to double first. |
| `Modulus %` | Returns the remainder. 10%3=1. Used to check even/odd, wrap around arrays. |
| `Pre/Post increment` | ++i increments THEN returns. i++ returns THEN increments. |
| `Compound assignment` | x += 5 means x = x + 5. Shorter and slightly more efficient. |
| `Relational operators` | Always return boolean. == compares values of primitives (not objects!). |
| `Logical && ||` | && (AND): both must be true. || (OR): at least one true. Short-circuit evaluation. |
| `Bitwise` | & | ^ work on individual bits. << shifts left (multiply by 2). >> shifts right (divide by 2). |
| `Ternary ? :` | condition ? valueIfTrue : valueIfFalse — compact if/else for single expressions. |
| `Precedence` | () > ++ -- > * / % > + - > << >> > == != > & > ^ > | > && > || > ? : > = |

---

## 📁 Files in This Project

```
day-03-operators-and-expressions/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── HOW_TO_RUN.md
```

---

## 🚀 How to Compile & Run

```bash
cd day-03-operators-and-expressions
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Calculator App** — Full console calculator with all arithmetic operations and history

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

**Day 04** continues building on today's concepts. Keep the momentum!
