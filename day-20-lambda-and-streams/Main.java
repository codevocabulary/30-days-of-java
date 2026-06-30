import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * DAY 20 — Lambda Expressions & Stream API
 * ============================================================
 * Lambda expressions are anonymous functions — functions without names.
 * The Stream API lets you process collections in a declarative, pipeline style.
 * Together they enable FUNCTIONAL PROGRAMMING in Java.
 *
 * Project: Employee Data Analytics Pipeline
 * Run: javac Main.java && java Main
 */
public class Main {

    // A simple Employee record for our examples
    record Employee(String name, String dept, double salary, int yearsExp) {}

    public static void main(String[] args) {

        System.out.println("=== DAY 20: Lambda & Stream API ===\n");

        // ============================================================
        // SECTION 1: Lambda Expressions — Basics
        // ============================================================
        // Lambda syntax: (parameters) -> expression
        //           or:  (parameters) -> { statements; }
        //
        // Lambdas implement FUNCTIONAL INTERFACES
        // (interfaces with exactly ONE abstract method)

        System.out.println("--- LAMBDA BASICS ---");

        // Before Java 8: anonymous inner class
        Runnable oldWay = new Runnable() {
            @Override
            public void run() {
                System.out.println("  Running (old anonymous class way)");
            }
        };

        // Java 8+: lambda expression (much cleaner!)
        Runnable newWay = () -> System.out.println("  Running (lambda way)");

        oldWay.run();
        newWay.run();

        // Lambda with parameters
        Comparator<String> byLength = (s1, s2) -> s1.length() - s2.length();

        List<String> words = Arrays.asList("banana", "apple", "kiwi", "cherry", "fig");
        words.sort(byLength);
        System.out.println("\nSorted by length: " + words);

        // ============================================================
        // SECTION 2: Built-in Functional Interfaces
        // ============================================================

        System.out.println("\n--- BUILT-IN FUNCTIONAL INTERFACES ---");

        // Function<T, R>: takes T, returns R
        Function<String, Integer> strToLen = str -> str.length();
        Function<String, String>  toUpper  = str -> str.toUpperCase();
        System.out.println("Length of 'hello': " + strToLen.apply("hello")); // 5
        System.out.println("Upper 'hello': " + toUpper.apply("hello"));       // HELLO

        // Compose functions: toUpper THEN take length
        Function<String, Integer> upperLen = toUpper.andThen(strToLen);
        System.out.println("Upper then length of 'hello': " + upperLen.apply("hello")); // 5

        // Predicate<T>: takes T, returns boolean
        Predicate<Integer> isEven    = n -> n % 2 == 0;
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);

        System.out.println("\n4 is even: "       + isEven.test(4));              // true
        System.out.println("-4 is even: "          + isEven.test(-4));             // true
        System.out.println("4 even AND positive: " + isEvenAndPositive.test(4));  // true
        System.out.println("-4 even AND positive: "+ isEvenAndPositive.test(-4)); // false

        // Consumer<T>: takes T, returns void
        Consumer<String> printer  = s -> System.out.println("  >> " + s);
        Consumer<String> upperPrinter = printer.andThen(s -> System.out.println("  >> " + s.toUpperCase()));

        printer.accept("hello consumer");

        // Supplier<T>: takes nothing, returns T (lazy evaluation)
        Supplier<List<String>> listFactory = () -> new ArrayList<>();
        List<String> freshList = listFactory.get();   // creates new list only when called
        freshList.add("lazy");
        System.out.println("\nSupplier created: " + freshList);

        // ============================================================
        // SECTION 3: Method References
        // ============================================================

        System.out.println("\n--- METHOD REFERENCES ---");
        // Shorthand for lambdas that just call a method.
        // Format: ClassName::methodName or instance::methodName

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        // Instead of: name -> System.out.println(name)
        names.forEach(System.out::println);           // instance method reference

