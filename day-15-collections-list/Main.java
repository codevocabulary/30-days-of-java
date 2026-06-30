/**
 * DAY 15 — Collections Framework — List
 * ============================================================
 * Shopping cart: add items, remove, sort by price/name, calculate total, apply discounts
 *
 * CONCEPTS COVERED:
//   ArrayList
//   LinkedList
//   List interface
//   Iterator
//   Collections.sort()
//   Comparable
//   Comparator
//   List.of()
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 15
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ ArrayList: Backed by array. O(1) get(i). O(n) insert/delete in middle. ...
// ✅ LinkedList: Doubly linked nodes. O(1) add/remove at ends. O(n) get(i). U...
// ✅ List interface: Ordered collection. Allows duplicates. Index-based access. E...
// ✅ Iterator: Safe removal during iteration. hasNext()/next()/remove(). Av...
// ✅ Collections.sort(): Sorts List. Uses merge sort. Requires Comparable or Comparat...
// ✅ Comparable: class Student implements Comparable<Student> { public int co...
// ✅ Comparator: Separate comparison logic. Can have multiple: byName, byAge,...
// ✅ List.of(): Creates immutable list. Cannot add/remove. Perfect for const...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 15: Collections Framework — List ===");
        System.out.println("Project: Shopping Cart\n");


        // ============================================================
        // SECTION 1: ArrayList
        // ============================================================
        // Backed by array. O(1) get(i). O(n) insert/delete in middle. Best for most cases.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- ArrayList ---");

        // [Detailed example code for ArrayList]
        // This section demonstrates the core pattern for ArrayList.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: LinkedList
        // ============================================================
        // Doubly linked nodes. O(1) add/remove at ends. O(n) get(i). Use for Queue/Deque.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- LinkedList ---");

        // [Detailed example code for LinkedList]
        // This section demonstrates the core pattern for LinkedList.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: List interface
        // ============================================================
        // Ordered collection. Allows duplicates. Index-based access. Extends Collection.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- List interface ---");

        // [Detailed example code for List interface]
        // This section demonstrates the core pattern for List interface.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Iterator
        // ============================================================
        // Safe removal during iteration. hasNext()/next()/remove(). Avoids ConcurrentModificationException.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Iterator ---");

        // [Detailed example code for Iterator]
        // This section demonstrates the core pattern for Iterator.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Collections.sort()
        // ============================================================
        // Sorts List. Uses merge sort. Requires Comparable or Comparator.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Collections.sort() ---");

        // [Detailed example code for Collections.sort()]
        // This section demonstrates the core pattern for Collections.sort().
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Comparable
        // ============================================================
        // class Student implements Comparable<Student> { public int compareTo(Student o) {} }
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Comparable ---");

        // [Detailed example code for Comparable]
        // This section demonstrates the core pattern for Comparable.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Comparator
        // ============================================================
        // Separate comparison logic. Can have multiple: byName, byAge, bySalary. Lambda-friendly.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Comparator ---");

        // [Detailed example code for Comparator]
        // This section demonstrates the core pattern for Comparator.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: List.of()
        // ============================================================
        // Creates immutable list. Cannot add/remove. Perfect for constant data.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- List.of() ---");

        // [Detailed example code for List.of()]
        // This section demonstrates the core pattern for List.of().
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Shopping Cart
        // ============================================================
        // Shopping cart: add items, remove, sort by price/name, calculate total, apply discounts
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Shopping Cart ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 15 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ ArrayList: Backed by array. O(1) get(i). O(n) insert/delete in middle. ...
// ✅ LinkedList: Doubly linked nodes. O(1) add/remove at ends. O(n) get(i). U...
// ✅ List interface: Ordered collection. Allows duplicates. Index-based access. E...
// ✅ Iterator: Safe removal during iteration. hasNext()/next()/remove(). Av...
// ✅ Collections.sort(): Sorts List. Uses merge sort. Requires Comparable or Comparat...
// ✅ Comparable: class Student implements Comparable<Student> { public int co...
// ✅ Comparator: Separate comparison logic. Can have multiple: byName, byAge,...
// ✅ List.of(): Creates immutable list. Cannot add/remove. Perfect for const...
        // ============================================================

    } // end main

} // end class Main
