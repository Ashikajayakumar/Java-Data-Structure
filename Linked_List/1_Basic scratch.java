                                        Java Implementation
Singly Linked List

          -Insert (Begin,End,Specific)
          -Delete (Begin,End,Specific)
          -Travseral (forward,backward)

  

class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
class LinkedList{
    Node head;
    void insertAtBegin(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }
    void insertAtEnd(int value){
        Node newNode=new Node(value);
        if(head==null){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void insertAtSpecific(int value,int position){
        Node newNode=new Node(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Out of range");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void deleteAtBegin(){
        if(head==null){
            System.out.println("NULL");
            return;
        }
        System.out.println(head.data);
        head=head.next;
    }
    void deleteAtEnd(){
        if(head==null) return;
        if(head.next==null){
            System.out.println(head.data);
            head=null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        System.out.println(temp.next.data);
        temp.next=null;
    }
    void deleteAtSpecific(int position){
        if(head==null) return;
        if(position==1){
            System.out.println(head.data);
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Out of range");
            return;
        }
        System.out.println(temp.next.data);
        temp.next=temp.next.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
   }
   void displayReverse(Node node){
       if(node==null)return;
       displayReverse(node.next);
       System.out.println(node.data+"<-");
   }
   void displayReverse(){
       displayReverse(head);
       System.out.println("NULL");
   }
public static void main (String[] args) {
    LinkedList ll=new LinkedList();
    System.out.println("Insert At first");
    ll.insertAtBegin(20);
    ll.insertAtBegin(10);
    ll.display();
    System.out.println("Insert At 3 position");
    ll.insertAtSpecific(30,3);
    ll.display();
    System.out.println("Insert At end");
    ll.insertAtEnd(40);
    ll.display();
    System.out.println("Delete At Begin");
    ll.deleteAtBegin();
    ll.display();
    System.out.println("Delete At End");
    ll.deleteAtEnd();
    ll.display();
    System.out.println("Delete At 1st position");
    ll.deleteAtSpecific(1);
    ll.display();
    System.out.println("Display at Reverse");
    ll.displayReverse();
}
}
