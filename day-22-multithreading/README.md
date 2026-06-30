# ☕ Day 22 — Multithreading

<div align="center">

![Day](https://img.shields.io/badge/Day-22%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Multithreading-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Concurrent%20Download%20Simulator-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Process vs Thread
- ✅ Creating threads — Thread class and Runnable interface
- ✅ Thread lifecycle — NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
- ✅ Thread methods — start, join, sleep, interrupt
- ✅ Race conditions and why they happen
- ✅ synchronized keyword — mutual exclusion
- ✅ volatile keyword
- ✅ Deadlock — what it is and how to prevent
- ✅ Thread priority
- ✅ Daemon threads

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Thread` | Lightweight unit of execution within a process. Shares memory with other threads in same process. |
| `Runnable` | Functional interface. Implement run() method. Pass to Thread constructor. Preferred over extending Thread. |
| `start() vs run()` | start() creates new thread and calls run() in it. run() alone just executes in CURRENT thread! |
| `join()` | thread.join() makes current thread WAIT until 'thread' finishes. Essential for coordination. |
| `Race condition` | Two threads read-modify-write same variable simultaneously. Result is unpredictable. |
| `synchronized` | Only one thread at a time can execute synchronized block/method. Uses object's monitor lock. |
| `volatile` | Guarantees visibility — changes to volatile variable are immediately visible to all threads. |
| `Deadlock` | Thread A holds Lock1, waits for Lock2. Thread B holds Lock2, waits for Lock1. Both stuck forever. |

---

## 📁 Files in This Project

```
day-22-multithreading/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-22-multithreading
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Concurrent Download Simulator** — Simulates concurrent file downloads with progress tracking and thread coordination

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

**Day 23** continues building on today's concepts. Keep the momentum!
