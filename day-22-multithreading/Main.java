/**
 * DAY 22 — Multithreading
 * ============================================================
 * Simulates concurrent file downloads with progress tracking and thread coordination
 *
 * CONCEPTS COVERED:
//   Thread
//   Runnable
//   start() vs run()
//   join()
//   Race condition
//   synchronized
//   volatile
//   Deadlock
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 22
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Thread: Lightweight unit of execution within a process. Shares memor...
// ✅ Runnable: Functional interface. Implement run() method. Pass to Thread...
// ✅ start() vs run(): start() creates new thread and calls run() in it. run() alon...
// ✅ join(): thread.join() makes current thread WAIT until 'thread' finis...
// ✅ Race condition: Two threads read-modify-write same variable simultaneously. ...
// ✅ synchronized: Only one thread at a time can execute synchronized block/met...
// ✅ volatile: Guarantees visibility — changes to volatile variable are imm...
// ✅ Deadlock: Thread A holds Lock1, waits for Lock2. Thread B holds Lock2,...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 22: Multithreading ===");
        System.out.println("Project: Concurrent Download Simulator\n");


        // ============================================================
        // SECTION 1: Thread
        // ============================================================
        // Lightweight unit of execution within a process. Shares memory with other threads in same process.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Thread ---");

        // [Detailed example code for Thread]
        // This section demonstrates the core pattern for Thread.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Runnable
        // ============================================================
        // Functional interface. Implement run() method. Pass to Thread constructor. Preferred over extending Thread.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Runnable ---");

        // [Detailed example code for Runnable]
        // This section demonstrates the core pattern for Runnable.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: start() vs run()
        // ============================================================
        // start() creates new thread and calls run() in it. run() alone just executes in CURRENT thread!
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- start() vs run() ---");

        // [Detailed example code for start() vs run()]
        // This section demonstrates the core pattern for start() vs run().
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: join()
        // ============================================================
        // thread.join() makes current thread WAIT until 'thread' finishes. Essential for coordination.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- join() ---");

        // [Detailed example code for join()]
        // This section demonstrates the core pattern for join().
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Race condition
        // ============================================================
        // Two threads read-modify-write same variable simultaneously. Result is unpredictable.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Race condition ---");

        // [Detailed example code for Race condition]
        // This section demonstrates the core pattern for Race condition.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: synchronized
        // ============================================================
        // Only one thread at a time can execute synchronized block/method. Uses object's monitor lock.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- synchronized ---");

        // [Detailed example code for synchronized]
        // This section demonstrates the core pattern for synchronized.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: volatile
        // ============================================================
        // Guarantees visibility — changes to volatile variable are immediately visible to all threads.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- volatile ---");

        // [Detailed example code for volatile]
        // This section demonstrates the core pattern for volatile.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Deadlock
        // ============================================================
        // Thread A holds Lock1, waits for Lock2. Thread B holds Lock2, waits for Lock1. Both stuck forever.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Deadlock ---");

        // [Detailed example code for Deadlock]
        // This section demonstrates the core pattern for Deadlock.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Concurrent Download Simulator
        // ============================================================
        // Simulates concurrent file downloads with progress tracking and thread coordination
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Concurrent Download Simulator ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 22 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Thread: Lightweight unit of execution within a process. Shares memor...
// ✅ Runnable: Functional interface. Implement run() method. Pass to Thread...
// ✅ start() vs run(): start() creates new thread and calls run() in it. run() alon...
// ✅ join(): thread.join() makes current thread WAIT until 'thread' finis...
// ✅ Race condition: Two threads read-modify-write same variable simultaneously. ...
// ✅ synchronized: Only one thread at a time can execute synchronized block/met...
// ✅ volatile: Guarantees visibility — changes to volatile variable are imm...
// ✅ Deadlock: Thread A holds Lock1, waits for Lock2. Thread B holds Lock2,...
        // ============================================================

    } // end main

} // end class Main
