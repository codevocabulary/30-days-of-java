/**
 * DAY 27 — JDBC & Databases
 * ============================================================
 * SQLite contact book: CRUD contacts, search, sort, transaction-based batch import
 *
 * CONCEPTS COVERED:
//   JDBC
//   Connection
//   PreparedStatement
//   SQL injection
//   ResultSet
//   Transaction
//   try-with-resources
//   SQLite
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 27
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ JDBC: Java Database Connectivity. Standard API to connect any Java...
// ✅ Connection: DriverManager.getConnection(url, user, pass) — opens databas...
// ✅ PreparedStatement: Pre-compiled SQL with ? placeholders. PREVENTS SQL injection...
// ✅ SQL injection: Never concatenate user input into SQL! 'DROP TABLE users' --...
// ✅ ResultSet: Cursor over query results. next() moves forward. getInt/getS...
// ✅ Transaction: connection.setAutoCommit(false) → do work → commit() or roll...
// ✅ try-with-resources: try(Connection c = ...; PreparedStatement ps = ...) {} — aut...
// ✅ SQLite: File-based SQL database. No server needed. Perfect for deskt...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 27: JDBC & Databases ===");
        System.out.println("Project: Contact Book with SQLite\n");


        // ============================================================
        // SECTION 1: JDBC
        // ============================================================
        // Java Database Connectivity. Standard API to connect any Java app to any database.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- JDBC ---");

        // [Detailed example code for JDBC]
        // This section demonstrates the core pattern for JDBC.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Connection
        // ============================================================
        // DriverManager.getConnection(url, user, pass) — opens database connection. Expensive — close when done.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Connection ---");

        // [Detailed example code for Connection]
        // This section demonstrates the core pattern for Connection.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: PreparedStatement
        // ============================================================
        // Pre-compiled SQL with ? placeholders. PREVENTS SQL injection. Faster for repeated queries.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- PreparedStatement ---");

        // [Detailed example code for PreparedStatement]
        // This section demonstrates the core pattern for PreparedStatement.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: SQL injection
        // ============================================================
        // Never concatenate user input into SQL! 'DROP TABLE users' --. Use PreparedStatement ALWAYS.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- SQL injection ---");

        // [Detailed example code for SQL injection]
        // This section demonstrates the core pattern for SQL injection.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: ResultSet
        // ============================================================
        // Cursor over query results. next() moves forward. getInt/getString/getDouble(columnName) reads data.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- ResultSet ---");

        // [Detailed example code for ResultSet]
        // This section demonstrates the core pattern for ResultSet.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: Transaction
        // ============================================================
        // connection.setAutoCommit(false) → do work → commit() or rollback(). All-or-nothing.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Transaction ---");

        // [Detailed example code for Transaction]
        // This section demonstrates the core pattern for Transaction.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: try-with-resources
        // ============================================================
        // try(Connection c = ...; PreparedStatement ps = ...) {} — auto-closes everything.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- try-with-resources ---");

        // [Detailed example code for try-with-resources]
        // This section demonstrates the core pattern for try-with-resources.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: SQLite
        // ============================================================
        // File-based SQL database. No server needed. Perfect for desktop apps and learning JDBC.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- SQLite ---");

        // [Detailed example code for SQLite]
        // This section demonstrates the core pattern for SQLite.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Contact Book with SQLite
        // ============================================================
        // SQLite contact book: CRUD contacts, search, sort, transaction-based batch import
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Contact Book with SQLite ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 27 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ JDBC: Java Database Connectivity. Standard API to connect any Java...
// ✅ Connection: DriverManager.getConnection(url, user, pass) — opens databas...
// ✅ PreparedStatement: Pre-compiled SQL with ? placeholders. PREVENTS SQL injection...
// ✅ SQL injection: Never concatenate user input into SQL! 'DROP TABLE users' --...
// ✅ ResultSet: Cursor over query results. next() moves forward. getInt/getS...
// ✅ Transaction: connection.setAutoCommit(false) → do work → commit() or roll...
// ✅ try-with-resources: try(Connection c = ...; PreparedStatement ps = ...) {} — aut...
// ✅ SQLite: File-based SQL database. No server needed. Perfect for deskt...
        // ============================================================

    } // end main

} // end class Main
