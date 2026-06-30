# ☕ Day 18 — Exception Handling

<div align="center">

![Day](https://img.shields.io/badge/Day-18%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Upper--Intermediate-yellow?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Exception%20Handling-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Robust%20File%20Parser-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Exception hierarchy — Throwable, Error, Exception
- ✅ Checked vs Unchecked exceptions
- ✅ try-catch-finally blocks
- ✅ Multiple catch blocks and multi-catch (|)
- ✅ The throws declaration on methods
- ✅ throw — manually throwing exceptions
- ✅ Creating custom exception classes
- ✅ try-with-resources (AutoCloseable)
- ✅ Exception chaining — wrapping exceptions
- ✅ Best practices — what to catch and when

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Exception hierarchy` | Throwable → Error (JVM errors, don't catch) and Exception (program errors). |
| `Checked exceptions` | Must declare with throws or catch. IOException, SQLException. Compiler enforces. |
| `Unchecked exceptions` | RuntimeException subclasses. NullPointerException, ArrayIndexOutOfBoundsException. |
| `try-catch-finally` | try{risky} catch(Exception e){handle} finally{always runs — cleanup!}. |
| `Multi-catch` | catch(IOException | SQLException e) — handle multiple exception types the same way. |
| `Custom exceptions` | class InsufficientFundsException extends RuntimeException { }. Add context. |
| `try-with-resources` | try(InputStream is = new FileInputStream(f)) { } — auto-closes resources. No finally needed. |
| `Exception chaining` | throw new ServiceException('Failed', originalException) — preserves original cause. |

---

## 📁 Files in This Project

```
day-18-exception-handling/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-18-exception-handling
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Robust File Parser** — File parser with custom exceptions, validation, and graceful error handling

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

**Day 19** continues building on today's concepts. Keep the momentum!