        // Instead of: s -> s.toUpperCase()
        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase) // instance method ref
                                       .collect(Collectors.toList());
        System.out.println("\nUppercase: " + upperNames);

        // Static method reference: instead of n -> Math.abs(n)
        List<Integer> nums = Arrays.asList(-3, 5, -7, 2, -1);
        List<Integer> abs  = nums.stream().map(Math::abs).collect(Collectors.toList());
        System.out.println("Absolute values: " + abs);

        // ============================================================
        // SECTION 4: Stream API — The Pipeline
        // ============================================================

        System.out.println("\n--- STREAM PIPELINE ---");
        // A stream is a SEQUENCE of elements + PIPELINE of operations.
        // Operations are LAZY — nothing executes until terminal op is called.
        //
        // pipeline = source → [intermediate ops...] → terminal op
        //                     (lazy, can chain)       (triggers execution)

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2, 7, 4, 6, 10, 1, 5);

        // Count even numbers > 5
        long count = numbers.stream()         // create stream
                             .filter(n -> n % 2 == 0)  // keep even
                             .filter(n -> n > 5)         // keep > 5
                             .count();                   // terminal: count
        System.out.println("Even numbers > 5: " + count);

        // Sum of distinct numbers, squared
        int sumOfSquares = numbers.stream()
                                   .distinct()              // remove duplicates
                                   .mapToInt(n -> n * n)    // square each (IntStream)
                                   .sum();                  // terminal: sum
        System.out.println("Sum of distinct squares: " + sumOfSquares);

        // Sorted, filtered, limited
        List<Integer> top3Even = numbers.stream()
                                         .filter(n -> n % 2 == 0)
                                         .distinct()
                                         .sorted(Comparator.reverseOrder())
                                         .limit(3)
                                         .collect(Collectors.toList());
        System.out.println("Top 3 even (sorted desc): " + top3Even);

        // ============================================================
        // SECTION 5: Collectors — Gathering Results
        // ============================================================

        System.out.println("\n--- COLLECTORS ---");

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "apricot", "blueberry", "avocado");

        // toList()
        List<String> aFruits = fruits.stream()
                                     .filter(f -> f.startsWith("a"))
                                     .collect(Collectors.toList());
        System.out.println("Fruits starting with 'a': " + aFruits);

        // joining() — concatenate strings
        String joined = fruits.stream()
                               .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Joined: " + joined);

        // groupingBy() — group into a Map
        Map<Integer, List<String>> byLength = fruits.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println("\nGrouped by length:");
        byLength.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("  length " + e.getKey() + ": " + e.getValue()));

        // counting() with groupingBy
        Map<Character, Long> countByFirstChar = fruits.stream()
            .collect(Collectors.groupingBy(f -> f.charAt(0), Collectors.counting()));
        System.out.println("\nCount by first character: " + countByFirstChar);

        // ============================================================
        // MINI PROJECT: Employee Analytics Pipeline
        // ============================================================

        System.out.println("\n=== MINI PROJECT: Employee Analytics ===\n");

        List<Employee> employees = List.of(
            new Employee("Alice",   "Engineering", 95000, 5),
            new Employee("Bob",     "Marketing",   62000, 3),
            new Employee("Carol",   "Engineering", 105000, 8),
            new Employee("Dave",    "HR",          58000, 2),
            new Employee("Eve",     "Engineering", 88000, 4),
            new Employee("Frank",   "Marketing",   71000, 6),
            new Employee("Grace",   "Engineering", 110000, 10),
            new Employee("Hank",    "HR",          65000, 4),
            new Employee("Iris",    "Marketing",   79000, 7),
            new Employee("Jack",    "Engineering", 92000, 5)
        );

        // 1. Average salary by department
        System.out.println("1. Average salary by department:");
        employees.stream()
                 .collect(Collectors.groupingBy(Employee::dept,
                          Collectors.averagingDouble(Employee::salary)))
                 .entrySet().stream()
                 .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                 .forEach(e -> System.out.printf("   %-15s $%,.0f%n", e.getKey(), e.getValue()));

        // 2. Top 3 highest-paid employees
        System.out.println("\n2. Top 3 highest-paid:");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                 .limit(3)
                 .forEach(e -> System.out.printf("   %-10s %-15s $%,.0f%n",
                                                  e.name(), e.dept(), e.salary()));

        // 3. Employees eligible for promotion (5+ years, < $100k)
        System.out.println("\n3. Promotion candidates (5+ years, salary < $100k):");
        employees.stream()
                 .filter(e -> e.yearsExp() >= 5 && e.salary() < 100000)
                 .forEach(e -> System.out.printf("   %-10s %d years exp%n", e.name(), e.yearsExp()));

        // 4. Salary statistics
        DoubleSummaryStatistics stats = employees.stream()
                .mapToDouble(Employee::salary)
                .summaryStatistics();

        System.out.printf("\n4. Salary Statistics:%n");
        System.out.printf("   Count  : %d%n", stats.getCount());
        System.out.printf("   Min    : $%,.0f%n", stats.getMin());
        System.out.printf("   Max    : $%,.0f%n", stats.getMax());
        System.out.printf("   Average: $%,.0f%n", stats.getAverage());
        System.out.printf("   Total  : $%,.0f%n", stats.getSum());

        // 5. Headcount by department
        System.out.println("\n5. Headcount by department:");
        employees.stream()
                 .collect(Collectors.groupingBy(Employee::dept, Collectors.counting()))
                 .entrySet().stream()
                 .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                 .forEach(e -> System.out.printf("   %-15s %d employees%n", e.getKey(), e.getValue()));

        System.out.println("\nDay 20 Complete! Lambdas & Streams mastered! ☕");
    }
}
