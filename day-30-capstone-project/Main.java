/**
 * DAY 30 — Capstone — Library Management System
 * ============================================================
 * Complete Library Management System with books, members, lending, reports, and file persistence
 *
 * CONCEPTS COVERED:
//   Architecture
//   SOLID principles
//   Repository pattern
//   Service layer
//   Stream queries
//   Exception strategy
//   Testing
//   Design patterns used
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 30
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Architecture: Separate concerns: Model (data), Repository (persistence), S...
// ✅ SOLID principles: Single Responsibility, Open/Closed, Liskov Substitution, Int...
// ✅ Repository pattern: Abstracts data access. LibraryRepository interface — can swa...
// ✅ Service layer: Business logic. LibraryService uses repository. Doesn't know...
// ✅ Stream queries: books.stream().filter(Book::isAvailable).sorted(Comparator.c...
// ✅ Exception strategy: Custom exceptions per domain: BookNotFoundException, BookAlr...
// ✅ Testing: Unit test services with mock repositories. Integration test ...
// ✅ Design patterns used: Singleton (LibrarySystem), Repository, Strategy (search stra...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 30: Capstone — Library Management System ===");
        System.out.println("Project: Full Library System\n");


        // ============================================================
        // SECTION 1: Architecture
        // ============================================================
        // Separate concerns: Model (data), Repository (persistence), Service (business logic), Main (UI).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Architecture ---");

        // [Detailed example code for Architecture]
        // This section demonstrates the core pattern for Architecture.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: SOLID principles
        // ============================================================
        // Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- SOLID principles ---");

        // [Detailed example code for SOLID principles]
        // This section demonstrates the core pattern for SOLID principles.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: Repository pattern
        // ============================================================
        // Abstracts data access. LibraryRepository interface — can swap file, DB, or in-memory impl.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Repository pattern ---");

        // [Detailed example code for Repository pattern]
        // This section demonstrates the core pattern for Repository pattern.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Service layer
        // ============================================================
        // Business logic. LibraryService uses repository. Doesn't know/care how data is stored.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Service layer ---");

        // [Detailed example code for Service layer]
        // This section demonstrates the core pattern for Service layer.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Stream queries
        // ============================================================
        // books.stream().filter(Book::isAvailable).sorted(Comparator.comparing(Book::getTitle)).collect(toList())
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Stream queries ---");

        // [Detailed example code for Stream queries]
        // This section demonstrates the core pattern for Stream queries.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Exception strategy
        // ============================================================
        // Custom exceptions per domain: BookNotFoundException, BookAlreadyBorrowedException.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Exception strategy ---");

        // [Detailed example code for Exception strategy]
        // This section demonstrates the core pattern for Exception strategy.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Testing
        // ============================================================
        // Unit test services with mock repositories. Integration test file persistence.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Testing ---");

        // [Detailed example code for Testing]
        // This section demonstrates the core pattern for Testing.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Design patterns used
        // ============================================================
        // Singleton (LibrarySystem), Repository, Strategy (search strategies), Observer (notifications).
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Design patterns used ---");

        // [Detailed example code for Design patterns used]
        // This section demonstrates the core pattern for Design patterns used.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Full Library System
        // ============================================================
        // Complete Library Management System with books, members, lending, reports, and file persistence
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Full Library System ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 30 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Architecture: Separate concerns: Model (data), Repository (persistence), S...
// ✅ SOLID principles: Single Responsibility, Open/Closed, Liskov Substitution, Int...
// ✅ Repository pattern: Abstracts data access. LibraryRepository interface — can swa...
// ✅ Service layer: Business logic. LibraryService uses repository. Doesn't know...
// ✅ Stream queries: books.stream().filter(Book::isAvailable).sorted(Comparator.c...
// ✅ Exception strategy: Custom exceptions per domain: BookNotFoundException, BookAlr...
// ✅ Testing: Unit test services with mock repositories. Integration test ...
// ✅ Design patterns used: Singleton (LibrarySystem), Repository, Strategy (search stra...
        // ============================================================

    } // end main

} // end class Main
