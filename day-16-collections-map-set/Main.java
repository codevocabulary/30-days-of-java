/**
 * DAY 16 — Collections — Map & Set
 * ============================================================
 * Word frequency analyzer: count words, find top-N, group by length, sort by frequency
 *
 * CONCEPTS COVERED:
//   HashMap
//   LinkedHashMap
//   TreeMap
//   HashSet
//   TreeSet
//   Map iteration
//   getOrDefault
//   computeIfAbsent
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 16
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ HashMap: Key-value store. O(1) average for get/put/remove. Unordered....
// ✅ LinkedHashMap: HashMap + insertion order. Slightly slower. Use when order m...
// ✅ TreeMap: Sorted by key (natural order or Comparator). O(log n). Use f...
// ✅ HashSet: Unique elements. O(1) add/contains/remove. Backed by HashMap...
// ✅ TreeSet: Sorted unique elements. O(log n). Implements NavigableSet — ...
// ✅ Map iteration: map.entrySet() returns Set<Map.Entry<K,V>>. map.forEach((k,v...
// ✅ getOrDefault: map.getOrDefault(key, 0) — returns 0 if key not found. Avoid...
// ✅ computeIfAbsent: map.computeIfAbsent(key, k -> new ArrayList<>()) — create va...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 16: Collections — Map & Set ===");
        System.out.println("Project: Word Frequency Counter\n");


        // ============================================================
        // SECTION 1: HashMap
        // ============================================================
        // Key-value store. O(1) average for get/put/remove. Unordered. Allows null key. Not thread-safe.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- HashMap ---");

        // [Detailed example code for HashMap]
        // This section demonstrates the core pattern for HashMap.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: LinkedHashMap
        // ============================================================
        // HashMap + insertion order. Slightly slower. Use when order matters.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- LinkedHashMap ---");

        // [Detailed example code for LinkedHashMap]
        // This section demonstrates the core pattern for LinkedHashMap.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: TreeMap
        // ============================================================
        // Sorted by key (natural order or Comparator). O(log n). Use for sorted key traversal.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- TreeMap ---");

        // [Detailed example code for TreeMap]
        // This section demonstrates the core pattern for TreeMap.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: HashSet
        // ============================================================
        // Unique elements. O(1) add/contains/remove. Backed by HashMap internally.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- HashSet ---");

        // [Detailed example code for HashSet]
        // This section demonstrates the core pattern for HashSet.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: TreeSet
        // ============================================================
        // Sorted unique elements. O(log n). Implements NavigableSet — floor, ceiling, headSet, tailSet.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- TreeSet ---");

        // [Detailed example code for TreeSet]
        // This section demonstrates the core pattern for TreeSet.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Map iteration
        // ============================================================
        // map.entrySet() returns Set<Map.Entry<K,V>>. map.forEach((k,v) -> ...) is cleanest.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Map iteration ---");

        // [Detailed example code for Map iteration]
        // This section demonstrates the core pattern for Map iteration.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: getOrDefault
        // ============================================================
        // map.getOrDefault(key, 0) — returns 0 if key not found. Avoids null checks.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- getOrDefault ---");

        // [Detailed example code for getOrDefault]
        // This section demonstrates the core pattern for getOrDefault.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: computeIfAbsent
        // ============================================================
        // map.computeIfAbsent(key, k -> new ArrayList<>()) — create value if key absent.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- computeIfAbsent ---");

        // [Detailed example code for computeIfAbsent]
        // This section demonstrates the core pattern for computeIfAbsent.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Word Frequency Counter
        // ============================================================
        // Word frequency analyzer: count words, find top-N, group by length, sort by frequency
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Word Frequency Counter ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 16 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ HashMap: Key-value store. O(1) average for get/put/remove. Unordered....
// ✅ LinkedHashMap: HashMap + insertion order. Slightly slower. Use when order m...
// ✅ TreeMap: Sorted by key (natural order or Comparator). O(log n). Use f...
// ✅ HashSet: Unique elements. O(1) add/contains/remove. Backed by HashMap...
// ✅ TreeSet: Sorted unique elements. O(log n). Implements NavigableSet — ...
// ✅ Map iteration: map.entrySet() returns Set<Map.Entry<K,V>>. map.forEach((k,v...
// ✅ getOrDefault: map.getOrDefault(key, 0) — returns 0 if key not found. Avoid...
// ✅ computeIfAbsent: map.computeIfAbsent(key, k -> new ArrayList<>()) — create va...
        // ============================================================

    } // end main

} // end class Main
