import java.util.*;

class cll{
    Node last;
    cll(){
        last = null;
    }
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }
    public void insertAtBeginning(int val){
        Node n = new Node(val);//8

        if(last == null){
            n.next = n;
            last = n;
        }else{
            n.next = last.next;
            last.next = n;
        }
    }

    public void insertAtEnd(int val){
        if(last == null){
            insertAtBeginning(val);
        }
        Node n  = new Node(val);
        n.next = last.next;
        last.next = n;
        last = n;
    }
    public void display(){
        Node temp = last.next;
        System.out.println("Circular linked list : ");
        do{
            System.out.print(temp.val+" ");
            temp  = temp.next;
        }while(temp != last.next);
    }
}

public class CircularLinkedList{
    public static void main(String args[]){
        cll c = new cll();
        c.insertAtBeginning(10);
        c.insertAtBeginning(8);
        c.insertAtBeginning(6);
        c.insertAtBeginning(4);
        c.insertAtBeginning(2);
        c.insertAtEnd(12);
        c.display();
    }
}
