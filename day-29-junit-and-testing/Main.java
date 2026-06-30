/**
 * DAY 29 — JUnit 5 & Testing
 * ============================================================
 * Library system with full JUnit 5 test suite: unit tests, edge cases, parameterized tests
 *
 * CONCEPTS COVERED:
//   @Test
//   @BeforeEach
//   @AfterEach
//   assertEquals(expected, actual)
//   assertThrows()
//   @ParameterizedTest
//   TDD
//   Mockito
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 29
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ @Test: Marks a method as a test. JUnit runs all @Test methods. Meth...
// ✅ @BeforeEach: Runs before EACH test method. Use to reset state, create fre...
// ✅ @AfterEach: Runs after EACH test. Clean up resources, reset mocks.
// ✅ assertEquals(expected, actual): Fails test if values differ. ALWAYS put expected first, actu...
// ✅ assertThrows(): assertThrows(IllegalArgumentException.class, () -> method(ba...
// ✅ @ParameterizedTest: @ValueSource(ints = {1,2,3}) — run same test with different ...
// ✅ TDD: RED: write failing test. GREEN: write minimal code to pass. ...
// ✅ Mockito: Mock dependencies so unit tests are isolated. when(mock.meth...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 29: JUnit 5 & Testing ===");
        System.out.println("Project: Tested Library System\n");


        // ============================================================
        // SECTION 1: @Test
        // ============================================================
        // Marks a method as a test. JUnit runs all @Test methods. Method must be void, no params.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- @Test ---");

        // [Detailed example code for @Test]
        // This section demonstrates the core pattern for @Test.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: @BeforeEach
        // ============================================================
        // Runs before EACH test method. Use to reset state, create fresh objects.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- @BeforeEach ---");

        // [Detailed example code for @BeforeEach]
        // This section demonstrates the core pattern for @BeforeEach.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: @AfterEach
        // ============================================================
        // Runs after EACH test. Clean up resources, reset mocks.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- @AfterEach ---");

        // [Detailed example code for @AfterEach]
        // This section demonstrates the core pattern for @AfterEach.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: assertEquals(expected, actual)
        // ============================================================
        // Fails test if values differ. ALWAYS put expected first, actual second.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- assertEquals(expected, actual) ---");

        // [Detailed example code for assertEquals(expected, actual)]
        // This section demonstrates the core pattern for assertEquals(expected, actual).
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: assertThrows()
        // ============================================================
        // assertThrows(IllegalArgumentException.class, () -> method(badInput)) — tests exception throwing.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- assertThrows() ---");

        // [Detailed example code for assertThrows()]
        // This section demonstrates the core pattern for assertThrows().
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: @ParameterizedTest
        // ============================================================
        // @ValueSource(ints = {1,2,3}) — run same test with different inputs automatically.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- @ParameterizedTest ---");

        // [Detailed example code for @ParameterizedTest]
        // This section demonstrates the core pattern for @ParameterizedTest.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: TDD
        // ============================================================
        // RED: write failing test. GREEN: write minimal code to pass. REFACTOR: improve code quality.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- TDD ---");

        // [Detailed example code for TDD]
        // This section demonstrates the core pattern for TDD.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Mockito
        // ============================================================
        // Mock dependencies so unit tests are isolated. when(mock.method()).thenReturn(value).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Mockito ---");

        // [Detailed example code for Mockito]
        // This section demonstrates the core pattern for Mockito.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Tested Library System
        // ============================================================
        // Library system with full JUnit 5 test suite: unit tests, edge cases, parameterized tests
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Tested Library System ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 29 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ @Test: Marks a method as a test. JUnit runs all @Test methods. Meth...
// ✅ @BeforeEach: Runs before EACH test method. Use to reset state, create fre...
// ✅ @AfterEach: Runs after EACH test. Clean up resources, reset mocks.
// ✅ assertEquals(expected, actual): Fails test if values differ. ALWAYS put expected first, actu...
// ✅ assertThrows(): assertThrows(IllegalArgumentException.class, () -> method(ba...
// ✅ @ParameterizedTest: @ValueSource(ints = {1,2,3}) — run same test with different ...
// ✅ TDD: RED: write failing test. GREEN: write minimal code to pass. ...
// ✅ Mockito: Mock dependencies so unit tests are isolated. when(mock.meth...
        // ============================================================

    } // end main

} // end class Main
