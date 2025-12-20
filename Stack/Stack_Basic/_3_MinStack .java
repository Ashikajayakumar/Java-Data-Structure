                              Min Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2


                             Implementation of Min Stack 

import java.util.Scanner;
import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
        System.out.println("Pushed: " + val);
    }

    public void pop() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        int removed = st.pop();
        if (removed == min.peek()) {
            min.pop();
        }
        System.out.println("Popped: " + removed);
    }

    public int top() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return st.peek();
    }

    public int getMin() {
        if (min.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return min.peek();
    }
}


              
