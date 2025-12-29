                                                 Reverse Linked List II

                                                   

Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

  
dummy → 1 → 2 → 3 → 4 → 5
        ↑   ↑
      prev  curr

--------------------------------------------------------------------------------------
🔹 Step 1: Move prev to (left−1)
prev → 1
curr → 2

dummy → 1 → 2 → 3 → 4 → 5
       ↑
     prev
--------------------------------------------------------------------------------------
  🔹 Step 2: Reverse nodes between left and right
🔁 Iteration 1
next = 3

1 → 2 → 4 → 5
    ↑
   curr

Re-link:
1 → 3 → 2 → 4 → 5
--------------------------------------------------------------------------------------
  
🔁 Iteration 2
next = 4

Re-link:
1 → 4 → 3 → 2 → 5

🔹 Final List
1 → 4 → 3 → 2 → 5
  --------------------------------------------------------------------------------------

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode next=null;
        for(int i=0;i<right-left;i++){
            next=curr.next;
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;
    }
}                                             
