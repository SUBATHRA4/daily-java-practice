public class Dll {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(100);
        dll.insertEnd(200);
        dll.insertEnd(300);
        dll.insertstart(4);
        dll.traversal();
    }
}
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList{
    Node head = null;
    Node tail = null;
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    void insertstart(int data){
       Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        head.next=newNode;
        newNode.prev=head.next;
        head=newNode.prev;
    }
    void traversal(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" =>");
            temp=temp.next;
        }
    }
}