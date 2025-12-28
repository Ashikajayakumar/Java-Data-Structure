                                     Linked List Cycle I
Example 1: Linked List WITH Cycle


Index:   0    1    2     3
Value:   3 →  2 →  0 →  -4
              ↑         ↓
              ← ← ← ← ←
  slow=slow.next;
  fast=fast.next.next;


Iteration: 0 
  
slow ↓
fast ↓
     3 → 2 → 0 → -4
         ↑        ↓
          ← ← ← ← ←

slow = slow.next;      // 2
fast = fast.next.next // 0
  --------------------------------------------------------------------------------------

🔁Iteration:1
slow = slow.next;      // 0
fast = fast.next.next // 0

      slow↓
      fast↓
3 → 2 →   0  → -4
      ↑        ↓
      ← ← ← ← ←
   --------------------------------------------------------------------------------------
🔁 Iteration : 2
  
slow = slow.next; // -4
fast =  fast.next.next // 2

          
fast↓ slow↓
3 → 2  →  0  →  -4
      ↑          ↓
      ← ← ← ← ←
  -------------------------------------------------------------------------------------

  if (slow == fast){                              #Iteration 1  slow =0 ,fast=0
      return true;
}
 -------------------------------------------------------------------------------------
                                       
Java Implementation
  
     public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null ||head.next==null){
                return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
