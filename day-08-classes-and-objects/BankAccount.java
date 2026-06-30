import java.util.ArrayList;
import java.util.List;

/**
 * BankAccount — a class that represents a bank account.
 *
 * CLASS ANATOMY:
 *   - Fields (instance variables): state that EACH object stores separately
 *   - Constructor: initializes a new object
 *   - Methods: operations that can be performed on this object
 *   - Getters: read-only access to private fields
 *   - static field/method: shared by ALL instances, at CLASS level
 */
public class BankAccount {

    // ============================================================
    // FIELDS (Instance Variables)
    // ============================================================
    // 'private' means ONLY code inside this class can access these directly.
    // This is ENCAPSULATION — hiding internal state behind a controlled interface.
    // Each BankAccount OBJECT gets its own copy of these fields.

    private final String accountId;       // cannot change after construction
    private final String accountHolder;   // cannot change after construction
    private double balance;               // CAN change: deposit/withdraw
    private List<String> history;         // transaction log

    // ============================================================
    // STATIC FIELD
    // ============================================================
    // 'static' means this belongs to the CLASS, not any instance.
    // ALL BankAccount objects SHARE this one counter.
    // When you create a new BankAccount, this increments.

    private static int totalAccounts = 0;  // counts all accounts ever created

    // ============================================================
    // CONSTRUCTORS
    // ============================================================
    // A constructor is called when you use 'new BankAccount(...)'.
    // It has the SAME NAME as the class and NO return type.
    // Its job: initialize the object to a valid starting state.

    /**
     * Parameterized constructor — creates account with initial balance.
     *
     * @param accountHolder  the name of the account owner
     * @param accountId      unique account identifier
     * @param initialBalance starting balance (must be >= 0)
     */
    public BankAccount(String accountHolder, String accountId, double initialBalance) {
        // 'this.fieldName' refers to the OBJECT's field.
        // 'fieldName' alone (without this.) refers to the PARAMETER.
        // We need 'this.' here because parameter names match field names.
        this.accountHolder = accountHolder;
        this.accountId     = accountId;

        // Validate before assigning — protect against bad initial data
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
        this.history = new ArrayList<>();

        // Track creation — static field belongs to the class
        totalAccounts++;   // every new BankAccount increments this

        // Record the opening
        history.add(String.format("ACCOUNT OPENED | Balance: $%.2f", initialBalance));
    }

    /**
     * No-arg constructor — creates account with $0 balance.
     * Calls the other constructor using this() — constructor chaining.
     */
    public BankAccount(String accountHolder, String accountId) {
        this(accountHolder, accountId, 0.00);  // calls 3-arg constructor above
    }

    // ============================================================
    // INSTANCE METHODS — Behavior
    // ============================================================
    // Methods define what a BankAccount CAN DO.
    // They can read and modify this object's fields.
    // 'public' methods form the class's public API.

    /**
     * Deposits money into the account.
     * @param amount positive amount to deposit
     */
    public void deposit(double amount) {
        // Validate input — never trust incoming data
        if (amount <= 0) {
            System.out.println("  ERROR: Deposit amount must be positive.");
            return;  // exit method early — don't change anything
        }

        this.balance += amount;  // increase balance

        // Record in history
        String entry = String.format("DEPOSIT   | +$%,.2f | Balance: $%,.2f", amount, balance);
        history.add(entry);
        System.out.println("  " + accountHolder + " | " + entry);
    }

    /**
     * Withdraws money from the account.
     * @param amount positive amount to withdraw
     * @return true if successful, false if insufficient funds
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("  ERROR: Withdrawal amount must be positive.");
            return false;
        }

        // Check sufficient funds BEFORE modifying balance
        if (amount > this.balance) {
            System.out.printf("  ERROR: Insufficient funds. Requested: $%.2f | Available: $%.2f%n",
                               amount, balance);
            history.add(String.format("FAILED WITHDRAW | -$%.2f | Insufficient funds", amount));
            return false;
        }

        this.balance -= amount;

        String entry = String.format("WITHDRAW  | -$%,.2f | Balance: $%,.2f", amount, balance);
        history.add(entry);
        System.out.println("  " + accountHolder + " | " + entry);
        return true;
    }

    /**
     * Transfers money from this account to another.
     * @param target  the recipient account
     * @param amount  amount to transfer
     * @return true if successful
     */
    public boolean transfer(BankAccount target, double amount) {
        System.out.printf("  TRANSFER | %s → %s | $%.2f%n",
                            this.accountHolder, target.accountHolder, amount);

        // Withdraw from THIS account — if it fails, don't deposit to target
        if (!this.withdraw(amount)) {
            return false;
        }

        // Deposit to TARGET account
        target.deposit(amount);

        // Add cross-reference to history
        this.history.add("TRANSFER OUT → " + target.accountHolder);
        target.history.add("TRANSFER IN ← " + this.accountHolder);
        return true;
    }

    /**
     * Prints the complete transaction history.
     */
    public void printHistory() {
        System.out.println("  Account: " + accountHolder + " (" + accountId + ")");
        System.out.println("  Transactions: " + history.size());
        for (String entry : history) {
            System.out.println("    " + entry);
        }
    }

    // ============================================================
    // GETTERS — Controlled Read Access
    // ============================================================
    // Getters provide READ-ONLY access to private fields.
    // Notice: there's no setAccountId() — you can't change the ID!
    // There's no setBalance() directly — must use deposit/withdraw.

    public String getAccountHolder() { return accountHolder; }
    public String getAccountId()     { return accountId; }
    public double getBalance()       { return balance; }
    public int    getHistorySize()   { return history.size(); }

    // ============================================================
    // STATIC METHOD — Belongs to Class, Not Instance
    // ============================================================
    // Call it as: BankAccount.getTotalAccounts()
    // NOT as: alice.getTotalAccounts() (works but misleading style)

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // ============================================================
    // toString() — String Representation
    // ============================================================
    // Overrides Object.toString() to give meaningful output.
    // Called automatically when you println(bankAccountObject).

    @Override  // annotation: tells compiler we're intentionally overriding
    public String toString() {
        return String.format("BankAccount[id=%s, holder=%s, balance=$%,.2f]",
                              accountId, accountHolder, balance);
    }

} // end class BankAccount
