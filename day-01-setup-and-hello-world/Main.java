/**
 * DAY 01 — Setup & Hello World
 * ============================================================
 * This is your very first Java program.
 * Every single line is explained so you understand not just
 * WHAT the code does, but WHY it is written this way.
 *
 * HOW TO RUN:
 *   javac Main.java    (compile — creates Main.class)
 *   java Main          (run)
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 01
 */

// ============================================================
// CLASS DECLARATION
// ============================================================
// In Java, ALL code must live inside a class.
// 'public' = visible to everyone (required for the main class)
// 'class'  = keyword to declare a class
// 'Main'   = the name of our class (must match filename Main.java)
public class Main {

    // ============================================================
    // THE MAIN METHOD — Entry Point of Every Java Program
    // ============================================================
    // When you type "java Main", the JVM looks for this EXACT method.
    // If any part of the signature is wrong, Java won't run your program.
    //
    // Breakdown of: public static void main(String[] args)
    //   public  → JVM can call this from anywhere
    //   static  → belongs to the CLASS itself, not an object instance
    //   void    → returns no value (nothing comes back from main)
    //   main    → the EXACT name JVM searches for (case-sensitive!)
    //   String[] args → array of command-line arguments passed at runtime
    //                   e.g., "java Main Alice 25" → args = ["Alice", "25"]
    public static void main(String[] args) {

        // ============================================================
        // SECTION 1: Basic Output
        // ============================================================

        // Print a decorative header
        // System  → built-in class holding system-related utilities
        // out     → PrintStream object connected to the console (standard output)
        // println → prints the text AND moves cursor to next line
        System.out.println("========================================");
        System.out.println("   Welcome to 30 Days of Java! ☕      ");
        System.out.println("========================================");

        // println = "print line" — adds a newline character (\n) after printing
        System.out.println("Hello, World!");         // classic first program output
        System.out.println("Hello, Java learner!");  // another line

        // println with no argument prints an EMPTY LINE (just a newline)
        System.out.println();  // blank line for spacing

        // ============================================================
        // SECTION 2: Variables and Printing Values
        // ============================================================
        // Variables store data that we can use and print.
        // We'll cover these fully on Day 02 — for now, just see how they work.

        // 'String' = a sequence of characters (text)
        // 'name'   = the variable name (stores the text "Alice")
        String name = "Alice";

        // 'int' = whole number (integer), no decimals
        int age = 25;

        // 'double' = decimal number (double-precision floating point)
        double pi = 3.14159;

        // String concatenation using + operator
        // When + is used between a String and anything else,
        // Java converts the non-String to String and joins them.
        System.out.println("My name is: " + name);   // "My name is: Alice"
        System.out.println("My age is: " + age);      // "My age is: 25"
        System.out.println("Pi is approximately: " + pi); // "Pi is approximately: 3.14159"

        // ============================================================
        // SECTION 3: print vs println — The Difference
        // ============================================================

        // print() → outputs text WITHOUT a newline at the end
        // The next print/println will continue on the SAME line
        System.out.print("Today ");
        System.out.print("I ");
        System.out.print("will ");
        System.out.print("learn: ");

        // println() → outputs text WITH a newline — cursor moves to next line
        System.out.println("Java basics");

        // Output of above 5 lines: "Today I will learn: Java basics"
        // (all on one line because print() doesn't add a newline)

        // ============================================================
        // SECTION 4: printf — Formatted Output
        // ============================================================
        // printf() lets you control EXACTLY how output looks.
        // It uses format specifiers as placeholders:
        //   %s  = String
        //   %d  = integer (decimal number)
        //   %f  = floating-point number
        //   %.2f = float with exactly 2 decimal places
        //   %b  = boolean
        //   %n  = newline (like \n but platform-independent — preferred)

        System.out.println();
        System.out.println("--- Using printf ---");

        // Format: first argument = format string, rest = values to insert
        System.out.printf("Name: %s | Age: %d | Score: %.2f%n",
                           name,      age,      98.5);
        // Output: "Name: Alice | Age: 25 | Score: 98.50"
        // Note: %.2f rounds 98.5 to 2 decimal places → 98.50

        // More printf examples
        System.out.printf("Pi to 4 decimal places: %.4f%n", pi); // 3.1416
        System.out.printf("Is Java fun? %b%n", true);             // true

        // Left-align with width: %-10s = left-align in 10-char field
        System.out.printf("%-15s %5d%n", "Alice",  95);  // Alice           95
        System.out.printf("%-15s %5d%n", "Bob",    87);  // Bob             87
        System.out.printf("%-15s %5d%n", "Charlie", 92); // Charlie         92

        // ============================================================
        // SECTION 5: Command-Line Arguments
        // ============================================================
        // The 'args' parameter in main(String[] args) holds arguments
        // passed when you run the program:
        //   java Main Alice 25
        //   args[0] = "Alice"
        //   args[1] = "25"
        //   args.length = 2

        System.out.println();
        System.out.println("--- Command Line Args Demo ---");

        // args.length tells us how many arguments were provided
        if (args.length > 0) {
            // args[0] is the FIRST argument (Java arrays are 0-indexed)
            System.out.println("Hello, " + args[0] + "! Welcome to Java!");

            // Check if a second argument was provided
            if (args.length > 1) {
                System.out.println("You provided " + args.length + " arguments total.");
            }
        } else {
            // No arguments provided — give user helpful message
            System.out.println("No arguments provided. Run with: java Main YourName");
        }

        // ============================================================
        // SECTION 6: Escape Characters in Strings
        // ============================================================
        // Some characters have special meaning inside strings.
        // You must "escape" them with a backslash (\).

        System.out.println();
        System.out.println("--- Escape Characters ---");

        // \n = newline (moves to next line)
        System.out.println("Line 1\nLine 2\nLine 3");

        // \t = tab (indentation)
        System.out.println("Name:\tAlice");
        System.out.println("Age:\t25");

        // \" = literal double-quote inside a string
        System.out.println("She said: \"Hello, Java!\"");

        // \\ = literal backslash
        System.out.println("File path: C:\\Users\\Alice\\Documents");

        // \' = literal single-quote (in char literals)
        // We'll cover char on Day 02

        // ============================================================
        // SECTION 7: Text Blocks (Java 15+)
        // ============================================================
        // Text blocks let you write multi-line strings cleanly.
        // Use triple-quotes (""") to start and end.

        System.out.println();
        System.out.println("--- Text Block (Java 15+) ---");

        // Text block — preserves indentation and line breaks automatically
        String json = """
                {
                    "name": "Alice",
                    "age": 25,
                    "language": "Java"
                }
                """;

        System.out.println("JSON text block:");
        System.out.println(json);

        // ============================================================
        // SECTION 8: Comments — Three Types
        // ============================================================
        // Comments are ignored by the compiler — they're for humans.

        // TYPE 1: Single-line comment — from // to end of line
        // Use for short explanations of what a line does

        /*
         * TYPE 2: Multi-line comment — from /* to */ /* 
         * Use for longer explanations or to temporarily disable code blocks
         */

        /**
         * TYPE 3: Javadoc comment — from /** to */ /**
         * These are used to generate HTML documentation.
         * Tools like IntelliJ IDEA read these to show tooltips.
         *
         * @see System#out
         * @since Java 1.0
         */

        // ============================================================
        // SECTION 9: Java Naming Conventions
        // ============================================================
        // Java has strong community conventions. Follow them always!

        // Classes       → PascalCase     (capitalize each word)
        // Variables     → camelCase      (lowercase first word, capitalize rest)
        // Constants     → ALL_CAPS       (with underscores)
        // Methods       → camelCase      (same as variables)
        // Packages      → lowercase      (all lowercase, no underscores)

        // Good examples:
        String firstName = "Alice";      // camelCase variable
        int studentCount = 42;           // camelCase variable
        final double MAX_SCORE = 100.0;  // ALL_CAPS constant (final = can't change)
        // class BankAccount { }         // PascalCase class

        System.out.println();
        System.out.println("--- Naming Convention Examples ---");
        System.out.printf("First Name: %s%n", firstName);
        System.out.printf("Student Count: %d%n", studentCount);
        System.out.printf("Max Score: %.1f%n", MAX_SCORE);

        // ============================================================
        // MINI PROJECT: Personal Info Card
        // ============================================================
        // Let's put it all together and print a formatted info card.

        System.out.println();
        System.out.println("========================================");
        System.out.println("         PERSONAL INFO CARD             ");
        System.out.println("========================================");

        // Your info — change these to your own details!
        String myName     = "Alice Johnson";
        int    myAge      = 25;
        String myLanguage = "Java";
        double myGPA      = 3.85;
        String myGoal     = "Become a Software Engineer";

        // Print formatted card
        System.out.printf("  Name     : %s%n", myName);
        System.out.printf("  Age      : %d years%n", myAge);
        System.out.printf("  Learning : %s%n", myLanguage);
        System.out.printf("  GPA      : %.2f%n", myGPA);
        System.out.printf("  Goal     : %s%n", myGoal);

        System.out.println("========================================");
        System.out.println();

        // ============================================================
        // WRAP UP
        // ============================================================
        System.out.println("========================================");
        System.out.println("   Day 01 Complete! Keep going! 🚀     ");
        System.out.println("========================================");

        // ============================================================
        // SUMMARY OF CONCEPTS COVERED:
        // ============================================================
        // ✅ public class Main   — class declaration
        // ✅ public static void main(String[] args) — entry point
        // ✅ System.out.println() — print with newline
        // ✅ System.out.print()   — print without newline
        // ✅ System.out.printf()  — formatted print (%s %d %f %n)
        // ✅ String, int, double  — basic variable types
        // ✅ String concatenation with +
        // ✅ args[] — command-line arguments
        // ✅ Escape characters: \n \t \" \\
        // ✅ Text blocks """...""" (Java 15+)
        // ✅ Three types of comments: //, /* */, /** */
        // ✅ Naming conventions: PascalCase, camelCase, ALL_CAPS
        // ============================================================

    } // end of main method

} // end of class Main
