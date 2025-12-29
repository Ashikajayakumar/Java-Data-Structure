                                                       Swap Nodes in Pairs


Java Implementation
  
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        while(curr.next!=null && curr.next.next!=null){
            ListNode first=curr.next;
            ListNode second=curr.next.next;
            first.next=second.next;
            second.next=first;
            curr.next=second;
            curr=first;
        }
        return dummy.next;
    }
}
--------------------------------------------------------------------------------------
Example 1:

Input: head = [1,2,3,4]
Output: [2,1,4,3]

Iteration: 0
          
  dummy → 1 → 2 → 3 → 4
   ↑
  curr
--------------------------------------------------------------------------------------
  
  dummy → 1 → 2 → 3 → 4
         ↑    ↑
       first second

  
            ListNode first=curr.next;                          # first = 1
            ListNode second=curr.next.next;                    # second = 2
            first.next=second.next;                            # first.next = 3
            second.next=first;                                 # second .next = 1
            curr.next=second;                                  # curr.next = 2
            curr=first;                                        # curr = 1
        }
  --------------------------------------------------------------------------------------
  
  dummy → 2 → 1 →  3 →   4
              ↑    ↑     ↑
             curr  first  second

  
            ListNode first=curr.next;                          # first = 3
            ListNode second=curr.next.next;                    # second = 4
            first.next=second.next;                            # first.next = null
            second.next=first;                                 # second .next = 3
            curr.next=second;                                  # curr.next = 4
            curr=first;                                        # curr = 3
        }

  
dummy → 2 → 1 → 4 → 3 → null

  
  

