# 📚 Linked List Data Structure (Java)

---

## 1️⃣ What is a Linked List?

A **Linked List** is a linear data structure made up of **nodes**, where each node contains:

- **Data**
- **Reference (pointer)** to the next node in the sequence

📌 Unlike arrays, linked lists **do not store elements in contiguous memory locations**.

---

## 2️⃣ Types of Linked Lists

### 🔹 Singly Linked List

Each node points to the **next node**.  
The last node points to **null**.
```
Head
↓
[10] → [20] → [30] → null
```

---

### 🔹 Doubly Linked List

Each node contains **two pointers**:

- `prev` → previous node
- `next` → next node

null ← [10] ⇄ [20] ⇄ [30] → null


---

### 🔹 Circular Linked List

The last node points back to the **first node**, forming a loop.
```
 ┌───────────────┐
 ↓               │
[10] → [20] → [30] ────┘
```

---

## 3️⃣ Time Complexity

| Operation | Time Complexity |
|---------|----------------|
| Access  | O(n) |
| Search  | O(n) |
| Insert  | O(1)* |
| Delete  | O(1)* |

📌 *Insertion/Deletion is **O(1)** when the position or node reference is known.*

---

## 4️⃣ Visual Representation Summary

### Singly Linked List
Head → 10 → 20 → 30 → null


### Doubly Linked List


null ← 10 ⇄ 20 ⇄ 30 → null

### Circular Linked List
```
10 → 20 →  30
↑           ↓
└───────────┘
```
---

## 5️⃣ Core Operations

| Operation | Description |
|---------|-------------|
| `insert()` | Insert node at beginning, end, or specific position |
| `delete()` | Remove node from beginning, end, or specific position |
| `search()` | Find a node by its value |
| `traverse()` | Visit and print all nodes |
| `isEmpty()` | Check if the list has no nodes |

---

## 6️⃣ Practical Applications

✔ Dynamic memory allocation  
✔ Implementation of **Stacks & Queues**  
✔ **Undo / Redo** operations  
✔ **Graph adjacency lists**  
✔ Music & video playlists  
✔ Browser history navigation  

---

## 7️⃣ Advantages

✅ Dynamic size (no fixed memory)  
✅ Efficient insertion & deletion  
✅ Better memory utilization than arrays  

---

## 8️⃣ Disadvantages

❌ Extra memory required for pointers  
❌ No random access (sequential access only)  
❌ Slightly complex implementation  

---
