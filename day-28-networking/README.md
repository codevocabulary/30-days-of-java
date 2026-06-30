# ☕ Day 28 — Networking — Sockets

<div align="center">

![Day](https://img.shields.io/badge/Day-28%20of%2030-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Networking%20--%20Sockets-yellow?style=for-the-badge)
![Project](https://img.shields.io/badge/Project-Multi-Client%20Chat%20App-blue?style=for-the-badge)

</div>

---

## 🎯 What You Will Learn Today

- ✅ TCP/IP fundamentals — how the internet works
- ✅ Socket — client-side endpoint
- ✅ ServerSocket — server-side listener
- ✅ InputStream and OutputStream over sockets
- ✅ Multi-client server with threads
- ✅ Simple protocol design
- ✅ Graceful connection closing and cleanup

---

## 📚 Key Concepts Explained

| Concept | Explanation |
|---------|-------------|
| `TCP/IP` | TCP: reliable, ordered, connection-oriented. IP: routes packets. Most internet traffic uses TCP. |
| `Socket` | java.net.Socket — client creates this to connect to server. Has InputStream and OutputStream. |
| `ServerSocket` | Listens on a port. serverSocket.accept() blocks until client connects, returns Socket. |
| `Protocol` | Agreement on message format. Usually: one message per line, or length-prefixed, or JSON. |
| `Multi-client` | Each accepted connection gets its own thread: new Thread(new ClientHandler(socket)).start(). |
| `BufferedReader/Writer` | Wrap socket streams for line-based text communication. readLine(), println(). |
| `Closing` | Always close sockets in finally or try-with-resources. Closing socket closes its streams too. |
| `Ports` | 0-1023: well-known (80=HTTP, 443=HTTPS, 22=SSH). 1024-65535: use these for your apps. |

---

## 📁 Files in This Project

```
day-28-networking/
├── README.md      ← This file — complete concept guide
├── Main.java      ← Fully commented code with all concepts
└── Supporting .java files for the project
```

---

## 🚀 How to Compile & Run

```bash
cd day-28-networking
javac *.java
java Main
```

---

## 🛠️ Today's Project

**Multi-Client Chat App** — Multi-client chat: server broadcasts to all clients, private messages, join/leave notifications

Every concept from today is used in the project at the bottom of `Main.java`.
Study the project code carefully — it shows how individual concepts combine.

---

## 💪 Challenges

1. Extend the project with one additional feature not already implemented
2. Write your own version of the core logic from scratch without looking
3. Find and fix intentional bugs hidden in the code comments
4. Read the official Java documentation for the main class/concept used today
5. Explain each concept to someone else — teaching solidifies understanding

---


## ⏭️ What's Next?

**Day 29** continues building on today's concepts. Keep the momentum!
