# DSA-Stack-Queue-GameMatch-RobotUndo

> Data Structures & Algorithms — Stack and Queue real-world implementations in Java.

---

## 📌 Project Overview

This project demonstrates the practical application of two fundamental data structures:

- **Stack (LIFO)** — Used in a **Robot Movement Undo System**
- **Queue (FIFO)** — Used in an **Online Game Matchmaking System**

Both scenarios are implemented in Java and showcase how these structures solve real-world problems efficiently.

---

## 🤖 Scenario 1 — Robot Movement Undo System (Stack)

A robot navigates a 7×7 grid starting at the center cell (3,3). Every move (UP, DOWN, LEFT, RIGHT) is pushed onto a stack. The undo operation pops the most recent command and applies the inverse direction, restoring the robot to its previous position.

**Core Operations Used:**
- `push(x)` — Add move to the top of the stack
- `pop()` — Remove and return the last move
- `peek()` — View the top move without removing it

---

## 🎮 Scenario 2 — Online Game Matchmaking (Queue)

Players waiting for an online game session are managed using a custom array-backed Queue. Each player has a Username, Rank, and Level. Players join via `enqueue()` (FIFO order) and are matched using `dequeue()`, ensuring the longest-waiting player is served first.

**Core Operations Used:**
- `enqueue(x)` — Add player to the rear of the queue
- `dequeue()` — Remove and return the player from the front
- `peek()` — View the front player without removing
- `isEmpty()` / `isFull()` — Queue state checks

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above
- IntelliJ IDEA (recommended) or any Java IDE

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/abhimani-konara/DSA-Stack-Queue-GameMatch-RobotUndo.git
   ```

2. **Open in IntelliJ IDEA**
   - File → Open → Select the project folder

3. **Run the project**
   - Navigate to `src/` folder
   - Run the `Main.java` file

---

## 👥 Group Members

| Student ID |
|------------|
| KIC-HNDCSAI-261-F-001 |
| KIC-HNDCSAI-261-F-004 |
| KIC-HNDCSAI-261-F-014 |
| KIC-HNDCSAI-261-F-028 |

---

## 🏫 Institution

**NIBM City University — Kandy Innovation Center**  
HND in Computing & AI — Group 10  
Module: Data Structures & Algorithms
