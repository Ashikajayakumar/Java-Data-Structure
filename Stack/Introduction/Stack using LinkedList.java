                                          Implementation of Stack Using the Linked List

class Stack{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node top;
    boolean isEmpty(){
        return top==null;
    }
    void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return -1;
        }else{
            int popped = top.data;
            top=top.next;
            return popped;
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return -1;
        }else{
            return top.data;
        }
    }
    void display(){
        Node temp=top;
        if(isEmpty()){
            System.out.println("EMPTY");
        }else{
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main (String[] args) {
        Stack s=new Stack();
        s.push(20);
        s.push(10);
        s.display();
        System.out.println("Popped value "+s.pop());
        s.display();
        System.out.println("Peeked value "+s.peek());
        s.display();
    }
}                                            





                                            
