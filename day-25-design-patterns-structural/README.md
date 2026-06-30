# ☕ Day 25 — Design Patterns — Structural

<div align="center">

![Day](https://img.shields.io/badge/Day-25%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Design%20Patterns%20--%20Structural-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-E-Commerce%20System-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Adapter — make incompatible interfaces work together
- ✅ Decorator — add behavior dynamically
- ✅ Facade — simplify complex subsystem
- ✅ Proxy — control access to object
- ✅ Composite — tree structures
- ✅ Bridge — decouple abstraction from implementation
- ✅ Flyweight — share objects to reduce memory

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `Adapter` | Wrapper that converts one interface to another. Like a power socket adapter. LegacyPrinter → ModernPrinter. |
| `Decorator` | Wraps object to add behavior WITHOUT modifying class. Coffee + Milk + Sugar: wrap, wrap, wrap. |
| `Facade` | Single class that hides complex subsystem. OrderFacade hides Inventory + Payment + Shipping. |
| `Proxy` | Surrogate object controls access. Can add: logging, lazy loading, caching, security checks. |
| `Composite` | Tree structure where leaves and nodes are treated uniformly. File system: File + Directory. |
| `Bridge` | Separate abstraction (what) from implementation (how). Shape (abstract) + DrawingAPI (impl). |
| `When to use Decorator` | Adding optional features to objects. Coffee shop menu, I/O streams in Java. |

---

## 📁 Files in This Project

```
day-25-design-patterns-structural/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-25-design-patterns-structural
javac *.java
java Main
```

---

## 🛠️ Today's Project

**E-Commerce System** — E-commerce with Facade for checkout, Decorator for discounts, Proxy for access control

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

**Day 26** continues building on today's concepts. Keep the momentum!
