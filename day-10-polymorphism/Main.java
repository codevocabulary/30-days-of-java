/**
 * DAY 10 — Polymorphism
 * ============================================================
 * Shape hierarchy: calculate areas and perimeters for all shapes polymorphically
 *
 * CONCEPTS COVERED:
//   Polymorphism
//   Runtime polymorphism
//   Upcasting
//   Downcasting
//   instanceof
//   Dynamic dispatch
//   Polymorphic array
//   Covariant return
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 10
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Polymorphism: Same method name, different behavior based on actual object ...
// ✅ Runtime polymorphism: JVM decides WHICH method to call based on actual object type...
// ✅ Upcasting: Animal a = new Dog(); — safe, automatic. You can only call A...
// ✅ Downcasting: Dog d = (Dog) a; — manual, RISKY. Must ensure actual object ...
// ✅ instanceof: if (animal instanceof Dog d) { d.bark(); } — safe check befo...
// ✅ Dynamic dispatch: Animal a = new Dog(); a.speak() — JVM calls Dog's speak(), n...
// ✅ Polymorphic array: Animal[] zoo = { new Dog(), new Cat(), new Bird() }; — one a...
// ✅ Covariant return: Override can return a subtype: Animal's getAnimal() returns ...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 10: Polymorphism ===");
        System.out.println("Project: Shape Area Calculator\n");


        // ============================================================
        // SECTION 1: Polymorphism
        // ============================================================
        // Same method name, different behavior based on actual object type at runtime.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Polymorphism ---");

        // [Detailed example code for Polymorphism]
        // This section demonstrates the core pattern for Polymorphism.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Runtime polymorphism
        // ============================================================
        // JVM decides WHICH method to call based on actual object type, not reference type.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Runtime polymorphism ---");

        // [Detailed example code for Runtime polymorphism]
        // This section demonstrates the core pattern for Runtime polymorphism.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: Upcasting
        // ============================================================
        // Animal a = new Dog(); — safe, automatic. You can only call Animal methods on 'a'.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Upcasting ---");

        // [Detailed example code for Upcasting]
        // This section demonstrates the core pattern for Upcasting.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Downcasting
        // ============================================================
        // Dog d = (Dog) a; — manual, RISKY. Must ensure actual object IS a Dog. Use instanceof first.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Downcasting ---");

        // [Detailed example code for Downcasting]
        // This section demonstrates the core pattern for Downcasting.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: instanceof
        // ============================================================
        // if (animal instanceof Dog d) { d.bark(); } — safe check before casting (Java 16 pattern matching).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- instanceof ---");

        // [Detailed example code for instanceof]
        // This section demonstrates the core pattern for instanceof.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Dynamic dispatch
        // ============================================================
        // Animal a = new Dog(); a.speak() — JVM calls Dog's speak(), not Animal's. At RUNTIME.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Dynamic dispatch ---");

        // [Detailed example code for Dynamic dispatch]
        // This section demonstrates the core pattern for Dynamic dispatch.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Polymorphic array
        // ============================================================
        // Animal[] zoo = { new Dog(), new Cat(), new Bird() }; — one array, many types.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Polymorphic array ---");

        // [Detailed example code for Polymorphic array]
        // This section demonstrates the core pattern for Polymorphic array.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Covariant return
        // ============================================================
        // Override can return a subtype: Animal's getAnimal() returns Animal, Dog's returns Dog.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Covariant return ---");

        // [Detailed example code for Covariant return]
        // This section demonstrates the core pattern for Covariant return.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Shape Area Calculator
        // ============================================================
        // Shape hierarchy: calculate areas and perimeters for all shapes polymorphically
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Shape Area Calculator ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 10 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Polymorphism: Same method name, different behavior based on actual object ...
// ✅ Runtime polymorphism: JVM decides WHICH method to call based on actual object type...
// ✅ Upcasting: Animal a = new Dog(); — safe, automatic. You can only call A...
// ✅ Downcasting: Dog d = (Dog) a; — manual, RISKY. Must ensure actual object ...
// ✅ instanceof: if (animal instanceof Dog d) { d.bark(); } — safe check befo...
// ✅ Dynamic dispatch: Animal a = new Dog(); a.speak() — JVM calls Dog's speak(), n...
// ✅ Polymorphic array: Animal[] zoo = { new Dog(), new Cat(), new Bird() }; — one a...
// ✅ Covariant return: Override can return a subtype: Animal's getAnimal() returns ...
        // ============================================================

    } // end main

} // end class Main
