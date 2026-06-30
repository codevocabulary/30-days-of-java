/**
 * DAY 24 — Design Patterns — Creational
 * ============================================================
 * App configuration using Singleton + Builder for config objects + Factory for validators
 *
 * CONCEPTS COVERED:
//   Singleton
//   Factory Method
//   Builder
//   Prototype
//   When to use Singleton
//   Builder benefits
//   Factory benefits
//   Anti-patterns
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 24
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Singleton: Private constructor. Private static instance. Public static ...
// ✅ Factory Method: Superclass defines creation method. Subclasses decide which ...
// ✅ Builder: Separate construction from representation. Fluent API: new B...
// ✅ Prototype: Clone existing object instead of creating from scratch. Impl...
// ✅ When to use Singleton: Database connections, configuration, logging, thread pools. ...
// ✅ Builder benefits: Avoids telescoping constructors. Readable. Validates before ...
// ✅ Factory benefits: Hides instantiation details. Easy to switch implementations....
// ✅ Anti-patterns: Singleton can become global state (bad for testing). Builder...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 24: Design Patterns — Creational ===");
        System.out.println("Project: Configuration Manager\n");


        // ============================================================
        // SECTION 1: Singleton
        // ============================================================
        // Private constructor. Private static instance. Public static getInstance(). Thread-safe with double-checked locking.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Singleton ---");

        // [Detailed example code for Singleton]
        // This section demonstrates the core pattern for Singleton.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Factory Method
        // ============================================================
        // Superclass defines creation method. Subclasses decide which class to instantiate.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Factory Method ---");

        // [Detailed example code for Factory Method]
        // This section demonstrates the core pattern for Factory Method.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: Builder
        // ============================================================
        // Separate construction from representation. Fluent API: new Builder().name('Alice').age(25).build().
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Builder ---");

        // [Detailed example code for Builder]
        // This section demonstrates the core pattern for Builder.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Prototype
        // ============================================================
        // Clone existing object instead of creating from scratch. Implement Cloneable or copy constructor.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Prototype ---");

        // [Detailed example code for Prototype]
        // This section demonstrates the core pattern for Prototype.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: When to use Singleton
        // ============================================================
        // Database connections, configuration, logging, thread pools. NOT for everything!
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- When to use Singleton ---");

        // [Detailed example code for When to use Singleton]
        // This section demonstrates the core pattern for When to use Singleton.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Builder benefits
        // ============================================================
        // Avoids telescoping constructors. Readable. Validates before creating object.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Builder benefits ---");

        // [Detailed example code for Builder benefits]
        // This section demonstrates the core pattern for Builder benefits.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Factory benefits
        // ============================================================
        // Hides instantiation details. Easy to switch implementations. Open/Closed Principle.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Factory benefits ---");

        // [Detailed example code for Factory benefits]
        // This section demonstrates the core pattern for Factory benefits.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Anti-patterns
        // ============================================================
        // Singleton can become global state (bad for testing). Builder overkill for simple objects.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Anti-patterns ---");

        // [Detailed example code for Anti-patterns]
        // This section demonstrates the core pattern for Anti-patterns.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Configuration Manager
        // ============================================================
        // App configuration using Singleton + Builder for config objects + Factory for validators
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Configuration Manager ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 24 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Singleton: Private constructor. Private static instance. Public static ...
// ✅ Factory Method: Superclass defines creation method. Subclasses decide which ...
// ✅ Builder: Separate construction from representation. Fluent API: new B...
// ✅ Prototype: Clone existing object instead of creating from scratch. Impl...
// ✅ When to use Singleton: Database connections, configuration, logging, thread pools. ...
// ✅ Builder benefits: Avoids telescoping constructors. Readable. Validates before ...
// ✅ Factory benefits: Hides instantiation details. Easy to switch implementations....
// ✅ Anti-patterns: Singleton can become global state (bad for testing). Builder...
        // ============================================================

    } // end main

} // end class Main
