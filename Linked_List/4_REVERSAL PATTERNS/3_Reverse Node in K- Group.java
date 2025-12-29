                                           Reverse Node in K-Group
Java Implementation
                                             
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head== null) return null;
        ListNode temp=head;
        int count=0;
        while(temp!=null && count < k){
            temp=temp.next;
            count++;
        }
        if(count<k) return head;
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        count=0;
        while(current !=null && count < k){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        head.next= reverseKGroup(next,k);
        return prev;
    }
}
--------------------------------------------------------------------------------------


🔹 Step 0: Setup Dummy Node
dummy → 1 → 2 → 3 → 4 → 5
prevGroup = dummy

--------------------------------------------------------------------------------------
🔹 Step 1: Find kth node
ListNode kth = getKthNode(prevGroup, k);

For k = 2:
prevGroup = dummy
kth = node(2)


List:
dummy → 1 → 2 → 3 → 4 → 5
            ↑
           kth

🔹 Step 2: Mark next group
ListNode nextGroup = kth.next;
nextGroup = 3
--------------------------------------------------------------------------------------
🔹 Step 3: Reverse k nodes
Initial pointers
prev = nextGroup = 3
curr = prevGroup.next = 1
  --------------------------------------------------------------------------------------

🔁 Reverse loop
while (curr != nextGroup)

🔹 Iteration 1
temp = curr.next = 2
curr.next = prev   → 1 → 3
prev = 1
curr = 2
--------------------------------------------------------------------------------------
🔹 Iteration 2
temp = curr.next = 3
curr.next = prev   → 2 → 1 → 3
prev = 2
curr = 3 (STOP)

Result after reversing k nodes
2 → 1 → 3 → 4 → 5
--------------------------------------------------------------------------------------
🔹 Step 4: Reconnect groups
ListNode temp = prevGroup.next;
prevGroup.next = kth;
prevGroup = temp;
--------------------------------------------------------------------------------------

Updated list
dummy → 2 → 1 → 3 → 4 → 5
              ↑
          prevGroup

🔁 NEXT ITERATION (Nodes 3 & 4)

Repeat same steps:

Reverse:
3 → 4 → 5
↓
4 → 3 → 5

🔚 FINAL OUTPUT
2 → 1 → 4 → 3 → 5
