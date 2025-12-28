                                               Intersection of Two Linked Lists
  

headA=[4,1,8,4,5]
headB=[5,6,1,8,4,5]

Step-by-Step Pointer Movement (ptrA & ptrB)
Step	ptrA	ptrB
1    	4   	5
2   	1	    6
3	    8   	1
4	    4   	8
5	    5   	4
6	null → switch to headB = 5	5 → 6
7	    6	   6 → 1
8	    1	   1 → 8
9	    8	   8 ✅ meet here

Intersection node = 8


Java Implementation

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null || headB ==null){
            return null;
        }
        ListNode ptrA=headA;
        ListNode ptrB=headB;
        while(ptrA != ptrB){
            if(ptrA !=null){
                ptrA=ptrA.next;
            }else{
                ptrA=headB;
            }
            if(ptrB!=null){
                ptrB=ptrB.next;
            }else{
                ptrB=headA;
            }
        }
        return ptrB;
    }
}
