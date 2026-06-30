/**
 * DAY 08 — Classes & Objects
 * ============================================================
 * A CLASS is a blueprint/template that defines:
 *   - FIELDS  (state — what an object knows/has)
 *   - METHODS (behavior — what an object can do)
 *
 * An OBJECT is an instance of a class, created with 'new'.
 * Each object has its OWN copy of instance fields.
 *
 * Project: Bank Account System
 * Run: javac Main.java BankAccount.java && java Main
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== DAY 08: Classes & Objects ===\n");

        // ============================================================
        // Creating Objects
        // ============================================================
        // 'new' keyword:
        //   1. Allocates memory on the HEAP for a new BankAccount
        //   2. Calls the constructor BankAccount(name, id, balance)
        //   3. Returns a REFERENCE to the new object
        // 'alice' variable stores that reference (lives on the stack)

        BankAccount alice = new BankAccount("Alice Johnson", "ACC-001", 1000.00);
        BankAccount bob   = new BankAccount("Bob Smith",    "ACC-002", 500.00);
        BankAccount carol = new BankAccount("Carol White",  "ACC-003", 0.00);

        System.out.println("--- Initial Account State ---");
        // println() automatically calls alice.toString() if we pass an object
        System.out.println(alice);
        System.out.println(bob);
        System.out.println(carol);

        // ============================================================
        // Calling Instance Methods
        // ============================================================
        // Methods are called ON a specific object using dot notation: object.method()
        // Each call operates on THAT object's data, not others

        System.out.println("\n--- Performing Transactions ---");

        alice.deposit(500.00);       // alice's balance: 1000 + 500 = 1500
        alice.deposit(250.00);       // alice's balance: 1500 + 250 = 1750
        alice.withdraw(300.00);      // alice's balance: 1750 - 300 = 1450

        bob.deposit(200.00);         // bob's balance: 500 + 200 = 700
        bob.withdraw(800.00);        // should FAIL — insufficient funds

        carol.deposit(1000.00);      // carol's balance: 0 + 1000 = 1000

        // Transfer between accounts
        System.out.println("\n--- Transfers ---");
        alice.transfer(bob, 200.00); // alice -200, bob +200
        carol.transfer(bob, 500.00); // carol -500, bob +500

        // ============================================================
        // Accessing State via Getters
        // ============================================================
        // Because fields are PRIVATE, we access them only through
        // public getter methods — this is ENCAPSULATION

        System.out.println("\n--- Final Balances ---");
        System.out.printf("%-20s ID: %-10s Balance: $%,.2f%n",
            alice.getAccountHolder(), alice.getAccountId(), alice.getBalance());
        System.out.printf("%-20s ID: %-10s Balance: $%,.2f%n",
            bob.getAccountHolder(),   bob.getAccountId(),   bob.getBalance());
        System.out.printf("%-20s ID: %-10s Balance: $%,.2f%n",
            carol.getAccountHolder(), carol.getAccountId(), carol.getBalance());

        // ============================================================
        // Demonstrating that each object is INDEPENDENT
        // ============================================================
        System.out.println("\n--- Each object is independent ---");
        System.out.println("Alice's balance change doesn't affect Bob's.");
        System.out.println("They share the class definition but NOT their data.");

        // ============================================================
        // Demonstrating ENCAPSULATION
        // ============================================================
        // These lines would be COMPILE ERRORS — fields are private!
        // alice.balance = 1000000;     // ERROR: balance has private access
        // alice.accountId = "HACKED";  // ERROR: accountId has private access
        System.out.println("\n--- Encapsulation ---");
        System.out.println("Cannot access alice.balance directly — it is private.");
        System.out.println("Must use alice.getBalance() — controlled access.");

        // ============================================================
        // Static field and method
        // ============================================================
        // Static members belong to the CLASS, not to any instance
        // Same value is shared by ALL instances
        System.out.println("\n--- Static Members ---");
        System.out.println("Total accounts ever created: " + BankAccount.getTotalAccounts());
        System.out.println("(This is a class-level counter, shared by all objects)");

        // ============================================================
        // Transaction History
        // ============================================================
        System.out.println("\n--- Alice's Transaction History ---");
        alice.printHistory();

        System.out.println("\n--- Bob's Transaction History ---");
        bob.printHistory();

        System.out.println("\nDay 08 Complete! Classes & Objects mastered! ☕");
    }
}
