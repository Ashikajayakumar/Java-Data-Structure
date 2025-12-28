                                               Remove Duplicate Sorted List

head = 1 → 1 → 2 → 3 → 3 → NULL

Iteration : 0

current ↓
        1 → 1 → 2 → 3 → 3 → NULL

current.val = 1
current.next.val = 1
continue;
--------------------------------------------------------------------------------------

Iteration: 1
  
  current ↓
     1 →  2 → 3 → 3 → NULL
  
  current.val = 2
  current.next.val = 3
--------------------------------------------------------------------------------------

  Iteration : 2
  
        current ↓
       1 →  2 → 3 → 3 → NULL

  current.val = 3
  current.next.val = 3 
  continue;
   --------------------------------------------------------------------------------------

     
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current =head;
        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }
}
