import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
       SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertEnd(50);
        sll.insertEnd(30);
        sll.insertStart(10);
        sll.insertEnd(40);
        sll.insertAtPosition(50, 5);
        sll.insertEnd(60);
        sll.traversal();
        sll.insertStart(20);
        sll.traversal();
        sll.removeFirst();
        sll.traversal();
        sll.removeFirst();
        sll.traversal();
        sll.removelast();
        sll.traversal();
        sll.removeAtPosition(6);
        sll.traversal();
        sll.removeAtPosition(5);
        sll.traversal();
        sll.removeAtPosition(1);
        sll.traversal();
        sll.removeByValue(70);
        sll.traversal();
        sll.find(80);
        sll.length();
        sll.occurance(60);
        sll.midvalue();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList{
    Node head = null;
    Node tail = null;
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        // System.out.println(head.data+" "+tail.data);
    }
    void insertStart(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        // System.out.println(head.data+" "+tail.data);
    }
    void traversal(){
        if(this.head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head; 
        while(temp != null){
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void insertAtPosition(int data, int pos){
        if(pos == 1){
            insertStart(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Invalid Position");
            // insertEnd(data);
            return;
        }
        if(temp.next == null){
            insertEnd(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void removeFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }
    void removelast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        
        temp.next=null;
        temp=tail;
        
        
    }
    void removeAtPosition(int pos){
         Node temp=head;
        if(pos == 1){
            removeFirst();
            return;
        }
         for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
       
        if(temp == null){
            System.out.println("Invalid Position");
            // insertEnd(data);
            return;
        }
        if(temp.next == null){
            System.out.println("invalid");
            return;
        }
       
        temp.next=temp.next.next;
        
    }
   void removeByValue(int value) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    if (head.data == value) {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return;
    }
    Node temp = head;
    while (temp.next != null && temp.next.data != value) {
        temp = temp.next;
    }
    if (temp.next == null) {
        System.out.println("Value not found");
        return;
    }
    if (temp.next == tail) {
        tail = temp;
    }
    temp.next = temp.next.next;
}
void find(int val){
    if(head==null){
        System.out.println("list is empty");
    }
    Node temp=head;
    int i=0;
    while(temp.next!=null){
        if(temp.data==val){
            System.out.println("element found at "+i+" position");
        }
        temp=temp.next;
        i++;
    }
   
}
void occurance(int val){
    if(head==null){
        System.out.println("list is empty");
    }
    Node temp=head;
    int count=0;
    while(temp!=null){
        if(temp.data==val){
            count++;
        }
        temp=temp.next;
       
    }
    System.out.println(count);
}
void length(){
    if(head==null){
        System.out.println("list is empty");
    }
    Node temp=head;
    int count=0;
    while(temp!=null){
        
            count++;
        
        temp=temp.next;
       
    }
    System.out.println(count);
}
void midvalue(){
    int count=0;
    Node temp=head;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    temp=head;
    int mid=count/2;
    for(int i=1;i<mid;i++){
        temp=temp.next;
    }
    System.out.println(temp.data);
}
void updatedata(int val)

}
