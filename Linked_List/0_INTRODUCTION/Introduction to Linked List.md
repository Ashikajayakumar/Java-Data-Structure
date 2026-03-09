# 📚 Linked List Data Structure (Java)


 
## 1️⃣ What is a Linked List?

A **Linked List** is a linear data structure made up of **nodes**, where each node contains:

- **Data**
- **Reference (pointer)** to the next node in the sequence

📌 Unlike arrays, linked lists **do not store elements in contiguous memory locations**.

---

## 2️⃣ Why Use Linked List Instead of Array?

- **Dynamic Size**: LinkedList grows or shrinks dynamically at runtime.  
- **Efficient Insertion/Deletion**: Adding/removing elements at the beginning or middle is faster than arrays.  
- **Maintains Insertion Order**: Elements are stored in the order they are added.  
- **Allows Duplicates**: Duplicate elements are allowed.  
- **Not Synchronized**: By default, LinkedList is not thread-safe. Use `Collections.synchronizedList()` for thread safety.  
- **Memory Efficiency**: No need to pre-allocate large arrays.  

---

## 3️⃣ Difference: Linked List vs Array

| Feature | Array | Linked List |
|---------|-------|-------------|
| Size | Fixed | Dynamic |
| Insertion/Deletion | Expensive (O(n)) | Efficient (O(1)* if position known) |
| Memory | Contiguous memory | Non-contiguous memory |
| Access | Random access O(1) | Sequential access O(n) |
| Extra Space | No extra space | Extra memory for pointers |
| Resizing | Needs reallocation | Automatic |


---

## 4️⃣  Types of Linked Lists

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

## 5️⃣ Time Complexity

| Operation | Time Complexity |
|---------|----------------|
| Access  | O(n) |
| Search  | O(n) |
| Insert  | O(1)* |
| Delete  | O(1)* |

📌 *Insertion/Deletion is **O(1)** when the position or node reference is known.*



## 6️⃣ Core Operations


1.Insert – Add a node at the beginning, end, or specific position.

2.Delete – Remove a node from the beginning, end, or specific position.

3.Traversal – Visit or print all nodes in the list.

4.Search – Find a node by its value.

5.Update – Modify the value of a node at a specific position.

6.Count – Count the total number of nodes in the list.

7.Reverse – Reverse the order of nodes in the list.

8.Sort – Arrange the nodes in ascending or descending order.

9.Merge – Combine two linked lists into a single list.

---

## 7️⃣ Practical Applications

✔ Dynamic memory allocation  
✔ Implementation of **Stacks & Queues**  
✔ **Undo / Redo** operations  
✔ **Graph adjacency lists**  
✔ Music & video playlists  
✔ Browser history navigation  

---

## 8️⃣ Advantages

✅ Dynamic size (no fixed memory)  
✅ Efficient insertion & deletion  
✅ Better memory utilization than arrays  

---

## 9️⃣ Disadvantages

❌ Extra memory required for pointers  
❌ No random access (sequential access only)  
❌ Slightly complex implementation  

---

## 🔟  LinkedList in Java

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

[One, Two, Three, Four, Five]
```
📌 Elements are printed in insertion order.

 Hierarchy of LinkedList
```

Iterable
   ↓
Collection
   ↓
List        Deque
     ↘      ↙
       LinkedList
```
 Constructors of LinkedList

1. Empty LinkedList
```
LinkedList list = new LinkedList();
```
2. LinkedList from Collection
```
LinkedList list = new LinkedList(Collection c);
```
 Performing Operations on LinkedList
🔹 Adding Elements
```
LinkedList<String> ll = new LinkedList<>();
ll.add("Geeks");
ll.add("Geeks");
ll.add(1, "For");

System.out.println(ll);
```
```Output:
[Geeks, For, Geeks]
```

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



---

