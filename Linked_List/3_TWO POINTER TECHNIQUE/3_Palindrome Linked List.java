                                      Palindrome Linked List
1 → 2 → 2 → 1

ListNode fast = head;
ListNode slow = head;

while(fast != null && fast.next != null){ 
    slow = slow.next;
    fast = fast.next.next;
}

--------------------------------------------------------------------------------------
Iteration: 0
  slow =1
  fast=1
--------------------------------------------------------------------------------------
Iteration: 1
  slow= 2
  fast=2
--------------------------------------------------------------------------------------
Iteration: 2
  slow=2
  fast=null
--------------------------------------------------------------------------------------
  
🔁 Iteration 1
next = slow.next;     // next → 1
slow.next = prev;    // 2 → null
prev = slow;         // prev → 2
slow = next;         // slow → 1

--------------------------------------------------------------------------------------
Result:

Reversed part: 2 → null
Remaining:     1 → null

🔁 Iteration 2
next = slow.next;     // next → null
slow.next = prev;    // 1 → 2
prev = slow;         // prev → 1
slow = next;         // slow → null


Result:
Reversed part: 1 → 2 → null

--------------------------------------------------------------------------------------
  
ListNode left = head;
ListNode right = prev;

while (right != null) {
    if (left.val != right.val) {
        return false;
    }
    left = left.next;
    right = right.next;
}
return true;
--------------------------------------------------------------------------------------
 Original list:
1 → 2 → 2 → 1

After reversing second half:
left  → 1 → 2 → 2 → 1
right → 1 → 2 → null
Step-by-Step Comparison
  --------------------------------------------------------------------------------------
🔁 Iteration 1

left.val  = 1
right.val = 1
✔ Equal → move forward

left  → 2
right → 2

--------------------------------------------------------------------------------------
  
🔁 Iteration 2

left.val  = 2
right.val = 2
✔ Equal → move forward

  
left  → 2
right → null
Loop Ends
Condition fails because:

--------------------------------------------------------------------------------------
right == null
Final Result
No mismatches found ✅
So the list IS a palindrome
return true;

--------------------------------------------------------------------------------------
  Java Implementation

    
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null &&  fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        ListNode left=head;
        ListNode right=prev;
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}
