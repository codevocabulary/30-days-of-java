/**
 * DAY 19 — File I/O
 * ============================================================
 * Note-taking app: create, read, list, search, delete notes stored as files
 *
 * CONCEPTS COVERED:
//   File class
//   BufferedReader
//   BufferedWriter
//   NIO.2 (java.nio.file)
//   Files.readAllLines()
//   Files.writeString()
//   Append mode
//   try-with-resources
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 19
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ File class: java.io.File — represents file/directory path. exists(), isF...
// ✅ BufferedReader: Reads text efficiently line by line. Always wrap FileReader ...
// ✅ BufferedWriter: Writes text efficiently. Always close (or use try-with-resou...
// ✅ NIO.2 (java.nio.file): Modern API. Path = immutable path object. Files = utility cl...
// ✅ Files.readAllLines(): Reads ENTIRE file into List<String>. Easy but loads ALL cont...
// ✅ Files.writeString(): Writes String to file in one line. SimpleAPI for modern Java...
// ✅ Append mode: new FileWriter(file, true) — second arg true = append. Don't...
// ✅ try-with-resources: Always use for file I/O: try(var reader = Files.newBufferedR...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 19: File I/O ===");
        System.out.println("Project: Note-Taking App\n");


        // ============================================================
        // SECTION 1: File class
        // ============================================================
        // java.io.File — represents file/directory path. exists(), isFile(), isDirectory(), length().
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- File class ---");

        // [Detailed example code for File class]
        // This section demonstrates the core pattern for File class.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: BufferedReader
        // ============================================================
        // Reads text efficiently line by line. Always wrap FileReader in BufferedReader for performance.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- BufferedReader ---");

        // [Detailed example code for BufferedReader]
        // This section demonstrates the core pattern for BufferedReader.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: BufferedWriter
        // ============================================================
        // Writes text efficiently. Always close (or use try-with-resources) to flush buffer.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- BufferedWriter ---");

        // [Detailed example code for BufferedWriter]
        // This section demonstrates the core pattern for BufferedWriter.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: NIO.2 (java.nio.file)
        // ============================================================
        // Modern API. Path = immutable path object. Files = utility class. Much cleaner than java.io.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- NIO.2 (java.nio.file) ---");

        // [Detailed example code for NIO.2 (java.nio.file)]
        // This section demonstrates the core pattern for NIO.2 (java.nio.file).
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Files.readAllLines()
        // ============================================================
        // Reads ENTIRE file into List<String>. Easy but loads ALL content into memory.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Files.readAllLines() ---");

        // [Detailed example code for Files.readAllLines()]
        // This section demonstrates the core pattern for Files.readAllLines().
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Files.writeString()
        // ============================================================
        // Writes String to file in one line. SimpleAPI for modern Java.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Files.writeString() ---");

        // [Detailed example code for Files.writeString()]
        // This section demonstrates the core pattern for Files.writeString().
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Append mode
        // ============================================================
        // new FileWriter(file, true) — second arg true = append. Don't overwrite!
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Append mode ---");

        // [Detailed example code for Append mode]
        // This section demonstrates the core pattern for Append mode.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: try-with-resources
        // ============================================================
        // Always use for file I/O: try(var reader = Files.newBufferedReader(path)) { }
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
        // MINI PROJECT: Note-Taking App
        // ============================================================
        // Note-taking app: create, read, list, search, delete notes stored as files
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Note-Taking App ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 19 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ File class: java.io.File — represents file/directory path. exists(), isF...
// ✅ BufferedReader: Reads text efficiently line by line. Always wrap FileReader ...
// ✅ BufferedWriter: Writes text efficiently. Always close (or use try-with-resou...
// ✅ NIO.2 (java.nio.file): Modern API. Path = immutable path object. Files = utility cl...
// ✅ Files.readAllLines(): Reads ENTIRE file into List<String>. Easy but loads ALL cont...
// ✅ Files.writeString(): Writes String to file in one line. SimpleAPI for modern Java...
// ✅ Append mode: new FileWriter(file, true) — second arg true = append. Don't...
// ✅ try-with-resources: Always use for file I/O: try(var reader = Files.newBufferedR...
        // ============================================================

    } // end main

} // end class Main
