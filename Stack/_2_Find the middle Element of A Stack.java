                         Find the middle Element of A Stack
🔹 Problem: Find the Middle Element of a Stack

Given: A stack of integers
Task: Find the middle element of the stack.

Rules:
If the stack has n elements, the middle element is at position n/2 (0-based index or floor division).
You can use another temporary stack to help.
After finding the middle element, the stack should remain unchanged.

🔹 Approach (Using a Temporary Stack)
Find the size of the stack (n).
Compute the middle index: mid = n / 2 (for 0-based indexing).
Pop the top mid elements and push them into a temporary stack.
The next element popped from the original stack is the middle element.
Push the elements from the temporary stack back to the original stack.

🔹 Java Implementation

import java.util.Stack;
public class MiddleOfStack {

    public static int findMiddle(Stack<Integer> stack) {
        int size = stack.size();
        int mid = size / 2;  
        Stack<Integer> temp = new Stack<>();

        for (int i = 0; i < mid; i++) {
            temp.push(stack.pop());
        }
        int middle = stack.peek();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return middle;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack: " + stack);
        int middle = findMiddle(stack);
        System.out.println("Middle element: " + middle);
        System.out.println("Stack after finding middle: " + stack);
    }
}
