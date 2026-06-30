# How to Compile and Run — Day 01

## Quick Reference

```bash
# 1. Open terminal and navigate to this folder
cd day-01-setup-and-hello-world

# 2. Compile the Java source file
#    This creates Main.class (bytecode)
javac Main.java

# 3. Run the compiled program
java Main

# 4. Run with your name as argument
java Main Alice

# 5. One-liner (Java 11+ only — skips manual compile step)
java Main.java
```

## Expected Output

```
========================================
   Welcome to 30 Days of Java! ☕
========================================
Hello, World!
Hello, Java learner!

My name is: Alice
My age is: 25
Pi is approximately: 3.14159
Today I will learn: Java basics

--- Using printf ---
Name: Alice | Age: 25 | Score: 98.50
Pi to 4 decimal places: 3.1416
Is Java fun? true
Alice            95
Bob              87
Charlie          92

--- Command Line Args Demo ---
No arguments provided. Run with: java Main YourName
...
```

## Troubleshooting

| Problem | Solution |
|---------|----------|
| `javac: command not found` | JDK not installed. Download from adoptium.net |
| `Error: Could not find or load main class Main` | Make sure you're in the right directory |
| `error: class Main is public, should be in a file named Main.java` | File name must match class name exactly |
