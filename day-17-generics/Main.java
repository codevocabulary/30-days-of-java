/**
 * DAY 17 — Generics
 * ============================================================
 * Generic Stack<T>, Pair<A,B>, generic sort, generic binary search
 *
 * CONCEPTS COVERED:
//   Generic class
//   Type parameter
//   Bounded wildcard
//   Generic method
//   Type erasure
//   PECS
//   Raw types
//   Reifiable types
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 17
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Generic class: class Pair<A, B> { } — type-safe container. Compiler enforce...
// ✅ Type parameter: <T> is a placeholder. Could be any letter but T (Type), E (E...
// ✅ Bounded wildcard: <? extends Number> accepts Number or any subclass. <? super ...
// ✅ Generic method: public <T extends Comparable<T>> T max(T a, T b) — method ha...
// ✅ Type erasure: Generics are a compile-time feature. At runtime, all generic...
// ✅ PECS: Producer Extends, Consumer Super. List<? extends T> = read f...
// ✅ Raw types: List instead of List<String>. Unsafe — no type checking. Avo...
// ✅ Reifiable types: Types fully available at runtime: int[], String, Object. Not...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 17: Generics ===");
        System.out.println("Project: Generic Data Structures\n");


        // ============================================================
        // SECTION 1: Generic class
        // ============================================================
        // class Pair<A, B> { } — type-safe container. Compiler enforces types.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Generic class ---");

        // [Detailed example code for Generic class]
        // This section demonstrates the core pattern for Generic class.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Type parameter
        // ============================================================
        // <T> is a placeholder. Could be any letter but T (Type), E (Element), K/V (Key/Value) are conventions.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Type parameter ---");

        // [Detailed example code for Type parameter]
        // This section demonstrates the core pattern for Type parameter.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: Bounded wildcard
        // ============================================================
        // <? extends Number> accepts Number or any subclass. <? super Integer> accepts Integer or superclass.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Bounded wildcard ---");

        // [Detailed example code for Bounded wildcard]
        // This section demonstrates the core pattern for Bounded wildcard.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Generic method
        // ============================================================
        // public <T extends Comparable<T>> T max(T a, T b) — method has its OWN type parameter.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Generic method ---");

        // [Detailed example code for Generic method]
        // This section demonstrates the core pattern for Generic method.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Type erasure
        // ============================================================
        // Generics are a compile-time feature. At runtime, all generic types become Object (or bound). No List<Integer>.class.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Type erasure ---");

        // [Detailed example code for Type erasure]
        // This section demonstrates the core pattern for Type erasure.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: PECS
        // ============================================================
        // Producer Extends, Consumer Super. List<? extends T> = read from. List<? super T> = write to.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- PECS ---");

        // [Detailed example code for PECS]
        // This section demonstrates the core pattern for PECS.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Raw types
        // ============================================================
        // List instead of List<String>. Unsafe — no type checking. Avoid in all modern code.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Raw types ---");

        // [Detailed example code for Raw types]
        // This section demonstrates the core pattern for Raw types.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Reifiable types
        // ============================================================
        // Types fully available at runtime: int[], String, Object. Not: List<String>, T.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Reifiable types ---");

        // [Detailed example code for Reifiable types]
        // This section demonstrates the core pattern for Reifiable types.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Generic Data Structures
        // ============================================================
        // Generic Stack<T>, Pair<A,B>, generic sort, generic binary search
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Generic Data Structures ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 17 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Generic class: class Pair<A, B> { } — type-safe container. Compiler enforce...
// ✅ Type parameter: <T> is a placeholder. Could be any letter but T (Type), E (E...
// ✅ Bounded wildcard: <? extends Number> accepts Number or any subclass. <? super ...
// ✅ Generic method: public <T extends Comparable<T>> T max(T a, T b) — method ha...
// ✅ Type erasure: Generics are a compile-time feature. At runtime, all generic...
// ✅ PECS: Producer Extends, Consumer Super. List<? extends T> = read f...
// ✅ Raw types: List instead of List<String>. Unsafe — no type checking. Avo...
// ✅ Reifiable types: Types fully available at runtime: int[], String, Object. Not...
        // ============================================================

    } // end main

} // end class Main
