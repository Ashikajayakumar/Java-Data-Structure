                                             Middle of the Linked List
1 → 2 → 3 → 4 → 5 → NULL
🔰 Iteration 0: Initialization

slow ↓
fast ↓
     1 → 2 → 3 → 4 → 5 → NULL
Both start at head (1)

🔁 Iteration 1: First Loop Iteration

slow = slow.next;        // moves to 2
fast = fast.next.next;  // moves to 3

    
  slow ↓  fast ↓
1 →    2   →   3 → 4 → 5 → NULL

  
🔁 Iteration 2: Second Loop Iteration

slow = slow.next;        // moves to 3
fast = fast.next.next;  // moves to 5

      
       slow ↓  fast ↓
1 →   2 →   3 → 4→  5 → NULL

  
🔁 Iteration 3: Loop Condition Check
  
fast != null ✔
fast.next == null ❌


✅ Result

return slow; // node with value 3
✔ Middle node = 3


  
Java Implementation                                        
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null) return null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
