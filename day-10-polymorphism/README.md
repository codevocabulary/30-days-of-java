# ☕ Day 10 — Polymorphism

<div align="center">

![Day](https://img.shields.io/badge/Day-10%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Polymorphism-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Shape%20Area%20Calculator-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ What polymorphism means — many forms
- ✅ Runtime polymorphism — method overriding
- ✅ Compile-time polymorphism — method overloading
- ✅ Upcasting — treating subclass as superclass
- ✅ Downcasting — converting back to subclass
- ✅ instanceof operator for safe casting
- ✅ Dynamic method dispatch — how JVM picks the right method
- ✅ Polymorphic arrays and lists
- ✅ Covariant return types

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Polymorphism` | Same method name, different behavior based on actual object type at runtime. |
| `Runtime polymorphism` | JVM decides WHICH method to call based on actual object type, not reference type. |
| `Upcasting` | Animal a = new Dog(); — safe, automatic. You can only call Animal methods on 'a'. |
| `Downcasting` | Dog d = (Dog) a; — manual, RISKY. Must ensure actual object IS a Dog. Use instanceof first. |
| `instanceof` | if (animal instanceof Dog d) { d.bark(); } — safe check before casting (Java 16 pattern matching). |
| `Dynamic dispatch` | Animal a = new Dog(); a.speak() — JVM calls Dog's speak(), not Animal's. At RUNTIME. |
| `Polymorphic array` | Animal[] zoo = { new Dog(), new Cat(), new Bird() }; — one array, many types. |
| `Covariant return` | Override can return a subtype: Animal's getAnimal() returns Animal, Dog's returns Dog. |

---

## 📁 Files in This Project

```
day-10-polymorphism/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-10-polymorphism
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Shape Area Calculator** — Shape hierarchy: calculate areas and perimeters for all shapes polymorphically

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

**Day 11** continues building on today's concepts. Keep the momentum!
