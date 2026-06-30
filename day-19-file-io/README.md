# ☕ Day 19 — File I/O

<div align="center">

![Day](https://img.shields.io/badge/Day-19%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Upper--Intermediate-yellow?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-File%20I/O-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Note-Taking%20App-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ File class — check existence, create, delete
- ✅ Reading files — FileReader, BufferedReader
- ✅ Writing files — FileWriter, BufferedWriter, PrintWriter
- ✅ NIO.2 — Path, Paths, Files (Java 7+)
- ✅ Reading all lines with Files.readAllLines()
- ✅ Writing with Files.writeString()
- ✅ Appending to files
- ✅ Walking directory trees with Files.walk()
- ✅ Serialization — saving objects to files

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `File class` | java.io.File — represents file/directory path. exists(), isFile(), isDirectory(), length(). |
| `BufferedReader` | Reads text efficiently line by line. Always wrap FileReader in BufferedReader for performance. |
| `BufferedWriter` | Writes text efficiently. Always close (or use try-with-resources) to flush buffer. |
| `NIO.2 (java.nio.file)` | Modern API. Path = immutable path object. Files = utility class. Much cleaner than java.io. |
| `Files.readAllLines()` | Reads ENTIRE file into List<String>. Easy but loads ALL content into memory. |
| `Files.writeString()` | Writes String to file in one line. SimpleAPI for modern Java. |
| `Append mode` | new FileWriter(file, true) — second arg true = append. Don't overwrite! |
| `try-with-resources` | Always use for file I/O: try(var reader = Files.newBufferedReader(path)) { } |

---

## 📁 Files in This Project

```
day-19-file-io/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-19-file-io
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Note-Taking App** — Note-taking app: create, read, list, search, delete notes stored as files

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

**Day 20** continues building on today's concepts. Keep the momentum!
