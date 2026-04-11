

# 📚 Queue Data Structure (Java)

## 1️⃣ What is a Queue?

A **Queue** is a linear data structure that follows the
**FIFO (First-In, First-Out)** principle.

👉 The element that is inserted first
is the first one removed.

### Real-world Analogy

A queue of people at a ticket counter —
the person who comes first gets served first.

---

## 🔹 Core Characteristics

### ➤ Data Representation

* A queue can store **homogeneous** (same type) data
* or **heterogeneous** (different types) data

### ➤ Access Restriction

* Insertion happens at the **rear (end)**
* Deletion happens from the **front (beginning)**
* Random access is **not allowed**

### ➤ Efficiency

* Queue operations are **fast and efficient**
* Widely used in scheduling and buffering

---

## ⚙️ Queue Operations

| Operation  | Description                                    |
| ---------- | ---------------------------------------------- |
| Enqueue    | Inserts an element at the rear of the queue    |
| Dequeue    | Removes and returns the front element          |
| Peek/Front | Returns the front element without removing it  |
| isEmpty    | Checks whether the queue is empty              |
| isFull     | Checks whether the queue is full (array-based) |

---

## ⏱ Time Complexity

All basic queue operations run in:

**O(1) — Constant Time**

---

## 🖼️ Visual Representation of Queue

```
Front →  ┌────┬────┬────┐  ← Rear
         │ 10 │ 20 │ 30 │
         └────┴────┴────┘
```

---

## 🚀 Practical Applications of Queue

### 🔹 CPU Scheduling

* Processes are executed in **first-come, first-served (FCFS)** order

### 🔹 Printer Queue

* Documents are printed in the order they are received

### 🔹 Web Servers

* Handles multiple client requests in sequence

### 🔹 Buffering (IO Operations)

* Used in keyboards, streaming, and data transfer

### 🔹 Breadth-First Search (BFS)

* Used in graphs and trees traversal

### 🔹 Call Center Systems

* Customers are served in the order they arrive

