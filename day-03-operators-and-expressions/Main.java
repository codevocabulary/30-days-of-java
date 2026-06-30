/**
 * DAY 03 — Operators & Expressions
 * ============================================================
 * Operators are the verbs of Java — they act on data.
 * Understanding ALL Java operators and their behavior is
 * essential for writing correct programs.
 *
 * Project: Console Calculator
 * Run: javac Main.java && java Main
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== DAY 03: Operators & Expressions ===\n");

        // ============================================================
        // SECTION 1: Arithmetic Operators
        // ============================================================
        // + (add), - (subtract), * (multiply), / (divide), % (modulus)

        System.out.println("--- ARITHMETIC OPERATORS ---");

        int a = 15, b = 4;

        System.out.println(a + " + " + b + " = " + (a + b));   // 19
        System.out.println(a + " - " + b + " = " + (a - b));   // 11
        System.out.println(a + " * " + b + " = " + (a * b));   // 60
        System.out.println(a + " / " + b + " = " + (a / b));   // 3  ← INTEGER DIVISION!
        System.out.println(a + " % " + b + " = " + (a % b));   // 3  (15 = 4*3 + 3)

        // CRITICAL: Integer division truncates (rounds toward zero)
        System.out.println("\nInteger division trap:");
        System.out.println("15 / 4 = " + (15 / 4));       // 3, NOT 3.75!
        System.out.println("15.0 / 4 = " + (15.0 / 4));   // 3.75 — one double makes result double
        System.out.println("(double)15 / 4 = " + ((double)15 / 4)); // 3.75 — explicit cast

        // Modulus (%) — remainder after division
        System.out.println("\nModulus use cases:");
        System.out.println("7 % 2 = " + (7 % 2));  // 1 → odd number (remainder > 0)
        System.out.println("8 % 2 = " + (8 % 2));  // 0 → even number (no remainder)

        for (int i = 1; i <= 10; i++) {
            String parity = (i % 2 == 0) ? "EVEN" : "ODD";
            System.out.printf("%2d is %s%n", i, parity);
        }

        // ============================================================
        // SECTION 2: Increment & Decrement
        // ============================================================

        System.out.println("\n--- INCREMENT & DECREMENT ---");

        int x = 5;

        // Post-increment: x++ returns current value THEN increments
        System.out.println("x = " + x);          // 5
        System.out.println("x++ = " + x++);      // 5 (returns 5, THEN x becomes 6)
        System.out.println("x is now = " + x);   // 6

        // Pre-increment: ++x increments THEN returns new value
        System.out.println("++x = " + ++x);      // 7 (increments to 7, THEN returns 7)
        System.out.println("x is now = " + x);   // 7

        // Real difference matters in expressions:
        int p = 5;
        int q = p++;   // q = 5 (old value), p = 6
        int r = 5;
        int s = ++r;   // r = 6, s = 6 (new value)
        System.out.printf("p=%d, q=%d (post-increment)%n", p, q);
        System.out.printf("r=%d, s=%d (pre-increment)%n", r, s);

        // ============================================================
        // SECTION 3: Assignment Operators
        // ============================================================

        System.out.println("\n--- ASSIGNMENT OPERATORS ---");

        int n = 100;
        System.out.println("Start: n = " + n);
        n += 50;  System.out.println("n += 50  → " + n);  // 150
        n -= 30;  System.out.println("n -= 30  → " + n);  // 120
        n *= 2;   System.out.println("n *= 2   → " + n);  // 240
        n /= 4;   System.out.println("n /= 4   → " + n);  // 60
        n %= 17;  System.out.println("n %= 17  → " + n);  // 9 (60 = 17*3 + 9)

        // ============================================================
        // SECTION 4: Relational (Comparison) Operators
        // ============================================================

        System.out.println("\n--- RELATIONAL OPERATORS ---");
        // All return boolean: true or false

        int age = 20;
        System.out.println("age = " + age);
        System.out.println("age == 20 : " + (age == 20)); // true
        System.out.println("age != 18 : " + (age != 18)); // true
        System.out.println("age > 18  : " + (age > 18));  // true
        System.out.println("age < 18  : " + (age < 18));  // false
        System.out.println("age >= 20 : " + (age >= 20)); // true
        System.out.println("age <= 20 : " + (age <= 20)); // true

        // ============================================================
        // SECTION 5: Logical Operators
        // ============================================================

        System.out.println("\n--- LOGICAL OPERATORS ---");

        boolean isAdult   = age >= 18;   // true
        boolean hasTicket = true;
        boolean hasID     = false;

        // && (AND): BOTH must be true
        System.out.println("isAdult && hasTicket = " + (isAdult && hasTicket)); // true
        System.out.println("isAdult && hasID     = " + (isAdult && hasID));     // false

        // || (OR): at LEAST ONE must be true
        System.out.println("hasTicket || hasID   = " + (hasTicket || hasID));   // true
        System.out.println("hasID || false       = " + (hasID || false));       // false

        // ! (NOT): flips the boolean
        System.out.println("!isAdult   = " + !isAdult);    // false
        System.out.println("!hasID     = " + !hasID);      // true

        // SHORT-CIRCUIT EVALUATION — crucial concept!
        // && stops at first false (no need to check rest)
        // || stops at first true (no need to check rest)
        System.out.println("\nShort-circuit:");
        int[] arr = null;
        // Without short-circuit: arr.length would throw NullPointerException
        // With &&: arr != null is false → arr.length never evaluated → SAFE!
        boolean safe = (arr != null && arr.length > 0);
        System.out.println("null array check (safe): " + safe); // false, no exception!

        // ============================================================
        // SECTION 6: Ternary Operator
        // ============================================================

        System.out.println("\n--- TERNARY OPERATOR ---");
        // condition ? valueIfTrue : valueIfFalse
        // Use for simple, readable inline decisions

        int score = 85;
        String grade = score >= 90 ? "A" :
                       score >= 80 ? "B" :
                       score >= 70 ? "C" :
                       score >= 60 ? "D" : "F";

        System.out.printf("Score %d → Grade: %s%n", score, grade);

        int num1 = 42, num2 = 17;
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;
        System.out.printf("max(%d, %d) = %d%n", num1, num2, max);
        System.out.printf("min(%d, %d) = %d%n", num1, num2, min);

        // ============================================================
        // SECTION 7: Bitwise Operators
        // ============================================================

        System.out.println("\n--- BITWISE OPERATORS ---");
        // Operate on individual BITS. Useful for flags, permissions, performance tricks.

        int flags = 0b00000000;  // binary literal (Java 7+)
        int READ    = 0b00000100; // bit 2
        int WRITE   = 0b00000010; // bit 1
        int EXECUTE = 0b00000001; // bit 0

        // Set flags using | (OR)
        flags = flags | READ;    // set read bit
        flags = flags | WRITE;   // set write bit
        System.out.printf("After READ|WRITE: %s (decimal: %d)%n", Integer.toBinaryString(flags), flags);

        // Check flag using & (AND)
        boolean canRead    = (flags & READ)    != 0;
        boolean canWrite   = (flags & WRITE)   != 0;
        boolean canExecute = (flags & EXECUTE) != 0;
        System.out.println("Can read:    " + canRead);    // true
        System.out.println("Can write:   " + canWrite);   // true
        System.out.println("Can execute: " + canExecute); // false

        // Left shift << (equivalent to multiply by 2^n)
        System.out.println("\n1 << 0 = " + (1 << 0));   // 1   (1 * 2^0)
        System.out.println("1 << 1 = " + (1 << 1));   // 2   (1 * 2^1)
        System.out.println("1 << 2 = " + (1 << 2));   // 4   (1 * 2^2)
        System.out.println("1 << 8 = " + (1 << 8));   // 256 (1 * 2^8)

        // Right shift >> (equivalent to divide by 2^n, preserves sign)
        System.out.println("256 >> 1 = " + (256 >> 1));  // 128
        System.out.println("256 >> 4 = " + (256 >> 4));  // 16

        // ============================================================
        // SECTION 8: Operator Precedence
        // ============================================================

        System.out.println("\n--- OPERATOR PRECEDENCE ---");
        // Higher precedence operators execute first.
        // When in doubt, use parentheses!

        int result1 = 2 + 3 * 4;       // 14, not 20 (* before +)
        int result2 = (2 + 3) * 4;     // 20 (parentheses override)
        int result3 = 10 - 2 + 3;      // 11 (left-to-right for same precedence)
        boolean logic = 2 > 1 || 3 < 1 && 5 > 4; // true (&& before ||)

        System.out.println("2 + 3 * 4     = " + result1);  // 14
        System.out.println("(2 + 3) * 4   = " + result2);  // 20
        System.out.println("10 - 2 + 3    = " + result3);  // 11
        System.out.println("2>1 || 3<1 && 5>4 = " + logic); // true

        // ============================================================
        // MINI PROJECT: Console Calculator
        // ============================================================

        System.out.println("\n=== MINI PROJECT: Console Calculator ===\n");

        double[] numbers = {100.0, 75.5, 43.2, 88.9, 55.0};

        double sum = 0, product = 1;
        double maximum = numbers[0], minimum = numbers[0];

        for (double num : numbers) {
            sum     += num;
            product *= num;
            if (num > maximum) maximum = num;
            if (num < minimum) minimum = num;
        }

        double average = sum / numbers.length;

        System.out.println("Numbers: ");
        for (double num : numbers) System.out.printf("  %.1f%n", num);
        System.out.printf("%nSum        : %.2f%n", sum);
        System.out.printf("Average    : %.2f%n", average);
        System.out.printf("Maximum    : %.2f%n", maximum);
        System.out.printf("Minimum    : %.2f%n", minimum);
        System.out.printf("Range      : %.2f%n", maximum - minimum);

        // Percentage calculations
        System.out.println("\nPercentage of total:");
        for (double num : numbers) {
            double pct = (num / sum) * 100;
            System.out.printf("  %.1f → %.1f%%%n", num, pct);
        }

        System.out.println("\nDay 03 Complete! ☕");
    }
}
