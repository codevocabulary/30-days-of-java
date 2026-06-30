/**
 * DAY 04 — Control Flow
 * ============================================================
 * Control flow determines which code runs and when.
 * Without it, code runs straight down, once.
 * With it, code can branch, choose, and decide.
 *
 * Project: Grade Classifier System
 * Run: javac Main.java && java Main
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== DAY 04: Control Flow ===\n");

        // ============================================================
        // SECTION 1: if / else if / else
        // ============================================================
        // Most fundamental decision-making construct.
        // Java evaluates conditions TOP to BOTTOM, executes FIRST match.

        System.out.println("--- if / else if / else ---");

        int score = 78;

        // Standard if-else chain
        if (score >= 90) {
            System.out.println("Grade: A — Excellent!");
        } else if (score >= 80) {
            System.out.println("Grade: B — Good!");
        } else if (score >= 70) {
            System.out.println("Grade: C — Satisfactory");  // ← this runs
        } else if (score >= 60) {
            System.out.println("Grade: D — Needs Improvement");
        } else {
            System.out.println("Grade: F — Failing");
        }

        // ============================================================
        // SECTION 2: switch Statement (Traditional)
        // ============================================================
        // Best when ONE value is tested against MANY discrete options.
        // Always add break unless fall-through is intentional!

        System.out.println("\n--- switch (traditional) ---");

        int dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday — Start of week");
                break;   // ← CRITICAL: without break, falls to case 2!
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday — Midweek!");  // ← runs
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday — TGIF!");
                break;
            case 6:
            case 7:  // ← intentional fall-through: 6 and 7 share behavior
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // ============================================================
        // SECTION 3: switch Expression (Java 14+) — Modern Style
        // ============================================================
        // Arrow syntax (->): no fall-through, can return values, cleaner!

        System.out.println("\n--- switch expression (Java 14+) ---");

        String season = "WINTER";

        // switch EXPRESSION returns a value — assign directly
        String activity = switch (season) {
            case "SPRING" -> "Plant flowers";
            case "SUMMER" -> "Go swimming";
            case "FALL"   -> "Rake leaves";
            case "WINTER" -> "Build a snowman";  // ← chosen
            default       -> "Stay home";
        };
        System.out.println("Season: " + season + " → Activity: " + activity);

        // switch with yield (multi-statement case in expression)
        int month = 4;
        int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11           -> 30;
            case 2 -> {
                // Multiple statements need yield to return value
                boolean leapYear = false; // simplified
                yield leapYear ? 29 : 28;
            }
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
        System.out.println("Month " + month + " has " + daysInMonth + " days");

        // ============================================================
        // SECTION 4: Ternary Operator
        // ============================================================
        // Inline if-else for simple single-expression decisions.
        // condition ? valueIfTrue : valueIfFalse

        System.out.println("\n--- Ternary Operator ---");

        int age = 20;
        String status = age >= 18 ? "Adult" : "Minor";
        System.out.println("Age " + age + " → " + status);

        // Nested ternary (use sparingly — readability suffers quickly)
        int temp = 28;
        String weather = temp > 35 ? "Hot" :
                         temp > 25 ? "Warm" :   // ← chosen (28 > 25)
                         temp > 15 ? "Mild" :
                         temp > 5  ? "Cold" : "Freezing";
        System.out.println("Temperature " + temp + "°C → " + weather);

        // ============================================================
        // SECTION 5: Pattern Matching with instanceof (Java 16+)
        // ============================================================

        System.out.println("\n--- Pattern Matching instanceof (Java 16+) ---");

        Object obj = "Hello, Java!";

        // Old way (Java 15 and below):
        if (obj instanceof String) {
            String str = (String) obj;  // manual cast needed
            System.out.println("Old way — length: " + str.length());
        }

        // New way (Java 16+) — test AND cast in one line:
        if (obj instanceof String str) {  // tests AND binds to 'str' if true
            System.out.println("New way — length: " + str.length());
            System.out.println("Upper: " + str.toUpperCase());
        }

        // Very useful with multiple types
        Object[] things = { 42, "hello", 3.14, true, new int[]{1,2,3} };
        for (Object thing : things) {
            String desc = switch (thing) {
                // Java 21 switch patterns (preview)
                // For older Java, use if-else instanceof chain
                default -> {
                    if (thing instanceof Integer n)  yield "int: " + n;
                    if (thing instanceof String  s)  yield "String: \"" + s + "\"";
                    if (thing instanceof Double  d)  yield "double: " + d;
                    if (thing instanceof Boolean b)  yield "boolean: " + b;
                    yield "other: " + thing.getClass().getSimpleName();
                }
            };
            System.out.println("  " + desc);
        }

        // ============================================================
        // MINI PROJECT: Grade Classifier System
        // ============================================================

        System.out.println("\n=== MINI PROJECT: Grade Classifier ===\n");

        int[] studentScores = { 95, 82, 67, 55, 91, 73, 45, 88 };
        String[] studentNames = { "Alice", "Bob", "Carol", "Dave", "Eve", "Frank", "Grace", "Hank" };

        System.out.printf("%-10s %6s %6s %12s%n", "Student", "Score", "Grade", "Remark");
        System.out.println("-".repeat(40));

        int totalScore = 0;
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;

        for (int i = 0; i < studentScores.length; i++) {
            int    s     = studentScores[i];
            String name  = studentNames[i];

            // switch expression for grade (clean, modern style)
            String grade = switch (s / 10) {
                case 10, 9 -> "A";
                case 8     -> "B";
                case 7     -> "C";
                case 6     -> "D";
                default    -> "F";
            };

            String remark = switch (grade) {
                case "A" -> "Excellent ⭐";
                case "B" -> "Good 👍";
                case "C" -> "Average";
                case "D" -> "Below Average";
                default  -> "Failing ⚠️";
            };

            System.out.printf("%-10s %6d %6s %12s%n", name, s, grade, remark);
            totalScore += s;

            // Count grades
            switch (grade) {
                case "A" -> aCount++;
                case "B" -> bCount++;
                case "C" -> cCount++;
                case "D" -> dCount++;
                default  -> fCount++;
            }
        }

        System.out.println("-".repeat(40));
        System.out.printf("Average score: %.1f%n", (double) totalScore / studentScores.length);
        System.out.printf("Grade distribution: A=%d B=%d C=%d D=%d F=%d%n",
                           aCount, bCount, cCount, dCount, fCount);

        System.out.println("\nDay 04 Complete! ☕");
    }
}
