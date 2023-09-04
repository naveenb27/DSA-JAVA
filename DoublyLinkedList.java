import java.util.*;
class Dll{
    Node head;
    Node tail;
    Dll(){
        head = null;
        tail = null;
    }
    class Node{
        Node next;
        Node prev;
        int val;
        Node(int val){
            this.val = val;
            next = null;
            prev = null;
        }
    }
    public void insertAtBeginning(int val){
        Node node = new Node(val);
        if(head == null){
            tail = node;
        }else{
            head.prev = node;
        }
        node.next = head;
        head = node;
    }
    public void insert(int pos, int val){
        Node node = new Node(val);
        Node temp = head;
        for(int i = 1; i<pos; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        temp.next.prev = node;
    }
    public void delete(int pos){
        Node temp = head;
        for(int i = 1; i<pos; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }
    public void displayReverse(){
        Node temp = tail;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
    }
}
public class DoublyLinkedList{
    public static void main(String[] args){
        Dll doubleLinkedList = new Dll();
        doubleLinkedList.insertAtBeginning(10);
        doubleLinkedList.insertAtBeginning(9);
        doubleLinkedList.insertAtBeginning(8);
        doubleLinkedList.insert(1, 100);
        doubleLinkedList.delete(1);
        doubleLinkedList.display();
    }
}
