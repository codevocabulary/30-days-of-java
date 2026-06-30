# ☕ Day 15 — Collections Framework — List

<div align="center">

![Day](https://img.shields.io/badge/Day-15%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Upper--Intermediate-yellow?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Collections%20Framework%20--%20List-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Shopping%20Cart-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ The Collections Framework overview
- ✅ List interface — ordered, allows duplicates
- ✅ ArrayList — dynamic array, O(1) random access
- ✅ LinkedList — doubly linked, O(1) insert/delete at ends
- ✅ Iterator and ListIterator
- ✅ Collections utility class methods
- ✅ Sorting with Comparator and Comparable
- ✅ Sublist, contains, indexOf operations
- ✅ Converting arrays to lists and back
- ✅ Unmodifiable lists

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `ArrayList` | Backed by array. O(1) get(i). O(n) insert/delete in middle. Best for most cases. |
| `LinkedList` | Doubly linked nodes. O(1) add/remove at ends. O(n) get(i). Use for Queue/Deque. |
| `List interface` | Ordered collection. Allows duplicates. Index-based access. Extends Collection. |
| `Iterator` | Safe removal during iteration. hasNext()/next()/remove(). Avoids ConcurrentModificationException. |
| `Collections.sort()` | Sorts List. Uses merge sort. Requires Comparable or Comparator. |
| `Comparable` | class Student implements Comparable<Student> { public int compareTo(Student o) {} } |
| `Comparator` | Separate comparison logic. Can have multiple: byName, byAge, bySalary. Lambda-friendly. |
| `List.of()` | Creates immutable list. Cannot add/remove. Perfect for constant data. |

---

## 📁 Files in This Project

```
day-15-collections-list/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-15-collections-list
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Shopping Cart** — Shopping cart: add items, remove, sort by price/name, calculate total, apply discounts

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

**Day 16** continues building on today's concepts. Keep the momentum!
