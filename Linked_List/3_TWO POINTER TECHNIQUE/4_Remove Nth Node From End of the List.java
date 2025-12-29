                                  Remove Nth Node From End of the List
    
                                    
// Step 1: Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {                                                fast moves:
            fast = fast.next;                                                         step 1 -> 1
        }                                                                             step 2 -> 2                                                         
                                                                                      step 3 -> 3

dummy → 1 → 2 → 3 → 4 → 5
slow↑           ↑
               head
     --------------------------------------------------------------------------------------

        // Step 2: Move both pointers until fast reaches null
        while (fast != null) {                                              slow → 1   fast → 4
            fast = fast.next;                                               slow → 2   fast → 5
            slow = slow.next;                                               slow → 3   fast → null
        }

--------------------------------------------------------------------------------------
       // Step 3: Delete the node
        slow.next = slow.next.next;                                          slow .next = 5
        return dummy.next;                                                   1 -> 2 -> 3-> 5
--------------------------------------------------------------------------------------
  

Java Implementation
  
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
