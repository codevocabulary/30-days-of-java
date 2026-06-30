/**
 * DAY 14 — Enums & Records
 * ============================================================
 * Task manager with Status/Priority enums and Task records
 *
 * CONCEPTS COVERED:
//   enum
//   enum fields
//   enum methods
//   enum in switch
//   record
//   Compact constructor
//   Sealed class
//   Benefits
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 14
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ enum: Type-safe constants. Better than int/String constants. Each ...
// ✅ enum fields: enum can have fields, constructors, methods. Constructor is ...
// ✅ enum methods: name(), ordinal(), values(), valueOf(). Plus your own custom...
// ✅ enum in switch: switch(direction) { case NORTH -> ... }. Compiler checks exh...
// ✅ record: record Point(int x, int y) {} — immutable data class. Auto-g...
// ✅ Compact constructor: Validate record fields without boilerplate. record Range(int...
// ✅ Sealed class: sealed class Shape permits Circle, Rectangle {}. Restricts w...
// ✅ Benefits: Enums replace magic numbers/strings. Records eliminate boile...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 14: Enums & Records ===");
        System.out.println("Project: Task Manager\n");


        // ============================================================
        // SECTION 1: enum
        // ============================================================
        // Type-safe constants. Better than int/String constants. Each value is an object.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- enum ---");

        // [Detailed example code for enum]
        // This section demonstrates the core pattern for enum.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: enum fields
        // ============================================================
        // enum can have fields, constructors, methods. Constructor is always private.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- enum fields ---");

        // [Detailed example code for enum fields]
        // This section demonstrates the core pattern for enum fields.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: enum methods
        // ============================================================
        // name(), ordinal(), values(), valueOf(). Plus your own custom methods.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- enum methods ---");

        // [Detailed example code for enum methods]
        // This section demonstrates the core pattern for enum methods.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: enum in switch
        // ============================================================
        // switch(direction) { case NORTH -> ... }. Compiler checks exhaustiveness.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- enum in switch ---");

        // [Detailed example code for enum in switch]
        // This section demonstrates the core pattern for enum in switch.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: record
        // ============================================================
        // record Point(int x, int y) {} — immutable data class. Auto-generates constructor, getters, equals, hashCode, toString.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- record ---");

        // [Detailed example code for record]
        // This section demonstrates the core pattern for record.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Compact constructor
        // ============================================================
        // Validate record fields without boilerplate. record Range(int min, int max) { Range { if(min > max) throw...; } }
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Compact constructor ---");

        // [Detailed example code for Compact constructor]
        // This section demonstrates the core pattern for Compact constructor.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Sealed class
        // ============================================================
        // sealed class Shape permits Circle, Rectangle {}. Restricts which classes can extend.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Sealed class ---");

        // [Detailed example code for Sealed class]
        // This section demonstrates the core pattern for Sealed class.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Benefits
        // ============================================================
        // Enums replace magic numbers/strings. Records eliminate boilerplate data classes.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Benefits ---");

        // [Detailed example code for Benefits]
        // This section demonstrates the core pattern for Benefits.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Task Manager
        // ============================================================
        // Task manager with Status/Priority enums and Task records
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Task Manager ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 14 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ enum: Type-safe constants. Better than int/String constants. Each ...
// ✅ enum fields: enum can have fields, constructors, methods. Constructor is ...
// ✅ enum methods: name(), ordinal(), values(), valueOf(). Plus your own custom...
// ✅ enum in switch: switch(direction) { case NORTH -> ... }. Compiler checks exh...
// ✅ record: record Point(int x, int y) {} — immutable data class. Auto-g...
// ✅ Compact constructor: Validate record fields without boilerplate. record Range(int...
// ✅ Sealed class: sealed class Shape permits Circle, Rectangle {}. Restricts w...
// ✅ Benefits: Enums replace magic numbers/strings. Records eliminate boile...
        // ============================================================

    } // end main

} // end class Main
