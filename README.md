# ☕ 30 Days of Java — From Zero to Advanced

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Advanced-blue?style=for-the-badge)
![Days](https://img.shields.io/badge/Days-30-orange?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Projects](https://img.shields.io/badge/Projects-30-red?style=for-the-badge)

**A complete, project-based Java course. One real project every day. Every concept explained from scratch.**

[📖 Start Learning](#-day-by-day-index) • [⚡ Quick Setup](#-prerequisites--setup) • [🗺️ Roadmap](#️-course-roadmap)

</div>

---

## 📖 What Is This Course?

This repository is a **structured 30-day Java learning journey**. Every single day contains:

- 📄 A **detailed `README.md`** — explains every concept from scratch with real-world analogies, diagrams, and examples
- 💻 A fully **commented `Main.java`** (and supporting files) — every single line of code is explained
- 🛠 A **complete mini project** that applies everything learned
- 💪 **Challenges** at the end of each day to push your understanding
- 📚 **Further reading** links for deep dives

This is not a tutorial where you copy code. **Every line is explained so you understand WHY it works.**

---

## 🗺️ Course Roadmap

| Week | Days | Level | Theme |
|------|------|-------|-------|
| **Week 1** | 01–07 | 🟢 Beginner | Java Fundamentals — Syntax, Types, Control Flow |
| **Week 2** | 08–14 | 🔵 Intermediate | OOP — Classes, Inheritance, Polymorphism, Interfaces |
| **Week 3** | 15–21 | 🟡 Upper-Intermediate | Collections, Generics, Exceptions, File I/O, Streams |
| **Week 4** | 22–30 | 🔴 Advanced | Multithreading, Networking, Design Patterns, Databases, Capstone |

---

## 📅 Day-by-Day Index

### 🟢 Week 1 — Java Fundamentals

| Day | Topic | Project | Key Concepts |
|-----|-------|---------|-------------|
| [Day 01](./day-01-setup-and-hello-world/) | Setup & Hello World | Hello World CLI | JDK, JVM, JRE, compilation, `main` method |
| [Day 02](./day-02-variables-and-data-types/) | Variables & Data Types | Personal Info Card | Primitives, wrapper classes, type casting |
| [Day 03](./day-03-operators-and-expressions/) | Operators & Expressions | Calculator | Arithmetic, relational, logical, bitwise |
| [Day 04](./day-04-control-flow/) | Control Flow | Grade Classifier | if/else, switch, ternary, pattern matching |
| [Day 05](./day-05-loops/) | Loops | Pattern Printer + FizzBuzz | for, while, do-while, break, continue, labels |
| [Day 06](./day-06-methods/) | Methods | Math Utility Library | Method overloading, recursion, varargs, static |
| [Day 07](./day-07-arrays/) | Arrays | Student Score Manager | 1D/2D arrays, Arrays class, sorting, searching |

### 🔵 Week 2 — Object-Oriented Programming

| Day | Topic | Project | Key Concepts |
|-----|-------|---------|-------------|
| [Day 08](./day-08-classes-and-objects/) | Classes & Objects | Bank Account System | Class, object, constructor, `this`, encapsulation |
| [Day 09](./day-09-inheritance/) | Inheritance | Animal Kingdom | `extends`, `super`, method overriding, `@Override` |
| [Day 10](./day-10-polymorphism/) | Polymorphism | Shape Area Calculator | Runtime polymorphism, upcasting, downcasting |
| [Day 11](./day-11-abstract-classes-interfaces/) | Abstract & Interfaces | Payment System | `abstract`, `interface`, `implements`, `default` |
| [Day 12](./day-12-encapsulation-and-access/) | Encapsulation | Employee Management | Access modifiers, getters/setters, immutability |
| [Day 13](./day-13-string-operations/) | String Deep Dive | Text Analyzer | String, StringBuilder, StringBuffer, String pool |
| [Day 14](./day-14-enums-and-records/) | Enums & Records | Task Manager | `enum` with methods, `record`, sealed classes |

### 🟡 Week 3 — Collections, I/O & Streams

| Day | Topic | Project | Key Concepts |
|-----|-------|---------|-------------|
| [Day 15](./day-15-collections-list/) | Collections — List | Shopping Cart | ArrayList, LinkedList, Iterator, ListIterator |
| [Day 16](./day-16-collections-map-set/) | Collections — Map & Set | Word Frequency Counter | HashMap, TreeMap, HashSet, LinkedHashMap |
| [Day 17](./day-17-generics/) | Generics | Generic Data Structures | Type parameters, bounded wildcards, generic methods |
| [Day 18](./day-18-exception-handling/) | Exception Handling | File Parser with Safety | try/catch/finally, custom exceptions, multi-catch |
| [Day 19](./day-19-file-io/) | File I/O | Note-Taking App | File, Path, FileReader, BufferedReader, NIO.2 |
| [Day 20](./day-20-lambda-and-streams/) | Lambda & Streams | Data Analytics Pipeline | Lambda, Stream API, filter/map/reduce, Collectors |
| [Day 21](./day-21-optional-and-functional/) | Optional & Functional | Safe User Service | Optional, Function, Predicate, Consumer, Supplier |

### 🔴 Week 4 — Advanced Java

| Day | Topic | Project | Key Concepts |
|-----|-------|---------|-------------|
| [Day 22](./day-22-multithreading/) | Multithreading | Concurrent Download Simulator | Thread, Runnable, synchronized, volatile |
| [Day 23](./day-23-concurrency-utilities/) | Concurrency Utilities | Thread Pool Task Manager | ExecutorService, Future, CompletableFuture |
| [Day 24](./day-24-design-patterns-creational/) | Design Patterns I | Configuration Manager | Singleton, Factory, Builder, Prototype |
| [Day 25](./day-25-design-patterns-structural/) | Design Patterns II | E-Commerce System | Adapter, Decorator, Facade, Proxy |
| [Day 26](./day-26-design-patterns-behavioral/) | Design Patterns III | Event System | Observer, Strategy, Command, Template Method |
| [Day 27](./day-27-jdbc-and-databases/) | JDBC & Databases | Contact Book with SQLite | JDBC, SQL, PreparedStatement, ResultSet |
| [Day 28](./day-28-networking/) | Networking | Chat Application | Socket, ServerSocket, TCP/IP, multi-client |
| [Day 29](./day-29-junit-and-testing/) | JUnit 5 & Testing | Tested Library System | @Test, assertions, mocking, TDD |
| [Day 30](./day-30-capstone-project/) | Capstone Project | **Library Management System** | Full OOP + DB + Tests + Patterns |

---

## ⚡ Prerequisites & Setup

### Step 1 — Install Java (JDK 17+)

**Windows:**
```
https://adoptium.net — Download Eclipse Temurin JDK 17
```

**macOS:**
```bash
brew install openjdk@17
```

**Linux (Ubuntu/Debian):**
```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

Verify installation:
```bash
java --version
javac --version
```

### Step 2 — Install an IDE (Recommended)

| IDE | Best For | Download |
|-----|---------|----------|
| **IntelliJ IDEA Community** | Java (best overall) | [jetbrains.com](https://www.jetbrains.com/idea/download/) |
| **VS Code + Extension Pack for Java** | Lightweight | [code.visualstudio.com](https://code.visualstudio.com) |
| **Eclipse** | Traditional Java | [eclipse.org](https://www.eclipse.org/downloads/) |



## 📁 Repository Structure

```
30-days-java/
├── README.md                          ← You are here
├── day-01-setup-and-hello-world/
│   ├── README.md                      ← Full concept explanation
│   ├── Main.java                      ← Heavily commented code
│   └── package.md                     ← How to compile & run
├── day-02-variables-and-data-types/
│   ├── README.md
│   ├── Main.java
│   └── PersonCard.java                ← Supporting class
├── ...
└── day-30-capstone-project/
    ├── README.md
    ├── src/
    │   ├── Main.java
    │   ├── model/
    │   ├── service/
    │   ├── repository/
    │   └── util/
    └── ...
```

---

## 🧠 How to Get the Most From This Course

1. **Read the README first** — understand the concept before seeing code
2. **Type the code yourself** — don't copy-paste! Muscle memory matters
3. **Run and break things** — change values, introduce bugs, read error messages
4. **Comment in your own words** — rewrite comments to confirm understanding
5. **Do the challenges** — they're designed to be hard but achievable
6. **Build the project** — the mini project at the end of each day ties it all together

---

## 📊 Concept Coverage

```
Core Java ████████████████████ 100%
OOP       ████████████████████ 100%
Collections ██████████████████ 100%
Streams/Lambda ███████████████ 100%
Concurrency ████████████████   85%
Design Patterns ██████████████ 100%
Testing   ████████████████     80%
Databases ██████████████       75%
Networking █████████████       70%
```

---

<div align="center">

⭐ **Star this repo** if it helps you learn Java!

Made with ❤️ for Java learners worldwide.

</div>
