# ☕ Day 09 — Inheritance

<div align="center">

![Day](https://img.shields.io/badge/Day-09%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Inheritance-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Animal%20Kingdom-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ extends keyword — class hierarchy
- ✅ Superclass and subclass relationship
- ✅ Method overriding with @Override annotation
- ✅ The super keyword — access parent
- ✅ Constructor chaining with super()
- ✅ protected access modifier
- ✅ Inheritance and the IS-A relationship
- ✅ What is NOT inherited
- ✅ final class and final method
- ✅ The Object class — root of all Java classes

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `extends` | class Dog extends Animal — Dog IS-A Animal. Dog inherits all non-private members. |
| `Method overriding` | @Override — subclass provides its own version of parent's method. Same signature. |
| `super keyword` | super.method() calls parent's version. super() calls parent constructor. Must be first line. |
| `protected` | Visible within same package AND subclasses. More open than private, less than public. |
| `Constructor chain` | Subclass constructor MUST call super() — explicitly or JVM inserts super() automatically. |
| `IS-A vs HAS-A` | Inheritance = IS-A (Dog IS-A Animal). Composition = HAS-A (Car HAS-A Engine). |
| `Object class` | All Java classes implicitly extend Object. Provides: equals(), hashCode(), toString(), clone(). |
| `final` | final class = cannot be subclassed. final method = cannot be overridden. |

---

## 📁 Files in This Project

```
day-09-inheritance/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-09-inheritance
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Animal Kingdom** — Animal → Mammal → Dog/Cat, Bird → Eagle/Parrot with polymorphic behaviors

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

**Day 10** continues building on today's concepts. Keep the momentum!
