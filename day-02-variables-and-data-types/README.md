# 📦 Day 02 — Variables & Data Types

<div align="center">

![Day](https://img.shields.io/badge/Day-02%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-green?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Variables%20%26%20Data%20Types-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Personal%20Info%20Card-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ Java's 8 primitive data types — exactly what they are and when to use each
- ✅ How Java stores different types in memory (stack vs heap)
- ✅ Variable declaration and initialization — the rules
- ✅ Wrapper classes — why they exist and how to use them
- ✅ Type casting — widening (automatic) and narrowing (manual)
- ✅ The `final` keyword — constants in Java
- ✅ `var` — local variable type inference (Java 10+)
- ✅ String is NOT a primitive — how it works differently
- ✅ Integer overflow — a dangerous bug to know about

---

## 🧱 What Is a Variable?

A variable is a **named container in memory** that holds a value. Think of it like a labeled box:

```
Memory (Stack):
┌─────────┬──────────┐
│  name   │ value    │
├─────────┼──────────┤
│  age    │    25    │  ← int, 4 bytes
│  score  │   98.5   │  ← double, 8 bytes
│  active │   true   │  ← boolean, 1 bit (JVM uses 1 byte)
│  grade  │   'A'    │  ← char, 2 bytes (Unicode)
└─────────┴──────────┘
```

### Variable Declaration Rules

```java
// SYNTAX: dataType variableName = initialValue;

int age = 25;           // declare AND initialize (best practice)
int count;              // declare WITHOUT initializing (count is "undefined")
count = 10;             // initialize later — must do before using!

// Multiple variables of same type:
int x = 1, y = 2, z = 3;

// Rules:
// ✅ Start with letter, underscore _, or dollar sign $
// ✅ Can contain letters, digits, _, $
// ✅ Case-sensitive (age ≠ Age ≠ AGE)
// ❌ Cannot start with a digit (1age is invalid)
// ❌ Cannot be a Java keyword (int, class, public, etc.)
```

---

## 🔢 Java's 8 Primitive Data Types

Java has exactly **8 primitive types**. They are NOT objects — they hold raw values directly.

### Integer Types (whole numbers)

| Type | Size | Min Value | Max Value | Use When |
|------|------|-----------|-----------|----------|
| `byte` | 1 byte | -128 | 127 | Saving memory in large arrays, binary data |
| `short` | 2 bytes | -32,768 | 32,767 | Rarely used directly |
| `int` | 4 bytes | -2,147,483,648 | 2,147,483,647 | **Default for integers** |
| `long` | 8 bytes | -9.2 × 10¹⁸ | 9.2 × 10¹⁸ | Very large numbers, timestamps |

```java
byte  b = 127;              // max byte value
short s = 32767;            // max short value
int   i = 2_147_483_647;    // max int (underscores for readability!)
long  l = 9_200_000_000L;   // L suffix REQUIRED for long literals > int max
```

> ⚠️ **Integer Overflow:** If you exceed `int` max (2,147,483,647) and add 1, it wraps around to -2,147,483,648! Use `long` for very large numbers.

### Floating-Point Types (decimal numbers)

| Type | Size | Precision | Use When |
|------|------|-----------|----------|
| `float` | 4 bytes | ~7 digits | Saving memory, graphics, when precision doesn't matter much |
| `double` | 8 bytes | ~15-16 digits | **Default for decimals** — use for money... carefully |

```java
float  f = 3.14f;       // f or F suffix REQUIRED for float literals
double d = 3.14159265;  // no suffix needed — double is default decimal type
```

> ⚠️ **Floating-Point Precision:** `0.1 + 0.2` in Java is `0.30000000000000004` due to IEEE 754 binary representation. For financial calculations, use `BigDecimal`.

### Other Primitives

| Type | Size | Values | Use When |
|------|------|--------|----------|
| `boolean` | 1 bit (JVM uses 1 byte) | `true`, `false` | Conditions, flags |
| `char` | 2 bytes | 0 to 65,535 (Unicode) | Single characters |

```java
boolean isActive = true;
boolean isEmpty  = false;

char letter = 'A';          // single quotes for char!
char digit  = '7';          // this is a CHARACTER 7, not the number 7
char unicode = '\u0041';    // Unicode escape — this is also 'A'
```

> 📌 **Key Rule:** `'A'` (char) is NOT the same as `"A"` (String). Single quotes = char, Double quotes = String.

---

## 📊 Memory: Stack vs Heap

```
STACK (primitives live here)    HEAP (objects live here)
┌─────────────────┐              ┌─────────────────────────┐
│  int age = 25   │              │  String s = new String  │
│  ┌───────────┐  │              │  ┌─────────────────────┐ │
│  │    25     │  │              │  │  "Hello"            │ │
│  └───────────┘  │              │  └─────────────────────┘ │
│                 │    ref ────► │                          │
│  String name ──────────────►  │  address: 0x7f3a2b       │
│                 │              │                          │
└─────────────────┘              └─────────────────────────┘
```

- **Stack:** Stores primitives directly. Fixed size. Fast access. Automatically managed.
- **Heap:** Stores objects. Dynamic size. Managed by Garbage Collector.
- Primitive variables hold the **value itself** on the stack.
- Object variables hold a **reference (memory address)** pointing to the heap.

---

## 🎁 Wrapper Classes

Every primitive type has a corresponding **Wrapper Class** — an object version:

| Primitive | Wrapper Class |
|-----------|--------------|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `boolean` | `Boolean` |
| `char` | `Character` |

**Why do wrapper classes exist?**
1. Java collections (`ArrayList`, etc.) cannot hold primitives — they need objects
2. Wrapper classes provide useful utility methods: `Integer.parseInt()`, `Integer.MAX_VALUE`
3. They allow `null` (primitives cannot be null)

```java
Integer num = 42;                    // Boxing: primitive → object
int prim = num;                      // Unboxing: object → primitive (auto)

// Java does Auto-boxing and Auto-unboxing automatically:
Integer x = 5;      // auto-boxing: 5 (int) → Integer object
int y = x;          // auto-unboxing: Integer → int

// Useful Wrapper methods:
int parsed = Integer.parseInt("42");          // String → int
String str  = Integer.toString(42);           // int → String
int maxVal  = Integer.MAX_VALUE;              // 2147483647
int minVal  = Integer.MIN_VALUE;              // -2147483648
int binary  = Integer.parseInt("1010", 2);   // parse binary: 10
String hex  = Integer.toHexString(255);       // "ff"
```

---

## 🔄 Type Casting

### Widening (Automatic) — smaller → larger type, no data loss

```java
byte b  = 10;
int  i  = b;    // automatic: byte → int (widening)
long l  = i;    // automatic: int → long (widening)
float f = l;    // automatic: long → float (widening)
double d = f;   // automatic: float → double (widening)

// Widening order: byte → short → int → long → float → double
```

### Narrowing (Manual) — larger → smaller type, POSSIBLE data loss

```java
double d = 9.99;
int i = (int) d;        // (int) is an explicit cast — REQUIRED
System.out.println(i);  // 9 — truncated (decimal part LOST, not rounded!)

long l = 123456789L;
byte b = (byte) l;      // DATA LOSS! 123456789 overflows byte (-128 to 127)
System.out.println(b);  // unexpected result due to overflow
```

---

## 📌 The `final` Keyword — Constants

```java
final double PI = 3.14159265358979;    // constant — cannot be changed
final int MAX_USERS = 1000;

PI = 3.0;  // ← ERROR: cannot assign a value to final variable PI
```

Convention: constants use `ALL_CAPS_WITH_UNDERSCORES`.

---

## 🤖 `var` — Type Inference (Java 10+)

```java
// Traditional: you declare the type explicitly
ArrayList<String> names = new ArrayList<String>();

// With var: compiler infers the type from the right-hand side
var names2 = new ArrayList<String>();   // compiler knows it's ArrayList<String>
var age    = 25;                        // compiler knows it's int
var pi     = 3.14;                      // compiler knows it's double

// Rules for var:
// ✅ Only works for LOCAL variables (inside methods)
// ✅ Must be initialized immediately (var x; is NOT allowed)
// ❌ Cannot be used for method parameters, fields, or return types
// ❌ Cannot be initialized to null without more type info
```

---

## 📏 String — Not a Primitive

`String` is a **class**, not a primitive. But it's used so often Java gives it special treatment:

```java
// Two ways to create Strings:
String s1 = "Hello";                 // String literal (stored in String Pool)
String s2 = new String("Hello");     // new object on heap (rarely needed)

// String Pool: Java reuses identical string literals to save memory
String a = "Java";
String b = "Java";
System.out.println(a == b);          // true — same object in pool!
System.out.println(a.equals(b));     // true — same content

// ⚠️ IMPORTANT: Always use .equals() to compare String content, never ==
// == compares REFERENCES (memory addresses)
// .equals() compares CONTENT (actual characters)
```

---

## 📁 Files in This Project

```
day-02-variables-and-data-types/
├── README.md          ← This file
├── Main.java          ← All 8 primitives, casting, wrapper classes
└── PersonCard.java    ← Mini project: formatted personal info display
```

---

## 🚀 How to Run

```bash
cd day-02-variables-and-data-types
javac Main.java PersonCard.java
java Main
```

---

## 💪 Challenges

1. What is the result of `2_147_483_647 + 1` as an `int`? Run it and explain why.
2. Declare a `char` variable and add 1 to it. What character do you get?
3. What is the difference between `int x = (int) 9.9` and `Math.round(9.9)`?
4. Create 3 constants for a triangle: base, height, MAX_AREA. Calculate the area.
5. What happens when you compare `new Integer(5) == new Integer(5)`? Use `.equals()` instead.
6. Convert the string `"12345"` to an `int` using `Integer.parseInt()`. Then add 1 to it.
7. What is the output of `System.out.println(1 / 2)`? And `System.out.println(1.0 / 2)`? Why different?
8. Use `var` to declare a `HashMap<String, Integer>` — what type does the compiler infer?

---

## ⏭️ What's Next?

**Day 03** covers **Operators & Expressions** — arithmetic, relational, logical, bitwise operators, operator precedence, and Java's interesting type promotion rules.
