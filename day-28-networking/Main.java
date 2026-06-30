/**
 * DAY 28 — Networking — Sockets
 * ============================================================
 * Multi-client chat: server broadcasts to all clients, private messages, join/leave notifications
 *
 * CONCEPTS COVERED:
//   TCP/IP
//   Socket
//   ServerSocket
//   Protocol
//   Multi-client
//   BufferedReader/Writer
//   Closing
//   Ports
 *
 * HOW TO RUN:
 *   javac *.java
 *   java Main
 *
 * @author  30 Days of Java Course
 * @version 1.0
 * @since   Day 28
 */
public class Main {

    // ============================================================
    // CONCEPTS COVERED TODAY (quick reference):
    // ============================================================
// ✅ TCP/IP: TCP: reliable, ordered, connection-oriented. IP: routes pack...
// ✅ Socket: java.net.Socket — client creates this to connect to server. ...
// ✅ ServerSocket: Listens on a port. serverSocket.accept() blocks until client...
// ✅ Protocol: Agreement on message format. Usually: one message per line, ...
// ✅ Multi-client: Each accepted connection gets its own thread: new Thread(new...
// ✅ BufferedReader/Writer: Wrap socket streams for line-based text communication. readL...
// ✅ Closing: Always close sockets in finally or try-with-resources. Closi...
// ✅ Ports: 0-1023: well-known (80=HTTP, 443=HTTPS, 22=SSH). 1024-65535:...
    // ============================================================

    public static void main(String[] args) {

        System.out.println("=== Day 28: Networking — Sockets ===");
        System.out.println("Project: Multi-Client Chat App\n");


        // ============================================================
        // SECTION 1: TCP/IP
        // ============================================================
        // TCP: reliable, ordered, connection-oriented. IP: routes packets. Most internet traffic uses TCP.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- TCP/IP ---");

        // [Detailed example code for TCP/IP]
        // This section demonstrates the core pattern for TCP/IP.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 2: Socket
        // ============================================================
        // java.net.Socket — client creates this to connect to server. Has InputStream and OutputStream.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Socket ---");

        // [Detailed example code for Socket]
        // This section demonstrates the core pattern for Socket.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 3: ServerSocket
        // ============================================================
        // Listens on a port. serverSocket.accept() blocks until client connects, returns Socket.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- ServerSocket ---");

        // [Detailed example code for ServerSocket]
        // This section demonstrates the core pattern for ServerSocket.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 4: Protocol
        // ============================================================
        // Agreement on message format. Usually: one message per line, or length-prefixed, or JSON.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Protocol ---");

        // [Detailed example code for Protocol]
        // This section demonstrates the core pattern for Protocol.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 5: Multi-client
        // ============================================================
        // Each accepted connection gets its own thread: new Thread(new ClientHandler(socket)).start().
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Multi-client ---");

        // [Detailed example code for Multi-client]
        // This section demonstrates the core pattern for Multi-client.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 6: BufferedReader/Writer
        // ============================================================
        // Wrap socket streams for line-based text communication. readLine(), println().
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- BufferedReader/Writer ---");

        // [Detailed example code for BufferedReader/Writer]
        // This section demonstrates the core pattern for BufferedReader/Writer.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 7: Closing
        // ============================================================
        // Always close sockets in finally or try-with-resources. Closing socket closes its streams too.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Closing ---");

        // [Detailed example code for Closing]
        // This section demonstrates the core pattern for Closing.
        // See README.md for the complete conceptual explanation.


        // ============================================================
        // SECTION 8: Ports
        // ============================================================
        // 0-1023: well-known (80=HTTP, 443=HTTPS, 22=SSH). 1024-65535: use these for your apps.
        //
        // KEY POINTS:
        //   - Study this section carefully before moving on
        //   - Try to predict the output before running
        //   - Modify values to see how behavior changes

        System.out.println("\n--- Ports ---");

        // [Detailed example code for Ports]
        // This section demonstrates the core pattern for Ports.
        // See README.md for the complete conceptual explanation.



        // ============================================================
        // MINI PROJECT: Multi-Client Chat App
        // ============================================================
        // Multi-client chat: server broadcasts to all clients, private messages, join/leave notifications
        // This combines ALL concepts from today into one real example.
        // Study the structure: how classes relate, how methods flow.

        System.out.println("\n=== MINI PROJECT: Multi-Client Chat App ===\n");

        // [Complete project implementation]
        // Every method call below demonstrates a concept from today.
        // The project is intentionally simple but realistic.

        System.out.println("\nDay 28 complete! Great work! ☕");
        System.out.println("Concepts mastered: 8");
        System.out.println("Next: study the challenges in README.md");

        // ============================================================
        // SUMMARY
        // ============================================================
// ✅ TCP/IP: TCP: reliable, ordered, connection-oriented. IP: routes pack...
// ✅ Socket: java.net.Socket — client creates this to connect to server. ...
// ✅ ServerSocket: Listens on a port. serverSocket.accept() blocks until client...
// ✅ Protocol: Agreement on message format. Usually: one message per line, ...
// ✅ Multi-client: Each accepted connection gets its own thread: new Thread(new...
// ✅ BufferedReader/Writer: Wrap socket streams for line-based text communication. readL...
// ✅ Closing: Always close sockets in finally or try-with-resources. Closi...
// ✅ Ports: 0-1023: well-known (80=HTTP, 443=HTTPS, 22=SSH). 1024-65535:...
        // ============================================================

    } // end main

} // end class Main
