#Implementation of Stack using Array 
  
  class Stack {
    int top;
    int size;
    int[] stack;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    boolean isFull() {
        return top == size - 1;
    }
    boolean isEmpty() {
        return top == -1;
    }
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stack[++top] = value;
            System.out.println("Pushed value " + value);
        }
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return stack[top--];
        }
    }
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; 
        } else {
            return stack[top];
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(3);
        s.push(4);
        System.out.println("Popped element: " + s.pop());
        System.out.println("Peeked element: " + s.peek());
    }
}
