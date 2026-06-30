/**
 * DAY 02 — Variables & Data Types
 * ============================================================
 * Java has 8 primitive types and a rich set of object types.
 * Understanding how each type works, how much memory it uses,
 * and when to use each is fundamental to writing good Java code.
 *
 * Compile: javac Main.java PersonCard.java
 * Run:     java Main
 */
public class Main {

    // ============================================================
    // CLASS-LEVEL CONSTANTS
    // ============================================================
    // 'static' = belongs to the class, not an instance
    // 'final'  = cannot be reassigned after initialization
    // Convention: ALL_CAPS_WITH_UNDERSCORES for constants
    static final double PI        = 3.14159265358979;
    static final int    MAX_SCORE = 100;
    static final String APP_NAME  = "Java Data Types Demo";

    public static void main(String[] args) {

        System.out.println("=== " + APP_NAME + " ===\n");

        // ============================================================
        // PART 1: Integer Primitive Types
        // ============================================================
        // Java has 4 integer types — they differ only in size (range).
        // Use int by default. Use long for very large numbers.

        System.out.println("--- INTEGER TYPES ---");

        // byte: 1 byte of memory, range -128 to 127
        // Use for: saving memory in large arrays, raw binary data
        byte myByte = 100;
        System.out.println("byte  (1 byte)  : " + myByte + "  [range: -128 to 127]");

        // short: 2 bytes, range -32,768 to 32,767
        // Use for: rarely used directly, mostly for legacy code or memory optimization
        short myShort = 30000;
        System.out.println("short (2 bytes) : " + myShort + "  [range: -32,768 to 32,767]");

        // int: 4 bytes, range -2,147,483,648 to 2,147,483,647
        // Use for: DEFAULT choice for all whole numbers
        // Underscores in literals (Java 7+): improve readability, compiler ignores them
        int myInt = 2_000_000;
        System.out.println("int   (4 bytes) : " + myInt + " [range: ~-2.1B to 2.1B]");

        // long: 8 bytes, range -9.2 × 10^18 to 9.2 × 10^18
        // The 'L' or 'l' suffix is REQUIRED to mark a literal as long
        // Without L, Java treats the literal as int and may overflow!
        long myLong = 9_200_000_000L;   // 9.2 billion
        System.out.println("long  (8 bytes) : " + myLong + "  [range: ~-9.2*10^18 to 9.2*10^18]");

        // DEMONSTRATING INTEGER OVERFLOW — a real danger!
        int maxInt = Integer.MAX_VALUE;  // 2,147,483,647
        System.out.println("\nMax int value     : " + maxInt);
        System.out.println("Max int value + 1 : " + (maxInt + 1)); // OVERFLOW! Wraps to -2147483648
        // This is why you must be careful when values can exceed int range

        // ============================================================
        // PART 2: Floating-Point Types
        // ============================================================

        System.out.println("\n--- FLOATING-POINT TYPES ---");

        // float: 4 bytes, ~7 significant decimal digits
        // The 'f' or 'F' suffix is REQUIRED to mark a literal as float
        float myFloat = 3.14f;
        System.out.println("float  (4 bytes, ~7 digits) : " + myFloat);

        // double: 8 bytes, ~15-16 significant decimal digits
        // DEFAULT choice for decimal numbers — no suffix needed
        double myDouble = 3.14159265358979;
        System.out.println("double (8 bytes, ~15 digits): " + myDouble);

        // IMPORTANT: Floating-point precision issue (applies to ALL languages using IEEE 754)
        double sum = 0.1 + 0.2;
        System.out.println("\n0.1 + 0.2 = " + sum);            // 0.30000000000000004 !!
        System.out.println("Expected 0.3, got: " + sum);       // demonstrates the issue

        // Fix 1: Use Math.round for display
        System.out.printf("Rounded to 1 decimal: %.1f%n", sum);  // 0.3

        // Fix 2: Use BigDecimal for financial calculations (covered in advanced topics)
        // BigDecimal b = new BigDecimal("0.1").add(new BigDecimal("0.2")); // exact!

        // Scientific notation for very large/small doubles
        double nano     = 1.5e-9;  // 0.0000000015
        double billion  = 1.5e9;   // 1500000000.0
        System.out.println("\n1.5e-9 = " + nano);
        System.out.println("1.5e9  = " + billion);

        // ============================================================
        // PART 3: boolean
        // ============================================================

        System.out.println("\n--- BOOLEAN TYPE ---");

        // boolean: represents true or false ONLY
        // Java is strict — no integers act as boolean (unlike C/C++)
        boolean isJavaFun     = true;
        boolean hasErrors     = false;
        boolean isEvenNumber  = (10 % 2 == 0);  // expression evaluates to true

        System.out.println("isJavaFun    : " + isJavaFun);
        System.out.println("hasErrors    : " + hasErrors);
        System.out.println("isEvenNumber : " + isEvenNumber);

        // In Java, you CANNOT do: if (1) { } — must be: if (true) { }
        // int x = 1; if (x) { }  ← COMPILE ERROR in Java (unlike C)

        // ============================================================
        // PART 4: char
        // ============================================================

        System.out.println("\n--- CHAR TYPE ---");

        // char: 2 bytes, stores a SINGLE Unicode character (UTF-16)
        // Range: 0 to 65,535 (unsigned)
        // Single quotes ONLY — double quotes create String
        char letter  = 'A';
        char digit   = '5';          // the CHARACTER '5', not the number 5
        char space   = ' ';
        char newline = '\n';         // escape sequence for newline
        char unicode = '\u0041';     // Unicode escape for 'A' (hex 41 = 65 = 'A')

        System.out.println("char 'A'       : " + letter);
        System.out.println("char '5'       : " + digit);
        System.out.println("char unicode \\u0041 : " + unicode);

        // chars are internally stored as numbers (Unicode code points)
        // You can do arithmetic with chars!
        char nextLetter = (char)(letter + 1);  // 'A' + 1 = 'B'
        System.out.println("'A' + 1 = '" + nextLetter + "'");

        // Print the ASCII/Unicode value of a char
        System.out.println("int value of 'A' : " + (int)'A');  // 65
        System.out.println("int value of 'a' : " + (int)'a');  // 97
        System.out.println("int value of '0' : " + (int)'0');  // 48

        // Loop through the alphabet using char arithmetic
        System.out.print("Alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);  // prints A through Z
        }
        System.out.println();

        // ============================================================
        // PART 5: Type Casting
        // ============================================================

        System.out.println("\n--- TYPE CASTING ---");

        // WIDENING CASTING (automatic) — smaller → larger, no data loss
        // byte → short → int → long → float → double
        int   anInt  = 100;
        long  aLong  = anInt;    // int → long: automatic, safe
        float aFloat = aLong;    // long → float: automatic, safe
        double aDouble = aFloat; // float → double: automatic, safe

        System.out.println("int → long → float → double: " +
                            anInt + " → " + aLong + " → " + aFloat + " → " + aDouble);

        // NARROWING CASTING (manual) — larger → smaller, POSSIBLE data loss
        // Must use explicit cast operator: (targetType)value
        double price  = 9.99;
        int priceInt  = (int) price;  // TRUNCATES (not rounds!) — 9.99 becomes 9
        System.out.println("(int) 9.99 = " + priceInt);  // 9 (truncated, not 9)

        // Danger: narrowing with overflow
        int bigNumber = 1000;
        byte smallByte = (byte) bigNumber;  // 1000 is too big for byte (-128 to 127)
        System.out.println("(byte) 1000 = " + smallByte);  // unexpected value!

        // Safe way to check before casting
        if (bigNumber >= Byte.MIN_VALUE && bigNumber <= Byte.MAX_VALUE) {
            byte safeByte = (byte) bigNumber;
        } else {
            System.out.println("WARNING: " + bigNumber + " is out of byte range!");
        }

        // char ↔ int casting
        char ch = 'Z';
        int asciiValue = ch;          // widening: char → int (automatic)
        char back = (char) asciiValue; // narrowing: int → char (manual)
        System.out.println("'Z' as int: " + asciiValue + ", back to char: " + back);

        // ============================================================
        // PART 6: Wrapper Classes
        // ============================================================

        System.out.println("\n--- WRAPPER CLASSES ---");

        // Every primitive has a Wrapper Class (object version)
        // Needed for: Collections, nullability, utility methods

        // Manual boxing (primitive → object)
        Integer boxedInt   = Integer.valueOf(42);   // preferred way
        Integer autoBoxed  = 42;                    // auto-boxing (Java does it for you)

        // Unboxing (object → primitive)
        int unboxed = boxedInt.intValue();   // explicit unboxing
        int autoUnboxed = boxedInt;          // auto-unboxing

        System.out.println("Boxed int: " + boxedInt);
        System.out.println("Unboxed int: " + unboxed);

        // Extremely useful Wrapper class methods:
        System.out.println("\nWrapper class utility methods:");
        System.out.println("Integer.MAX_VALUE        : " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE        : " + Integer.MIN_VALUE);
        System.out.println("Integer.parseInt(\"42\")   : " + Integer.parseInt("42"));
        System.out.println("Integer.toBinaryString(10): " + Integer.toBinaryString(10)); // "1010"
        System.out.println("Integer.toHexString(255)  : " + Integer.toHexString(255));   // "ff"
        System.out.println("Integer.toOctalString(8)  : " + Integer.toOctalString(8));   // "10"
        System.out.println("Double.parseDouble(\"3.14\"): " + Double.parseDouble("3.14"));
        System.out.println("Boolean.parseBoolean(\"true\"): " + Boolean.parseBoolean("true"));
        System.out.println("Character.isLetter('A')   : " + Character.isLetter('A'));
        System.out.println("Character.isDigit('5')    : " + Character.isDigit('5'));
        System.out.println("Character.toUpperCase('a'): " + Character.toUpperCase('a'));

        // ============================================================
        // PART 7: String — The Special Non-Primitive
        // ============================================================

        System.out.println("\n--- STRING (not a primitive!) ---");

        // String is a CLASS, not a primitive type
        // But Java gives it special treatment (literals, + operator, etc.)
        String greeting = "Hello, Java!";
        String name     = "Alice";

        // String properties
        System.out.println("Length: " + greeting.length());           // 12
        System.out.println("Upper : " + greeting.toUpperCase());
        System.out.println("Lower : " + greeting.toLowerCase());
        System.out.println("Char at index 0: " + greeting.charAt(0)); // 'H'
        System.out.println("Contains 'Java': " + greeting.contains("Java")); // true
        System.out.println("Replace: " + greeting.replace("Java", "World"));

        // String comparison — CRITICAL CONCEPT
        String s1 = "Java";    // stored in String Pool
        String s2 = "Java";    // reuses SAME object from pool
        String s3 = new String("Java");  // new object on heap (different address)

        System.out.println("\n== compares REFERENCES (memory addresses):");
        System.out.println("s1 == s2 : " + (s1 == s2));  // true (same pool object)
        System.out.println("s1 == s3 : " + (s1 == s3));  // false! (different objects)

        System.out.println(".equals() compares CONTENT:");
        System.out.println("s1.equals(s2) : " + s1.equals(s2));  // true
        System.out.println("s1.equals(s3) : " + s1.equals(s3));  // true ← use this!

        // String concatenation
        String firstName = "Alice";
        String lastName  = "Johnson";
        int    yearBorn  = 1998;

        // Using + (simple but inefficient for many concatenations)
        String full = firstName + " " + lastName + " (" + yearBorn + ")";

        // Using String.format() (cleaner for complex formatting)
        String formatted = String.format("%s %s, born in %d", firstName, lastName, yearBorn);

        System.out.println("\nConcatenation: " + full);
        System.out.println("Formatted    : " + formatted);

        // ============================================================
        // PART 8: var — Local Variable Type Inference (Java 10+)
        // ============================================================

        System.out.println("\n--- var (Type Inference, Java 10+) ---");

        // var lets the compiler infer the type from the right-hand side
        var number  = 42;           // compiler infers: int
        var price   = 19.99;        // compiler infers: double
        var message = "Hello!";     // compiler infers: String
        var flag    = true;         // compiler infers: boolean

        // Once assigned, the type is FIXED — var is NOT dynamic typing!
        // number = "hello";  ← COMPILE ERROR: int ≠ String

        System.out.println("var int    : " + number);
        System.out.println("var double : " + price);
        System.out.println("var String : " + message);
        System.out.println("var boolean: " + flag);

        // var shines with complex generic types (removes repetition)
        var list = new java.util.ArrayList<String>();  // much cleaner!
        list.add("Day");
        list.add("02");

        // ============================================================
        // PART 9: Default Values for Class Fields
        // ============================================================
        System.out.println("\n--- DEFAULT VALUES (for class-level fields) ---");
        System.out.println("Note: local variables have NO default — you must initialize them");
        System.out.println("Default int     : 0");
        System.out.println("Default double  : 0.0");
        System.out.println("Default boolean : false");
        System.out.println("Default char    : '\\0' (null character)");
        System.out.println("Default Object  : null");

        // ============================================================
        // MINI PROJECT: Display a complete personal info card
        // ============================================================
        System.out.println("\n========================================");
        System.out.println("         STUDENT PROFILE CARD          ");
        System.out.println("========================================");

        // All the data types we learned today, in a real use case
        String  studentName  = "Alice Johnson";
        int     studentId    = 20240001;
        byte    grade        = 11;          // school grade (fits in byte: 0-127)
        double  gpa          = 3.85;
        float   attendance   = 97.5f;       // percent — f suffix for float
        char    section      = 'A';
        boolean isEnrolled   = true;
        long    libraryId    = 9876543210L; // long ID number — L suffix

        System.out.printf("  %-15s : %s%n",    "Name",       studentName);
        System.out.printf("  %-15s : %d%n",    "Student ID",  studentId);
        System.out.printf("  %-15s : %d%n",    "Grade",       grade);
        System.out.printf("  %-15s : %.2f%n",  "GPA",         gpa);
        System.out.printf("  %-15s : %.1f%%%n","Attendance",  attendance);
        System.out.printf("  %-15s : %c%n",    "Section",     section);
        System.out.printf("  %-15s : %b%n",    "Enrolled",    isEnrolled);
        System.out.printf("  %-15s : %d%n",    "Library ID",  libraryId);

        System.out.println("========================================");
        System.out.println("\nData type sizes:");
        System.out.printf("  byte  : %d byte%n",  Byte.BYTES);
        System.out.printf("  short : %d bytes%n", Short.BYTES);
        System.out.printf("  int   : %d bytes%n", Integer.BYTES);
        System.out.printf("  long  : %d bytes%n", Long.BYTES);
        System.out.printf("  float : %d bytes%n", Float.BYTES);
        System.out.printf("  double: %d bytes%n", Double.BYTES);
        System.out.printf("  char  : %d bytes%n", Character.BYTES);
        System.out.println("  boolean: 1 bit (JVM uses 1 byte)");

        // ============================================================
        // SUMMARY
        // ============================================================
        // ✅ byte (1B), short (2B), int (4B), long (8B) — integers
        // ✅ float (4B), double (8B) — decimals (always prefer double)
        // ✅ boolean — true or false only
        // ✅ char (2B) — single Unicode character, use single quotes
        // ✅ Widening cast: automatic (byte→int→long→double)
        // ✅ Narrowing cast: manual with (type), risk of data loss
        // ✅ Wrapper classes: Integer, Double, Boolean, Character, etc.
        // ✅ Integer overflow — know it, avoid it
        // ✅ float precision loss — use BigDecimal for money
        // ✅ String: use .equals() not == for comparison
        // ✅ var: type inferred by compiler (Java 10+)
        // ============================================================

    } // end main

} // end class
