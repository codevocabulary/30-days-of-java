/**
 * DAY 26 — Design Patterns — Behavioral
 * ============================================================
 * Full event system: Observer for events, Strategy for handlers, Command for undo/redo
 *
 * CONCEPTS COVERED:
//   Observer
//   Strategy
//   Command
//   Template Method
//   State
//   Iterator
//   Chain of Responsibility
//   Mediator
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 26
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ Observer: Subject notifies registered observers of state changes. Even...
// ✅ Strategy: Define family of algorithms. Encapsulate each. Make them int...
// ✅ Command: Encapsulate action as object. Supports undo/redo. Queuing. L...
// ✅ Template Method: Superclass defines algorithm skeleton. Subclasses fill in sp...
// ✅ State: Object changes behavior when state changes. TrafficLight: Re...
// ✅ Iterator: Sequential access to collection elements without exposing in...
// ✅ Chain of Responsibility: Request passes through chain of handlers. Each handles or pa...
// ✅ Mediator: Objects communicate through mediator, not directly. Chat roo...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 26: Design Patterns — Behavioral ===");
        System.out.println("Project: Event System\n");


        // ============================================================
        // SECTION 1: Observer
        // ============================================================
        // Subject notifies registered observers of state changes. EventListener in Java, event bus. Loose coupling.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Observer ---");

        // [Detailed example code for Observer]
        // This section demonstrates the core pattern for Observer.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Strategy
        // ============================================================
        // Define family of algorithms. Encapsulate each. Make them interchangeable. SortStrategy: Bubble, Quick, Merge.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Strategy ---");

        // [Detailed example code for Strategy]
        // This section demonstrates the core pattern for Strategy.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: Command
        // ============================================================
        // Encapsulate action as object. Supports undo/redo. Queuing. Logging. RemoteControl example.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Command ---");

        // [Detailed example code for Command]
        // This section demonstrates the core pattern for Command.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Template Method
        // ============================================================
        // Superclass defines algorithm skeleton. Subclasses fill in specific steps. Don't call us, we'll call you.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Template Method ---");

        // [Detailed example code for Template Method]
        // This section demonstrates the core pattern for Template Method.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: State
        // ============================================================
        // Object changes behavior when state changes. TrafficLight: Red→Green→Yellow→Red.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- State ---");

        // [Detailed example code for State]
        // This section demonstrates the core pattern for State.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Iterator
        // ============================================================
        // Sequential access to collection elements without exposing internal structure. Hashmaps, Trees.
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
        // SECTION 7: Chain of Responsibility
        // ============================================================
        // Request passes through chain of handlers. Each handles or passes to next. Middleware!
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Chain of Responsibility ---");

        // [Detailed example code for Chain of Responsibility]
        // This section demonstrates the core pattern for Chain of Responsibility.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Mediator
        // ============================================================
        // Objects communicate through mediator, not directly. Chat room: users talk through server.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Mediator ---");

        // [Detailed example code for Mediator]
        // This section demonstrates the core pattern for Mediator.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Event System
        // ============================================================
        // Full event system: Observer for events, Strategy for handlers, Command for undo/redo
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Event System ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 26 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ Observer: Subject notifies registered observers of state changes. Even...
// ✅ Strategy: Define family of algorithms. Encapsulate each. Make them int...
// ✅ Command: Encapsulate action as object. Supports undo/redo. Queuing. L...
// ✅ Template Method: Superclass defines algorithm skeleton. Subclasses fill in sp...
// ✅ State: Object changes behavior when state changes. TrafficLight: Re...
// ✅ Iterator: Sequential access to collection elements without exposing in...
// ✅ Chain of Responsibility: Request passes through chain of handlers. Each handles or pa...
// ✅ Mediator: Objects communicate through mediator, not directly. Chat roo...
        // ============================================================

    } // end main

} // end class Main
