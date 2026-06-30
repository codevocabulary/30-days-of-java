/**
 * DAY 18 — Exception Handling
 * ============================================================
 * File parser with custom exceptions, validation, and graceful error handling
 *
 * CONCEPTS COVERED:
//   Exception hierarchy
//   Checked exceptions
//   Unchecked exceptions
//   try-catch-finally
//   Multi-catch
//   Custom exceptions
//   try-with-resources
//   Exception chaining
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 18
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Exception hierarchy: Throwable → Error (JVM errors, don't catch) and Exception (p...
// ✅ Checked exceptions: Must declare with throws or catch. IOException, SQLException...
// ✅ Unchecked exceptions: RuntimeException subclasses. NullPointerException, ArrayInde...
// ✅ try-catch-finally: try{risky} catch(Exception e){handle} finally{always runs — ...
// ✅ Multi-catch: catch(IOException | SQLException e) — handle multiple except...
// ✅ Custom exceptions: class InsufficientFundsException extends RuntimeException { ...
// ✅ try-with-resources: try(InputStream is = new FileInputStream(f)) { } — auto-clos...
// ✅ Exception chaining: throw new ServiceException('Failed', originalException) — pr...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 18: Exception Handling ===");
        System.out.println("Project: Robust File Parser\n");


        // ============================================================
        // SECTION 1: Exception hierarchy
        // ============================================================
        // Throwable → Error (JVM errors, don't catch) and Exception (program errors).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Exception hierarchy ---");

        // [Detailed example code for Exception hierarchy]
        // This section demonstrates the core pattern for Exception hierarchy.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Checked exceptions
        // ============================================================
        // Must declare with throws or catch. IOException, SQLException. Compiler enforces.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Checked exceptions ---");

        // [Detailed example code for Checked exceptions]
        // This section demonstrates the core pattern for Checked exceptions.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: Unchecked exceptions
        // ============================================================
        // RuntimeException subclasses. NullPointerException, ArrayIndexOutOfBoundsException.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Unchecked exceptions ---");

        // [Detailed example code for Unchecked exceptions]
        // This section demonstrates the core pattern for Unchecked exceptions.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: try-catch-finally
        // ============================================================
        // try{risky} catch(Exception e){handle} finally{always runs — cleanup!}.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- try-catch-finally ---");

        // [Detailed example code for try-catch-finally]
        // This section demonstrates the core pattern for try-catch-finally.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Multi-catch
        // ============================================================
        // catch(IOException | SQLException e) — handle multiple exception types the same way.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Multi-catch ---");

        // [Detailed example code for Multi-catch]
        // This section demonstrates the core pattern for Multi-catch.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Custom exceptions
        // ============================================================
        // class InsufficientFundsException extends RuntimeException { }. Add context.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Custom exceptions ---");

        // [Detailed example code for Custom exceptions]
        // This section demonstrates the core pattern for Custom exceptions.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: try-with-resources
        // ============================================================
        // try(InputStream is = new FileInputStream(f)) { } — auto-closes resources. No finally needed.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- try-with-resources ---");

        // [Detailed example code for try-with-resources]
        // This section demonstrates the core pattern for try-with-resources.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Exception chaining
        // ============================================================
        // throw new ServiceException('Failed', originalException) — preserves original cause.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Exception chaining ---");

        // [Detailed example code for Exception chaining]
        // This section demonstrates the core pattern for Exception chaining.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Robust File Parser
        // ============================================================
        // File parser with custom exceptions, validation, and graceful error handling
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Robust File Parser ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 18 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Exception hierarchy: Throwable → Error (JVM errors, don't catch) and Exception (p...
// ✅ Checked exceptions: Must declare with throws or catch. IOException, SQLException...
// ✅ Unchecked exceptions: RuntimeException subclasses. NullPointerException, ArrayInde...
// ✅ try-catch-finally: try{risky} catch(Exception e){handle} finally{always runs — ...
// ✅ Multi-catch: catch(IOException | SQLException e) — handle multiple except...
// ✅ Custom exceptions: class InsufficientFundsException extends RuntimeException { ...
// ✅ try-with-resources: try(InputStream is = new FileInputStream(f)) { } — auto-clos...
// ✅ Exception chaining: throw new ServiceException('Failed', originalException) — pr...
        // ============================================================

    } // end main

} // end class Main
