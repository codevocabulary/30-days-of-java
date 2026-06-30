# ☕ Day 13 — String Deep Dive

<div align="center">

![Day](https://img.shields.io/badge/Day-13%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-String%20Deep%20Dive-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Text%20Analyzer-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ String immutability — why Strings don't change
- ✅ String pool and memory optimization
- ✅ All essential String methods
- ✅ String comparison — equals vs ==
- ✅ StringBuilder — efficient string building
- ✅ StringBuffer — thread-safe StringBuilder
- ✅ String.format() and formatted()
- ✅ Regular expressions with String
- ✅ String.join() and String.valueOf()
- ✅ Converting between String and other types

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Immutability` | Strings NEVER change. Methods return NEW strings. Original untouched. Thread-safe. |
| `String Pool` | JVM keeps one copy of each string literal. 'Java' == 'Java' is true (same pool object). |
| `Common methods` | length(), charAt(), substring(), indexOf(), contains(), replace(), split(), trim(), strip(). |
| `equals vs ==` | equals() compares content (characters). == compares references (memory addresses). |
| `StringBuilder` | Mutable string buffer. Use for building strings in loops. Much faster than + in loops. |
| `StringBuffer` | Like StringBuilder but synchronized (thread-safe). Use only when threading is needed. |
| `String.format()` | String.format('%s is %d', name, age) — template-based string creation. |
| `split()` | str.split(',') returns String[]. Uses regex. split('\\s+') splits on any whitespace. |

---

## 📁 Files in This Project

```
day-13-string-operations/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-13-string-operations
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Text Analyzer** — Text analyzer: word count, char frequency, palindrome check, word frequency map

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

**Day 14** continues building on today's concepts. Keep the momentum!
