# ☕ Day 29 — JUnit 5 & Testing

<div align="center">

![Day](https://img.shields.io/badge/Day-29%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-JUnit%205%20%26%20Testing-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Tested%20Library%20System-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Why testing matters — preventing regression
- ✅ JUnit 5 annotations — @Test, @BeforeEach, @AfterEach
- ✅ Assertions — assertEquals, assertTrue, assertThrows
- ✅ Test lifecycle — @BeforeAll, @AfterAll
- ✅ Parameterized tests
- ✅ Test-Driven Development (TDD) workflow
- ✅ Mockito basics — mocking dependencies
- ✅ Test naming conventions
- ✅ Code coverage concepts

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `@Test` | Marks a method as a test. JUnit runs all @Test methods. Method must be void, no params. |
| `@BeforeEach` | Runs before EACH test method. Use to reset state, create fresh objects. |
| `@AfterEach` | Runs after EACH test. Clean up resources, reset mocks. |
| `assertEquals(expected, actual)` | Fails test if values differ. ALWAYS put expected first, actual second. |
| `assertThrows()` | assertThrows(IllegalArgumentException.class, () -> method(badInput)) — tests exception throwing. |
| `@ParameterizedTest` | @ValueSource(ints = {1,2,3}) — run same test with different inputs automatically. |
| `TDD` | RED: write failing test. GREEN: write minimal code to pass. REFACTOR: improve code quality. |
| `Mockito` | Mock dependencies so unit tests are isolated. when(mock.method()).thenReturn(value). |

---

## 📁 Files in This Project

```
day-29-junit-and-testing/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-29-junit-and-testing
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Tested Library System** — Library system with full JUnit 5 test suite: unit tests, edge cases, parameterized tests

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

**Day 30** continues building on today's concepts. Keep the momentum!
