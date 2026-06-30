# ☕ Day 16 — Collections — Map & Set

<div align="center">

![Day](https://img.shields.io/badge/Day-16%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Upper--Intermediate-yellow?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Collections%20--%20Map%20%26%20Set-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Word%20Frequency%20Counter-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Map interface — key-value pairs
- ✅ HashMap — O(1) operations, unordered
- ✅ LinkedHashMap — insertion-order preserved
- ✅ TreeMap — sorted by key
- ✅ Set interface — unique elements only
- ✅ HashSet — O(1) operations, unordered
- ✅ TreeSet — sorted, O(log n)
- ✅ Iterating maps (entrySet, keySet, values)
- ✅ Map.getOrDefault, computeIfAbsent, merge, forEach

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `HashMap` | Key-value store. O(1) average for get/put/remove. Unordered. Allows null key. Not thread-safe. |
| `LinkedHashMap` | HashMap + insertion order. Slightly slower. Use when order matters. |
| `TreeMap` | Sorted by key (natural order or Comparator). O(log n). Use for sorted key traversal. |
| `HashSet` | Unique elements. O(1) add/contains/remove. Backed by HashMap internally. |
| `TreeSet` | Sorted unique elements. O(log n). Implements NavigableSet — floor, ceiling, headSet, tailSet. |
| `Map iteration` | map.entrySet() returns Set<Map.Entry<K,V>>. map.forEach((k,v) -> ...) is cleanest. |
| `getOrDefault` | map.getOrDefault(key, 0) — returns 0 if key not found. Avoids null checks. |
| `computeIfAbsent` | map.computeIfAbsent(key, k -> new ArrayList<>()) — create value if key absent. |

---

## 📁 Files in This Project

```
day-16-collections-map-set/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-16-collections-map-set
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Word Frequency Counter** — Word frequency analyzer: count words, find top-N, group by length, sort by frequency

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

**Day 17** continues building on today's concepts. Keep the momentum!
