# ☕ Day 01 — Setup & Hello World

<div align="center">

![Day](https://img.shields.io/badge/Day-01%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-green?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Setup%20%26%20Hello%20World-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Hello%20World%20CLI-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ What Java is and why it matters in 2024
- ✅ The difference between JDK, JRE, and JVM
- ✅ How Java compilation works (source → bytecode → execution)
- ✅ Your first Java program — structure, syntax, and every keyword explained
- ✅ `System.out.println` vs `System.out.print` vs `System.out.printf`
- ✅ Comments in Java — single-line, multi-line, Javadoc
- ✅ What the `main` method is and why it has that exact signature
- ✅ How to compile and run Java from the command line

---

## 🤔 What Is Java?

Java is a **general-purpose, class-based, object-oriented programming language** created by James Gosling at Sun Microsystems (now Oracle) in 1995. It was designed with one powerful philosophy:

> **"Write Once, Run Anywhere" (WORA)**

This means you write Java code once and it runs on any device — Windows, macOS, Linux, Android, embedded systems — without rewriting it.

### Why Learn Java in 2024?

| Reason | Details |
|--------|---------|
| 🌍 **Ubiquitous** | 3+ billion devices run Java. It's everywhere. |
| 💰 **High salary** | Java developers earn $90k–$180k+ in the US |
| 🏢 **Enterprise standard** | Banks, government, Amazon, Google use Java |
| 🤖 **Android** | Android apps are built with Java/Kotlin |
| 📚 **Vast ecosystem** | Maven, Spring, Hibernate, Kafka, and thousands more |
| 🎓 **Foundation** | Learning Java makes C#, Kotlin, Scala much easier |

---

## 🏗️ JDK vs JRE vs JVM — The Holy Trinity

This confuses almost every beginner. Here's the clear breakdown:

```
┌─────────────────────────────────────────────────┐
│                      JDK                         │
│  (Java Development Kit — for DEVELOPERS)         │
│                                                   │
│   javac (compiler)   javadoc   jar   jdb         │
│                                                   │
│  ┌──────────────────────────────────────────┐    │
│  │                  JRE                      │    │
│  │  (Java Runtime Environment — for USERS)  │    │
│  │                                           │    │
│  │  Java Standard Library (java.lang, etc.) │    │
│  │                                           │    │
│  │  ┌────────────────────────────────────┐  │    │
│  │  │              JVM                    │  │    │
│  │  │  (Java Virtual Machine — executes) │  │    │
│  │  │                                     │  │    │
│  │  │  Class Loader → Bytecode Verifier  │  │    │
│  │  │  → Execution Engine → JIT Compiler │  │    │
│  │  └────────────────────────────────────┘  │    │
│  └──────────────────────────────────────────┘    │
└─────────────────────────────────────────────────┘
```

- **JVM (Java Virtual Machine)** — An abstract machine that executes Java bytecode. Each OS has its own JVM implementation. This is what makes Java platform-independent.

- **JRE (Java Runtime Environment)** — JVM + standard class libraries. End users who just want to RUN Java applications need this.

- **JDK (Java Development Kit)** — JRE + development tools (`javac` compiler, `javadoc`, `jar`). Developers need this to WRITE and COMPILE Java code.

> **Install JDK 17+** — it includes everything you need.

---

## ⚙️ How Java Compilation Works

Java is unique — it's both compiled AND interpreted:

```
Step 1: You write code          Step 2: javac compiles it       Step 3: JVM runs it
┌──────────────────┐            ┌──────────────────────┐        ┌──────────────────┐
│   Main.java      │  javac →   │   Main.class         │  JVM → │  Output on your  │
│  (source code)   │            │   (bytecode)         │        │  screen          │
│  Human readable  │            │  Platform neutral    │        │                  │
└──────────────────┘            └──────────────────────┘        └──────────────────┘
```

1. **Source file** (`.java`) — Human-readable text you write
2. **Bytecode** (`.class`) — Compiled intermediate format, NOT machine code
3. **JVM** reads the bytecode and executes it on your specific machine

The bytecode is the same on all platforms. The JVM translates it to machine instructions for YOUR specific operating system and processor.

---

## 📂 Java File Naming Rules

Java has strict naming rules that you MUST follow:

1. **The file name must exactly match the `public class` name** (case-sensitive!)
   - Class named `Main` → file must be `Main.java`
   - Class named `HelloWorld` → file must be `HelloWorld.java`

2. **One `public` class per file** — you can have multiple classes, but only one `public`

3. **File extension must be `.java`** (lowercase)

---

## 🏛️ Anatomy of a Java Program

Let's dissect every single part of a Hello World program:

```java
// This is a comment — the compiler ignores this line

public class Main {           // Class declaration
    
    public static void main(String[] args) {   // main method
        System.out.println("Hello, World!");   // print statement
    }
}
```

### Breaking it Down Piece by Piece

#### `public`
An **access modifier** that controls visibility. `public` means this class or method is accessible from everywhere. Java has 4 access modifiers: `public`, `protected`, `private`, and package-private (no keyword).

#### `class`
Everything in Java lives inside a class. Java is a purely object-oriented language — there are no free-standing functions. `class` is the keyword that starts a class definition.

#### `Main`
The name of our class. By convention, class names use **PascalCase** (capitalize first letter of each word): `MyClass`, `BankAccount`, `StudentRecord`.

#### `{` and `}`
Curly braces define a **block** — a group of code that belongs together. The class body lives between `{` and `}`.

#### `public static void main(String[] args)`
This is **the most important line in all of Java**. It is the **entry point** — where Java starts executing your program. Every console application must have exactly this:

- `public` — JVM must be able to call it from outside the class
- `static` — JVM calls it without creating an object of the class
- `void` — it returns nothing
- `main` — this exact name is what JVM looks for
- `String[] args` — command-line arguments passed when running the program

#### `System.out.println("Hello, World!")`
- `System` — a built-in class in `java.lang` package
- `out` — a `PrintStream` object inside System (represents standard output/console)
- `println` — a method that prints text and adds a newline at the end
- `"Hello, World!"` — a String literal (text in double quotes)
- `;` — every statement in Java must end with a semicolon!

---

## 🖨️ Output Methods — print vs println vs printf

```java
System.out.print("Hello");     // prints, NO newline at end
System.out.println("Hello");   // prints WITH newline at end (ln = line)
System.out.printf("Hello %s, you are %d years old%n", "Alice", 25);  // formatted
```

### printf Format Specifiers

| Specifier | Type | Example |
|-----------|------|---------|
| `%s` | String | `"Alice"` |
| `%d` | Integer | `42` |
| `%f` | Float/Double | `3.14` |
| `%.2f` | Float with 2 decimal places | `3.14` |
| `%b` | Boolean | `true` |
| `%c` | Character | `'A'` |
| `%n` | Newline (platform-independent) | — |
| `%t` | Date/Time | various |

---

## 💬 Comments in Java

```java
// Single-line comment — from // to end of line

/* Multi-line comment
   spans multiple lines
   everything between /* and */ is ignored */

/**
 * Javadoc comment — used to generate HTML documentation
 * @author Your Name
 * @version 1.0
 * @param args command-line arguments
 */
```

Good comments explain **WHY**, not **WHAT**. The code shows what — comments should explain why you made a decision.

---

## 🔧 How to Compile and Run

### From Command Line

```bash
# Navigate to the day's folder
cd day-01-setup-and-hello-world

# Compile — creates Main.class
javac Main.java

# Run — executes Main.class
java Main

# Run with arguments
java Main Alice 25

# One-line compile-and-run (Java 11+)
java Main.java
```

### Common Errors on Day 1

| Error | Cause | Fix |
|-------|-------|-----|
| `javac: command not found` | JDK not installed or not in PATH | Install JDK 17+, set JAVA_HOME |
| `error: class Main is public, should be in a file named Main.java` | File name ≠ class name | Rename file or class |
| `error: reached end of file while parsing` | Missing closing `}` | Count your braces! |
| `Main.java:3: error: ';' expected` | Missing semicolon | Add `;` at end of statement |
| `Error: Main class Main not found` | Not compiled yet | Run `javac Main.java` first |

---

## 📁 Files in This Project

```
day-01-setup-and-hello-world/
├── README.md        ← This file
├── Main.java        ← Thoroughly commented Hello World + extras
└── HOW_TO_RUN.md   ← Quick reference for compiling and running
```

---

## 🚀 How to Run

```bash
cd day-01-setup-and-hello-world
javac Main.java
java Main
```

**Expected Output:**
```
========================================
   Welcome to 30 Days of Java! ☕
========================================
Hello, World!
Hello, Java learner!
My name is: Alice
My age is: 25
Pi is approximately: 3.14
Today I will learn: Java basics

--- Using printf ---
Name: Alice | Age: 25 | Score: 98.50

--- Command Line Args Demo ---
No arguments provided. Run with: java Main YourName

========================================
   Day 01 Complete! Keep going!
========================================
```

---

## 💪 Challenges

1. Change the greeting to print your own name
2. Add a line that prints your favorite programming language
3. Use `printf` to print your name, age, and GPA with proper formatting
4. Run the program with your name as a command-line argument: `java Main YourName`
5. Find and fix the 3 bugs in this snippet:
   ```java
   public class buggy {
       public static void Main(string[] args)
           System.out.println("Fix me!")
   }
   ```
6. What happens if you remove `static` from the `main` method signature? Try it!
7. Write a Javadoc comment for the `main` method

---



## ⏭️ What's Next?

**Day 02** covers **Variables & Data Types** — Java's 8 primitive types, wrapper classes, type casting, and how Java manages memory for different types.
