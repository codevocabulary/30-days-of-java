# ☕ Day 23 — Concurrency Utilities

<div align="center">

![Day](https://img.shields.io/badge/Day-23%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Concurrency%20Utilities-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Thread%20Pool%20Task%20Manager-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ ExecutorService — thread pool management
- ✅ Executors factory methods
- ✅ Future<T> — result of async computation
- ✅ Callable<T> vs Runnable
- ✅ CompletableFuture — modern async programming
- ✅ CountDownLatch — wait for N events
- ✅ CyclicBarrier — synchronize N threads
- ✅ Semaphore — limit concurrent access
- ✅ ConcurrentHashMap — thread-safe map
- ✅ BlockingQueue — producer-consumer pattern

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `ExecutorService` | Manages a pool of threads. Submit tasks, get results, shutdown cleanly. Prefer over raw Thread. |
| `Executors.newFixedThreadPool(n)` | Creates pool of n threads. Tasks queue when all threads busy. Most common choice. |
| `Future<T>` | Handle to async result. future.get() blocks until done. future.isDone() checks without blocking. |
| `Callable<T>` | Like Runnable but returns value and can throw. Use with ExecutorService.submit(). |
| `CompletableFuture` | Modern. Chain async operations. thenApply, thenCompose, whenComplete. No blocking needed. |
| `CountDownLatch` | Countdown from N to 0. Waiting thread released when count hits 0. One-time use. |
| `ConcurrentHashMap` | Thread-safe HashMap. Uses segment locking. Better throughput than synchronized HashMap. |
| `BlockingQueue` | Queue that blocks on take() when empty, and on put() when full. Perfect for producer-consumer. |

---

## 📁 Files in This Project

```
day-23-concurrency-utilities/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-23-concurrency-utilities
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Thread Pool Task Manager** — Task manager with thread pool, futures, CompletableFuture chains, async results

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

**Day 24** continues building on today's concepts. Keep the momentum!
