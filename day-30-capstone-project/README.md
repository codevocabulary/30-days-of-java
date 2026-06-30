# ☕ Day 30 — Capstone — Library Management System

<div align="center">

![Day](https://img.shields.io/badge/Day-30%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Capstone%20--%20Library%20Management%20System-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Full%20Library%20System-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Multi-layer architecture: model, repository, service, UI layers
- ✅ Full OOP design with inheritance and interfaces
- ✅ Collections for data management (ArrayList, HashMap)
- ✅ Exception handling throughout the system
- ✅ File persistence — save/load data
- ✅ Stream API for queries and reports
- ✅ Design patterns: Singleton, Repository, Strategy
- ✅ JUnit tests for core business logic
- ✅ Clean code: SOLID principles, meaningful names

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Architecture` | Separate concerns: Model (data), Repository (persistence), Service (business logic), Main (UI). |
| `SOLID principles` | Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion. |
| `Repository pattern` | Abstracts data access. LibraryRepository interface — can swap file, DB, or in-memory impl. |
| `Service layer` | Business logic. LibraryService uses repository. Doesn't know/care how data is stored. |
| `Stream queries` | books.stream().filter(Book::isAvailable).sorted(Comparator.comparing(Book::getTitle)).collect(toList()) |
| `Exception strategy` | Custom exceptions per domain: BookNotFoundException, BookAlreadyBorrowedException. |
| `Testing` | Unit test services with mock repositories. Integration test file persistence. |
| `Design patterns used` | Singleton (LibrarySystem), Repository, Strategy (search strategies), Observer (notifications). |

---

## 📁 Files in This Project

```
day-30-capstone-project/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-30-capstone-project
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Full Library System** — Complete Library Management System with books, members, lending, reports, and file persistence

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

🎉 **You've completed all 30 days!** You now have a solid foundation in Java from basics to advanced. Keep building projects!
