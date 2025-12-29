                                               Rotate List
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
--------------------------------------------------------------------------------------
  
🧠 Step-by-Step Explanation
🔹 Step 1: Handle Edge Case
if (head == null) return head;
--------------------------------------------------------------------------------------
🔹 Step 2: Find Length and Last Node
int length = 1;
ListNode dummy = head;

while (dummy.next != null) {
    dummy = dummy.next;
    length++;
}

For:

1 → 2 → 3 → 4 → 5
After loop:

length = 5
dummy → 5 (last node)
--------------------------------------------------------------------------------------
🔹 Step 3: Reduce k using modulo
int position = k % length;

k = 7, length = 5 → 7 % 5 = 2
--------------------------------------------------------------------------------------

🔹 Step 4: Find New Tail Node
ListNode current = head;
for (int i = 0; i < length - position - 1; i++) {
    current = current.next;
}


For:
length = 5
position = 2
Calculation:

length - position - 1 = 5 - 2 - 1 = 2

Move current 2 steps:

1 → 2 → 3 → 4 → 5
        ↑
       current
--------------------------------------------------------------------------------------

🔹 Step 5: Break and Rotate
ListNode newHead = current.next;
current.next = null;
dummy.next = head;
--------------------------------------------------------------------------------------
Before:
1 → 2 → 3 → 4 → 5 → null

After breaking:
1 → 2 → 3 → null
4 → 5 → null

Connect tail to old head:
4 → 5 → 1 → 2 → 3 → null

🔹 Step 6: Return New Head
return newHead;
--------------------------------------------------------------------------------------

✔ New head = 4

🧪 Dry Run Summary
Step	List
Initial	1 → 2 → 3 → 4 → 5
After rotate	4 → 5 → 1 → 2 → 3
  
   --------------------------------------------------------------------------------------   
  
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int length = 1;
        ListNode dummy = head;

        while (dummy.next != null) {
            dummy = dummy.next;
            length++;
        }
        int position = k % length;
        if (position == 0) return head;
        ListNode current = head;
        for (int i = 0; i < length - position - 1; i++) {
            current = current.next;
        }

        ListNode newHead = current.next;
        current.next = null;
        dummy.next = head;
        return newHead;        
    }
}
