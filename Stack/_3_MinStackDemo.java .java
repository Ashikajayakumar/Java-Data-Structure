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

public class MinStackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack stack = new MinStack();

        int choice, value;
        do {
            System.out.println("\n1. Push\n2. Pop\n3. Top\n4. Get Min\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Top element: " + stack.top());
                    break;
                case 4:
                    System.out.println("Minimum element: " + stack.getMin());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
