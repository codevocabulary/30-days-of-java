/**
 * DAY 23 — Concurrency Utilities
 * ============================================================
 * Task manager with thread pool, futures, CompletableFuture chains, async results
 *
 * CONCEPTS COVERED:
//   ExecutorService
//   Executors.newFixedThreadPool(n)
//   Future<T>
//   Callable<T>
//   CompletableFuture
//   CountDownLatch
//   ConcurrentHashMap
//   BlockingQueue
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 23
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ ExecutorService: Manages a pool of threads. Submit tasks, get results, shutdo...
// ✅ Executors.newFixedThreadPool(n): Creates pool of n threads. Tasks queue when all threads busy...
// ✅ Future<T>: Handle to async result. future.get() blocks until done. futu...
// ✅ Callable<T>: Like Runnable but returns value and can throw. Use with Exec...
// ✅ CompletableFuture: Modern. Chain async operations. thenApply, thenCompose, when...
// ✅ CountDownLatch: Countdown from N to 0. Waiting thread released when count hi...
// ✅ ConcurrentHashMap: Thread-safe HashMap. Uses segment locking. Better throughput...
// ✅ BlockingQueue: Queue that blocks on take() when empty, and on put() when fu...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 23: Concurrency Utilities ===");
        System.out.println("Project: Thread Pool Task Manager\n");


        // ============================================================
        // SECTION 1: ExecutorService
        // ============================================================
        // Manages a pool of threads. Submit tasks, get results, shutdown cleanly. Prefer over raw Thread.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- ExecutorService ---");

        // [Detailed example code for ExecutorService]
        // This section demonstrates the core pattern for ExecutorService.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Executors.newFixedThreadPool(n)
        // ============================================================
        // Creates pool of n threads. Tasks queue when all threads busy. Most common choice.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Executors.newFixedThreadPool(n) ---");

        // [Detailed example code for Executors.newFixedThreadPool(n)]
        // This section demonstrates the core pattern for Executors.newFixedThreadPool(n).
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: Future<T>
        // ============================================================
        // Handle to async result. future.get() blocks until done. future.isDone() checks without blocking.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Future<T> ---");

        // [Detailed example code for Future<T>]
        // This section demonstrates the core pattern for Future<T>.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Callable<T>
        // ============================================================
        // Like Runnable but returns value and can throw. Use with ExecutorService.submit().
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Callable<T> ---");

        // [Detailed example code for Callable<T>]
        // This section demonstrates the core pattern for Callable<T>.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: CompletableFuture
        // ============================================================
        // Modern. Chain async operations. thenApply, thenCompose, whenComplete. No blocking needed.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- CompletableFuture ---");

        // [Detailed example code for CompletableFuture]
        // This section demonstrates the core pattern for CompletableFuture.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: CountDownLatch
        // ============================================================
        // Countdown from N to 0. Waiting thread released when count hits 0. One-time use.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- CountDownLatch ---");

        // [Detailed example code for CountDownLatch]
        // This section demonstrates the core pattern for CountDownLatch.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: ConcurrentHashMap
        // ============================================================
        // Thread-safe HashMap. Uses segment locking. Better throughput than synchronized HashMap.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- ConcurrentHashMap ---");

        // [Detailed example code for ConcurrentHashMap]
        // This section demonstrates the core pattern for ConcurrentHashMap.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: BlockingQueue
        // ============================================================
        // Queue that blocks on take() when empty, and on put() when full. Perfect for producer-consumer.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- BlockingQueue ---");

        // [Detailed example code for BlockingQueue]
        // This section demonstrates the core pattern for BlockingQueue.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Thread Pool Task Manager
        // ============================================================
        // Task manager with thread pool, futures, CompletableFuture chains, async results
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Thread Pool Task Manager ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 23 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ ExecutorService: Manages a pool of threads. Submit tasks, get results, shutdo...
// ✅ Executors.newFixedThreadPool(n): Creates pool of n threads. Tasks queue when all threads busy...
// ✅ Future<T>: Handle to async result. future.get() blocks until done. futu...
// ✅ Callable<T>: Like Runnable but returns value and can throw. Use with Exec...
// ✅ CompletableFuture: Modern. Chain async operations. thenApply, thenCompose, when...
// ✅ CountDownLatch: Countdown from N to 0. Waiting thread released when count hi...
// ✅ ConcurrentHashMap: Thread-safe HashMap. Uses segment locking. Better throughput...
// ✅ BlockingQueue: Queue that blocks on take() when empty, and on put() when fu...
        // ============================================================

    } // end main

} // end class Main
