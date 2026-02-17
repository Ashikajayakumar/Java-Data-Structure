                                        Reverse Linked List


head → 1 → 2 → 3 → 4 → NULL

                                        
prev = NULL
current = 1
next = NULL

NULL ← 1 → 2 → 3 → 4 → NULL
        ↑
     current

--------------------------------------------------------------------------------------
  
🔁 Iteration 1

     next = current.next;   // next = 2
     current.next = prev;  // 1 → NULL
     prev = current;       // prev = 1
     current = next;       // current = 2



      prev      current
       ↓          ↓
       1 → NULL   2 → 3 → 4 → NULL

--------------------------------------------------------------------------------------
        
🔁 Iteration 2

         next = 3
         current.next = prev   // 2 → 1
         prev = 2
         current = 3

         prev          current
         ↓              ↓
         2 → 1 → NULL   3 → 4 → NULL

--------------------------------------------------------------------------------------
        
🔁 Iteration 3

           next = 4
           current.next = prev   // 3 → 2
           prev = 3
           current = 4

            prev              current
            ↓                  ↓
            3 → 2 → 1 → NULL    4 → NULL

--------------------------------------------------------------------------------------
        
🔁 Iteration 4

           next = NULL
          current.next = prev  // 4 → 3
          prev = 4
          current = NULL

           prev
            ↓
            4 → 3 → 2 → 1 → NULL

        --------------------------------------------------------------------------------------
🛑 Loop Ends (current == null)

head = prev;             
return head;

 --------------------------------------------------------------------------------------

Java Implementation
  
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode next=null;
        ListNode current=head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }
}
