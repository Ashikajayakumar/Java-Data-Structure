# 📚 Linked List Data Structure (Java)



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


### 🔹 Doubly Linked List

Each node contains **two pointers**:

- `prev` → previous node
- `next` → next node
```
null ← [10] ⇄ [20] ⇄ [30] → null
```


---

### 🔹 Circular Linked List

The last node points back to the **first node**, forming a loop.
```
 ┌───────────────┐
 ↓               │
[10] → [20] → [30] ────┘

```

---

### 🔹 Doubly Circular Linked List

- Last node’s `next` → first node  
- First node’s `prev` → last node  
- Traversal possible in **both directions**

```
    ┌──────────────────────┐
    ↓                      │
[10] ⇄ [20] ⇄ [30] ⇄ [40]
↑ ↓
└──────────────────────┘
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

## 9️⃣ LinkedList in Java

`LinkedList` is part of the **Java Collection Framework** and is present in the `java.util` package.

### 🔹 Key Characteristics

- Implements **Doubly Linked List**
- Dynamic size
- Maintains insertion order
- Allows duplicate elements
- Not synchronized by default
- Faster insertion/deletion than `ArrayList`

---

## 🔟 Java Example: Creating a LinkedList

```
import java.util.LinkedList;

public class Geeks {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> l = new LinkedList<>();

        // Adding elements
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        System.out.println(l);
    }
}
Output
csharp
Copy code
[One, Two, Three, Four, Five]
```
📌 Elements are printed in insertion order.

1️⃣1️⃣ Hierarchy of LinkedList
```

Iterable
   ↓
Collection
   ↓
List        Deque
     ↘      ↙
       LinkedList
```
1️⃣2️⃣ Constructors of LinkedList

1. Empty LinkedList
```LinkedList list = new LinkedList();```
2. LinkedList from Collection
```LinkedList list = new LinkedList(Collection c);```
1️⃣3️⃣ Performing Operations on LinkedList
🔹 Adding Elements
```
LinkedList<String> ll = new LinkedList<>();
ll.add("Geeks");
ll.add("Geeks");
ll.add(1, "For");

System.out.println(ll);
```
Output:
[Geeks, For, Geeks]
🔹 Updating Elements
```
ll.set(1, "For");
```
🔹 Removing Elements
```
ll.remove(1);        // remove by index
ll.remove("Geeks"); // remove by object
```
🔹 Iterating a LinkedList
```
for (int i = 0; i < ll.size(); i++) {
    System.out.print(ll.get(i) + " ");
}

for (String str : ll) {
    System.out.print(str + " ");
}
```
🔚 Conclusion
Linked Lists are powerful data structures ideal for scenarios where:

Dynamic memory is required

Frequent insertion and deletion are needed

Sequential access is acceptable

This file serves as the foundation for understanding all Linked List variants in Java.


---

