# ☕ Day 27 — JDBC & Databases

<div align="center">

![Day](https://img.shields.io/badge/Day-27%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-JDBC%20%26%20Databases-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Contact%20Book%20with%20SQLite-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ JDBC architecture — DriverManager, Connection, Statement, ResultSet
- ✅ Loading JDBC driver and establishing connection
- ✅ Executing SQL — Statement vs PreparedStatement
- ✅ SQL injection — why PreparedStatement is essential
- ✅ ResultSet — reading query results
- ✅ CRUD operations
- ✅ Transactions — commit and rollback
- ✅ Connection pooling concepts
- ✅ Handling SQLExceptions
- ✅ Closing resources properly

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `JDBC` | Java Database Connectivity. Standard API to connect any Java app to any database. |
| `Connection` | DriverManager.getConnection(url, user, pass) — opens database connection. Expensive — close when done. |
| `PreparedStatement` | Pre-compiled SQL with ? placeholders. PREVENTS SQL injection. Faster for repeated queries. |
| `SQL injection` | Never concatenate user input into SQL! 'DROP TABLE users' --. Use PreparedStatement ALWAYS. |
| `ResultSet` | Cursor over query results. next() moves forward. getInt/getString/getDouble(columnName) reads data. |
| `Transaction` | connection.setAutoCommit(false) → do work → commit() or rollback(). All-or-nothing. |
| `try-with-resources` | try(Connection c = ...; PreparedStatement ps = ...) {} — auto-closes everything. |
| `SQLite` | File-based SQL database. No server needed. Perfect for desktop apps and learning JDBC. |

---

## 📁 Files in This Project

```
day-27-jdbc-and-databases/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-27-jdbc-and-databases
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Contact Book with SQLite** — SQLite contact book: CRUD contacts, search, sort, transaction-based batch import

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

**Day 28** continues building on today's concepts. Keep the momentum!
