                                            Linked List Cycle II

  class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Step 1: Detect cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                hasCycle = true;
                break;
            }
        }

        // Step 2: If no cycle
        if(!hasCycle) return null;

        // Step 3: Find cycle start
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
