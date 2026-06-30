# ☕ Day 07 — Arrays

<div align="center">

![Day](https://img.shields.io/badge/Day-07%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-green?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Arrays-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Student%20Score%20Manager-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Declaring and initializing arrays
- ✅ Accessing elements by index
- ✅ Array length property
- ✅ Multi-dimensional (2D) arrays
- ✅ Arrays class utility methods — sort, fill, copyOf, binarySearch
- ✅ Array traversal with for and for-each
- ✅ Common array problems
- ✅ Limitations of arrays — why ArrayList exists

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Array declaration` | int[] arr = new int[5]; or int[] arr = {1,2,3}. Size is FIXED after creation. |
| `Zero-indexed` | First element is arr[0]. Last is arr[arr.length - 1]. arr[arr.length] = ArrayIndexOutOfBoundsException! |
| `2D arrays` | int[][] matrix = new int[rows][cols]. Access: matrix[row][col]. |
| `Arrays.sort()` | Sorts array IN-PLACE. Uses Dual-Pivot Quicksort for primitives. O(n log n). |
| `Arrays.binarySearch()` | Finds index of element in SORTED array. O(log n). Must sort first! |
| `Arrays.copyOf()` | Creates new array of given length. Copies elements. Useful for resizing. |
| `Arrays.fill()` | Fills all elements with a value. arr[0..n] = value. |
| `Limitations` | Fixed size. Cannot grow. Cannot shrink. ArrayList solves this (Day 15). |

---

## 📁 Files in This Project

```
day-07-arrays/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── HOW_TO_RUN.md
```

---

## 🚀 How to Compile & Run

```bash
cd day-07-arrays
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Student Score Manager** — Student score manager: store, sort, search, average, min/max scores

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

**Day 08** continues building on today's concepts. Keep the momentum!
