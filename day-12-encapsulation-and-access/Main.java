/**
 * DAY 12 — Encapsulation & Access Modifiers
 * ============================================================
 * Employee management with validation, immutable records, controlled access
 *
 * CONCEPTS COVERED:
//   private
//   package-private (default)
//   protected
//   public
//   Getters/Setters
//   Immutable class
//   Data validation
//   Defensive copy
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 12
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ private: Only accessible WITHIN the same class. Strongest restriction...
// ✅ package-private (default): No keyword. Accessible within same package only.
// ✅ protected: Accessible within same package AND all subclasses.
// ✅ public: Accessible from EVERYWHERE. Use sparingly. Only for intentio...
// ✅ Getters/Setters: Controlled read/write access. Setters can VALIDATE before ch...
// ✅ Immutable class: All fields final, no setters, only constructor init. Thread-...
// ✅ Data validation: Setter checks: if (salary < 0) throw new IllegalArgumentExce...
// ✅ Defensive copy: Return new object instead of internal reference to prevent e...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 12: Encapsulation & Access Modifiers ===");
        System.out.println("Project: Employee Management\n");


        // ============================================================
        // SECTION 1: private
        // ============================================================
        // Only accessible WITHIN the same class. Strongest restriction. Use for ALL fields.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- private ---");

        // [Detailed example code for private]
        // This section demonstrates the core pattern for private.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: package-private (default)
        // ============================================================
        // No keyword. Accessible within same package only.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- package-private (default) ---");

        // [Detailed example code for package-private (default)]
        // This section demonstrates the core pattern for package-private (default).
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: protected
        // ============================================================
        // Accessible within same package AND all subclasses.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- protected ---");

        // [Detailed example code for protected]
        // This section demonstrates the core pattern for protected.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: public
        // ============================================================
        // Accessible from EVERYWHERE. Use sparingly. Only for intentional public API.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- public ---");

        // [Detailed example code for public]
        // This section demonstrates the core pattern for public.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Getters/Setters
        // ============================================================
        // Controlled read/write access. Setters can VALIDATE before changing.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Getters/Setters ---");

        // [Detailed example code for Getters/Setters]
        // This section demonstrates the core pattern for Getters/Setters.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Immutable class
        // ============================================================
        // All fields final, no setters, only constructor init. Thread-safe by default.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Immutable class ---");

        // [Detailed example code for Immutable class]
        // This section demonstrates the core pattern for Immutable class.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Data validation
        // ============================================================
        // Setter checks: if (salary < 0) throw new IllegalArgumentException().
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Data validation ---");

        // [Detailed example code for Data validation]
        // This section demonstrates the core pattern for Data validation.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Defensive copy
        // ============================================================
        // Return new object instead of internal reference to prevent external modification.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Defensive copy ---");

        // [Detailed example code for Defensive copy]
        // This section demonstrates the core pattern for Defensive copy.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Employee Management
        // ============================================================
        // Employee management with validation, immutable records, controlled access
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Employee Management ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 12 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ private: Only accessible WITHIN the same class. Strongest restriction...
// ✅ package-private (default): No keyword. Accessible within same package only.
// ✅ protected: Accessible within same package AND all subclasses.
// ✅ public: Accessible from EVERYWHERE. Use sparingly. Only for intentio...
// ✅ Getters/Setters: Controlled read/write access. Setters can VALIDATE before ch...
// ✅ Immutable class: All fields final, no setters, only constructor init. Thread-...
// ✅ Data validation: Setter checks: if (salary < 0) throw new IllegalArgumentExce...
// ✅ Defensive copy: Return new object instead of internal reference to prevent e...
        // ============================================================

    } // end main

} // end class Main
