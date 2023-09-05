import java.util.*;

class Queue{
    Node head;
    Queue(){
        head = null;
    }
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next= null;
        }
    }
    public void enQueue(int val){
        Node n = new Node(val);
        if(head==null){
            head = n;
        }else{
            Node temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    public void deQueue(){
        head = head.next;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
    }
}
public class Main{
    public static void main(String args[]){
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(11);
        q.enQueue(12);
        q.deQueue();
        q.display();
    }
}
