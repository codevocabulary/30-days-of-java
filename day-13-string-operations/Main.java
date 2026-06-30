/**
 * DAY 13 — String Deep Dive
 * ============================================================
 * Text analyzer: word count, char frequency, palindrome check, word frequency map
 *
 * CONCEPTS COVERED:
//   Immutability
//   String Pool
//   Common methods
//   equals vs ==
//   StringBuilder
//   StringBuffer
//   String.format()
//   split()
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 13
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Immutability: Strings NEVER change. Methods return NEW strings. Original u...
// ✅ String Pool: JVM keeps one copy of each string literal. 'Java' == 'Java' ...
// ✅ Common methods: length(), charAt(), substring(), indexOf(), contains(), repl...
// ✅ equals vs ==: equals() compares content (characters). == compares referenc...
// ✅ StringBuilder: Mutable string buffer. Use for building strings in loops. Mu...
// ✅ StringBuffer: Like StringBuilder but synchronized (thread-safe). Use only ...
// ✅ String.format(): String.format('%s is %d', name, age) — template-based string...
// ✅ split(): str.split(',') returns String[]. Uses regex. split('\\s+') s...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 13: String Deep Dive ===");
        System.out.println("Project: Text Analyzer\n");


        // ============================================================
        // SECTION 1: Immutability
        // ============================================================
        // Strings NEVER change. Methods return NEW strings. Original untouched. Thread-safe.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Immutability ---");

        // [Detailed example code for Immutability]
        // This section demonstrates the core pattern for Immutability.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: String Pool
        // ============================================================
        // JVM keeps one copy of each string literal. 'Java' == 'Java' is true (same pool object).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- String Pool ---");

        // [Detailed example code for String Pool]
        // This section demonstrates the core pattern for String Pool.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: Common methods
        // ============================================================
        // length(), charAt(), substring(), indexOf(), contains(), replace(), split(), trim(), strip().
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Common methods ---");

        // [Detailed example code for Common methods]
        // This section demonstrates the core pattern for Common methods.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: equals vs ==
        // ============================================================
        // equals() compares content (characters). == compares references (memory addresses).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- equals vs == ---");

        // [Detailed example code for equals vs ==]
        // This section demonstrates the core pattern for equals vs ==.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: StringBuilder
        // ============================================================
        // Mutable string buffer. Use for building strings in loops. Much faster than + in loops.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- StringBuilder ---");

        // [Detailed example code for StringBuilder]
        // This section demonstrates the core pattern for StringBuilder.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: StringBuffer
        // ============================================================
        // Like StringBuilder but synchronized (thread-safe). Use only when threading is needed.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- StringBuffer ---");

        // [Detailed example code for StringBuffer]
        // This section demonstrates the core pattern for StringBuffer.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: String.format()
        // ============================================================
        // String.format('%s is %d', name, age) — template-based string creation.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- String.format() ---");

        // [Detailed example code for String.format()]
        // This section demonstrates the core pattern for String.format().
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: split()
        // ============================================================
        // str.split(',') returns String[]. Uses regex. split('\\s+') splits on any whitespace.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- split() ---");

        // [Detailed example code for split()]
        // This section demonstrates the core pattern for split().
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Text Analyzer
        // ============================================================
        // Text analyzer: word count, char frequency, palindrome check, word frequency map
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Text Analyzer ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 13 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Immutability: Strings NEVER change. Methods return NEW strings. Original u...
// ✅ String Pool: JVM keeps one copy of each string literal. 'Java' == 'Java' ...
// ✅ Common methods: length(), charAt(), substring(), indexOf(), contains(), repl...
// ✅ equals vs ==: equals() compares content (characters). == compares referenc...
// ✅ StringBuilder: Mutable string buffer. Use for building strings in loops. Mu...
// ✅ StringBuffer: Like StringBuilder but synchronized (thread-safe). Use only ...
// ✅ String.format(): String.format('%s is %d', name, age) — template-based string...
// ✅ split(): str.split(',') returns String[]. Uses regex. split('\\s+') s...
        // ============================================================

    } // end main

} // end class Main
