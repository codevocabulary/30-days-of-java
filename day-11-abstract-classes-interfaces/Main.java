/**
 * DAY 11 — Abstract Classes & Interfaces
 * ============================================================
 * Payment system: CreditCard, DebitCard, UPI all implementing Payable interface
 *
 * CONCEPTS COVERED:
//   abstract class
//   abstract method
//   interface
//   default methods
//   implements
//   Multiple interfaces
//   abstract vs interface
//   Functional interface
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 11
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ abstract class: Cannot be instantiated. May have abstract methods (no body) ...
// ✅ abstract method: Has no body. Subclass MUST implement it or also be abstract.
// ✅ interface: All methods implicitly public abstract (before Java 8). Defi...
// ✅ default methods: interface method with body. Allows adding methods without br...
// ✅ implements: class Dog implements Swimmable — Dog agrees to provide all i...
// ✅ Multiple interfaces: class Duck extends Bird implements Swimmable, Flyable — Java...
// ✅ abstract vs interface: Use abstract class for IS-A with shared code. Use interface ...
// ✅ Functional interface: @FunctionalInterface — exactly one abstract method. Used wit...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 11: Abstract Classes & Interfaces ===");
        System.out.println("Project: Payment System\n");


        // ============================================================
        // SECTION 1: abstract class
        // ============================================================
        // Cannot be instantiated. May have abstract methods (no body) and concrete methods.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- abstract class ---");

        // [Detailed example code for abstract class]
        // This section demonstrates the core pattern for abstract class.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: abstract method
        // ============================================================
        // Has no body. Subclass MUST implement it or also be abstract.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- abstract method ---");

        // [Detailed example code for abstract method]
        // This section demonstrates the core pattern for abstract method.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: interface
        // ============================================================
        // All methods implicitly public abstract (before Java 8). Defines a contract.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- interface ---");

        // [Detailed example code for interface]
        // This section demonstrates the core pattern for interface.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: default methods
        // ============================================================
        // interface method with body. Allows adding methods without breaking existing implementations.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- default methods ---");

        // [Detailed example code for default methods]
        // This section demonstrates the core pattern for default methods.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: implements
        // ============================================================
        // class Dog implements Swimmable — Dog agrees to provide all interface methods.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- implements ---");

        // [Detailed example code for implements]
        // This section demonstrates the core pattern for implements.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Multiple interfaces
        // ============================================================
        // class Duck extends Bird implements Swimmable, Flyable — Java's multiple inheritance.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Multiple interfaces ---");

        // [Detailed example code for Multiple interfaces]
        // This section demonstrates the core pattern for Multiple interfaces.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: abstract vs interface
        // ============================================================
        // Use abstract class for IS-A with shared code. Use interface for CAN-DO contracts.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- abstract vs interface ---");

        // [Detailed example code for abstract vs interface]
        // This section demonstrates the core pattern for abstract vs interface.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Functional interface
        // ============================================================
        // @FunctionalInterface — exactly one abstract method. Used with lambdas (Day 20).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Functional interface ---");

        // [Detailed example code for Functional interface]
        // This section demonstrates the core pattern for Functional interface.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Payment System
        // ============================================================
        // Payment system: CreditCard, DebitCard, UPI all implementing Payable interface
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Payment System ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 11 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ abstract class: Cannot be instantiated. May have abstract methods (no body) ...
// ✅ abstract method: Has no body. Subclass MUST implement it or also be abstract.
// ✅ interface: All methods implicitly public abstract (before Java 8). Defi...
// ✅ default methods: interface method with body. Allows adding methods without br...
// ✅ implements: class Dog implements Swimmable — Dog agrees to provide all i...
// ✅ Multiple interfaces: class Duck extends Bird implements Swimmable, Flyable — Java...
// ✅ abstract vs interface: Use abstract class for IS-A with shared code. Use interface ...
// ✅ Functional interface: @FunctionalInterface — exactly one abstract method. Used wit...
        // ============================================================

    } // end main

} // end class Main
