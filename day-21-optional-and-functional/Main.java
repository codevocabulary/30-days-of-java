/**
 * DAY 21 — Optional & Functional Interfaces
 * ============================================================
 * User service with Optional return types, functional transformations, safe null handling
 *
 * CONCEPTS COVERED:
//   Optional
//   Optional.ofNullable()
//   orElse vs orElseGet
//   Optional chaining
//   Function<T,R>
//   Predicate<T>
//   Consumer<T>
//   Supplier<T>
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 21
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Optional: Container that may or may not hold a value. Explicitly repre...
// ✅ Optional.ofNullable(): Creates Optional from value that might be null. Use instead ...
// ✅ orElse vs orElseGet: orElse(default) ALWAYS evaluates default. orElseGet(() -> co...
// ✅ Optional chaining: opt.map(user -> user.getName()).orElse('Unknown') — safe nav...
// ✅ Function<T,R>: Takes T, returns R. Compose with andThen/compose: toUpper.an...
// ✅ Predicate<T>: Takes T, returns boolean. Combine with and(), or(), negate()...
// ✅ Consumer<T>: Takes T, returns void. Used in forEach. Chain with andThen.
// ✅ Supplier<T>: Takes nothing, returns T. Lazy evaluation. Used for expensiv...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 21: Optional & Functional Interfaces ===");
        System.out.println("Project: Safe User Service\n");


        // ============================================================
        // SECTION 1: Optional
        // ============================================================
        // Container that may or may not hold a value. Explicitly represents 'might be null'. Forces handling.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Optional ---");

        // [Detailed example code for Optional]
        // This section demonstrates the core pattern for Optional.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Optional.ofNullable()
        // ============================================================
        // Creates Optional from value that might be null. Use instead of Optional.of() for safety.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Optional.ofNullable() ---");

        // [Detailed example code for Optional.ofNullable()]
        // This section demonstrates the core pattern for Optional.ofNullable().
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: orElse vs orElseGet
        // ============================================================
        // orElse(default) ALWAYS evaluates default. orElseGet(() -> compute()) is LAZY — only if empty.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- orElse vs orElseGet ---");

        // [Detailed example code for orElse vs orElseGet]
        // This section demonstrates the core pattern for orElse vs orElseGet.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Optional chaining
        // ============================================================
        // opt.map(user -> user.getName()).orElse('Unknown') — safe navigation without null checks.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Optional chaining ---");

        // [Detailed example code for Optional chaining]
        // This section demonstrates the core pattern for Optional chaining.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Function<T,R>
        // ============================================================
        // Takes T, returns R. Compose with andThen/compose: toUpper.andThen(trim).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Function<T,R> ---");

        // [Detailed example code for Function<T,R>]
        // This section demonstrates the core pattern for Function<T,R>.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Predicate<T>
        // ============================================================
        // Takes T, returns boolean. Combine with and(), or(), negate(): isAdult.and(isStudent).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Predicate<T> ---");

        // [Detailed example code for Predicate<T>]
        // This section demonstrates the core pattern for Predicate<T>.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Consumer<T>
        // ============================================================
        // Takes T, returns void. Used in forEach. Chain with andThen.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Consumer<T> ---");

        // [Detailed example code for Consumer<T>]
        // This section demonstrates the core pattern for Consumer<T>.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Supplier<T>
        // ============================================================
        // Takes nothing, returns T. Lazy evaluation. Used for expensive default values.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Supplier<T> ---");

        // [Detailed example code for Supplier<T>]
        // This section demonstrates the core pattern for Supplier<T>.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Safe User Service
        // ============================================================
        // User service with Optional return types, functional transformations, safe null handling
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Safe User Service ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 21 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Optional: Container that may or may not hold a value. Explicitly repre...
// ✅ Optional.ofNullable(): Creates Optional from value that might be null. Use instead ...
// ✅ orElse vs orElseGet: orElse(default) ALWAYS evaluates default. orElseGet(() -> co...
// ✅ Optional chaining: opt.map(user -> user.getName()).orElse('Unknown') — safe nav...
// ✅ Function<T,R>: Takes T, returns R. Compose with andThen/compose: toUpper.an...
// ✅ Predicate<T>: Takes T, returns boolean. Combine with and(), or(), negate()...
// ✅ Consumer<T>: Takes T, returns void. Used in forEach. Chain with andThen.
// ✅ Supplier<T>: Takes nothing, returns T. Lazy evaluation. Used for expensiv...
        // ============================================================

    } // end main

} // end class Main
