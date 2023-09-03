import java.util.*;

class LL{
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    LL(){
        head = null;
    }
    public void insertAtBeginning(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }

    public void insert(int pos, int val){
        Node temp = head;
        if(pos==0){
            insertAtBeginning(val);
        }else {
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
        }
    }
    public void delete(int pos){
        Node temp = head;
        for(int i = 1; i<pos; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void reverse(){
        System.out.println("\nReversing a Linked list");
        Node prev = null;
        Node current = head;
        Node next = current.next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void printLinkedList(){
        Node temp = head;
        System.out.println("Printing linked list");
        while(temp.next != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.print(temp.val+" ");
    }

}

public class reverseLinkedList{
    public static void main(String[] args){
        LL l = new LL();
        l.insertAtBeginning(10);
        l.insertAtBeginning(20);
        l.insertAtBeginning(40);
        l.insertAtBeginning(50);
        l.insert(2, 30);
        l.delete(2);
        l.printLinkedList();
        l.reverse();
        l.printLinkedList();
    }
}
