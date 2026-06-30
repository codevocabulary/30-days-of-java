/**
 * DAY 05 — Loops
 * ============================================================
 * Loops execute a block of code REPEATEDLY until a condition
 * is no longer true. They are the engine of repetition.
 *
 * Project: Pattern Printer + FizzBuzz + Prime Finder
 * Run: javac Main.java && java Main
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== DAY 05: Loops ===\n");

        // ============================================================
        // SECTION 1: for Loop — When you know iteration count
        // ============================================================
        // for (initialization; condition; update) { body }
        //   init    → runs ONCE before loop starts
        //   condition → checked BEFORE each iteration (false = stop)
        //   update  → runs AFTER each iteration body

        System.out.println("--- for Loop ---");

        // Count 1 to 10
        System.out.print("1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Count down
        System.out.print("Countdown: ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("GO!");

        // Step by 3
        System.out.print("Multiples of 3 (1-30): ");
        for (int i = 3; i <= 30; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ============================================================
        // SECTION 2: Enhanced for-each Loop
        // ============================================================
        // for (Type element : collection) — iterates over elements
        // Cleaner when you don't need the index.

        System.out.println("\n--- Enhanced for-each ---");

        String[] languages = {"Java", "Python", "C++", "JavaScript", "Go"};

        for (String lang : languages) {
            System.out.println("  Learning: " + lang);
        }

        // Can also iterate arrays, Lists, Sets — any Iterable

        // ============================================================
        // SECTION 3: while Loop — When count is unknown
        // ============================================================
        // while (condition) — checks condition BEFORE each iteration

        System.out.println("\n--- while Loop ---");

        // Simulate reading lines until we hit an "empty" line
        String[] lines = {"Hello", "World", "", "This never prints"};
        int lineIdx = 0;

        while (lineIdx < lines.length && !lines[lineIdx].isEmpty()) {
            System.out.println("  Read: " + lines[lineIdx]);
            lineIdx++;
        }
        System.out.println("  Stopped at empty line (index " + lineIdx + ")");

        // Collatz conjecture — unknown iterations!
        int n = 27;
        int steps = 0;
        System.out.print("\nCollatz(" + n + "): " + n);
        while (n != 1) {
            if (n % 2 == 0) n = n / 2;
            else            n = 3 * n + 1;
            System.out.print(" → " + n);
            steps++;
            if (steps % 10 == 0) System.out.print("\n          "); // wrap
        }
        System.out.println(" (" + steps + " steps)");

        // ============================================================
        // SECTION 4: do-while Loop — Runs at least once
        // ============================================================
        // do { body } while (condition)
        // Condition checked AFTER body runs — body always executes once.

        System.out.println("\n--- do-while Loop ---");

        // Simulate a menu (always shows at least once)
        int attempt = 1;
        int maxAttempts = 3;
        boolean success = false;

        do {
            System.out.println("  Attempt " + attempt + " of " + maxAttempts);
            if (attempt == 2) {  // simulating success on attempt 2
                success = true;
            }
            attempt++;
        } while (!success && attempt <= maxAttempts);

        System.out.println("  Result: " + (success ? "Succeeded on attempt " + (attempt-1) : "All attempts failed"));

        // ============================================================
        // SECTION 5: break and continue
        // ============================================================

        System.out.println("\n--- break and continue ---");

        // break: exits the ENTIRE loop immediately
        System.out.print("break example (stop at 5): ");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;  // stop when i reaches 6
            System.out.print(i + " ");
        }
        System.out.println("(stopped)");

        // continue: skip THIS iteration, go to NEXT
        System.out.print("continue example (skip evens): ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;  // skip even numbers
            System.out.print(i + " ");
        }
        System.out.println();

        // ============================================================
        // SECTION 6: Nested Loops
        // ============================================================

        System.out.println("\n--- Nested Loops: Multiplication Table ---");

        System.out.printf("%5s", "×");
        for (int j = 1; j <= 5; j++) System.out.printf("%5d", j);
        System.out.println();
        System.out.println("  " + "─".repeat(27));

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%4d |", i);
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }

        // ============================================================
        // MINI PROJECT: FizzBuzz + Patterns + Prime Finder
        // ============================================================

        System.out.println("\n=== MINI PROJECT ===\n");

        // FizzBuzz
        System.out.println("FizzBuzz (1-30):");
        StringBuilder fb = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            if      (i % 15 == 0) fb.append("FizzBuzz ");
            else if (i % 3  == 0) fb.append("Fizz ");
            else if (i % 5  == 0) fb.append("Buzz ");
            else                   fb.append(i).append(" ");
        }
        System.out.println(fb.toString().trim());

        // Triangle pattern
        System.out.println("\nPyramid (height 5):");
        int height = 5;
        for (int row = 1; row <= height; row++) {
            // Print spaces for centering
            for (int sp = 0; sp < height - row; sp++) System.out.print(" ");
            // Print stars
            for (int st = 0; st < 2 * row - 1; st++) System.out.print("*");
            System.out.println();
        }

        // Prime numbers using nested loops
        System.out.println("\nPrime numbers up to 50:");
        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;  // no need to check further
                }
            }
            if (isPrime) System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nDay 05 Complete! ☕");
    }
}
