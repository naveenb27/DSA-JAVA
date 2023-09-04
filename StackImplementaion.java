import java.util.*;

class Stack{
    Node head;
    Stack(){
        head = null;
    }
    class Node{
        int val;
        Node next;
        Node(int val){
            next = null;
            this.val = val;
        }
    }
    public void push(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    public void pop(){
        head = head.next;
    }
    public void peek(){
        System.out.println("Peek of stack : ");
        System.out.println(head.val);
    }
    public void display(){
        Node temp = head;
        System.out.println("\nStack : " );
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}

public class Main{
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(11);
        s.push(12);
        s.display();
        s.pop();
        s.peek();
        s.display();
    }
}
