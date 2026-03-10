# 📚 Stack Data Structure (Java)

## 1️⃣ What is a Stack?   

A **Stack** is a linear data structure that follows the  
**LIFO (Last-In, First-Out)** principle.

👉 The element that is inserted last  
is the first one removed.

### Real-world Analogy
A stack of books — you place books on top  
and remove them from the top.

---

## 🔹 Core Characteristics

### ➤ Data Representation
- A stack can store **homogeneous** (same type) data  
- or **heterogeneous** (different types) data

### ➤ Access Restriction
- Only the **top element** of the stack is accessible  
- Random access (like arrays) is **not allowed**

### ➤ Efficiency
- Stack operations are **very fast and efficient**  
- Ideal for specific algorithms

---

## ⚙️ Stack Operations

| Operation| Description                                  |
|--------- |-----------------------------------------------|
| Push     | Inserts an element at the top of the stack    |
| Pop      | Removes and returns the top element           |
| Peek/Top | Returns the top element without removing it   |
| isEmpty  | Checks whether the stack is empty             |
| isFull   | Checks whether the stack is full (array-based)|

---

## ⏱ Time Complexity

All basic stack operations run in:

**O(1) — Constant Time**

---

## 🖼️ Visual Representation of Stack
```
  ┌────┐
  │ 30 │ ← Top
  ├────┤
  │ 20 │
  ├────┤
  │ 10 │
  └────┘

```


---

## 🚀 Practical Applications of Stack

### 🔹 Function Calls
Uses the **call stack** to store:
- Function calls
- Local variables
- Return addresses

### 🔹 Text Editors
- **Undo / Redo** operations are implemented using stacks

### 🔹 Web Browsers
- **Back and Forward navigation** uses stack behavior

### 🔹 Parsing & Expression Evaluation
- Balanced parentheses `() { } [ ]`
- Binary expression evaluation
- Infix → Postfix conversion

### 🔹 Memory Management
Stack memory is used for:
- Method execution
- Local variables  
- Faster than heap memory

