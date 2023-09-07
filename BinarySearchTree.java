class BTS{
    Node root;
    BTS(){
        root =  null;
    }
    class Node{
        Node left, right;
        int val;
        Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    public void insert(int val){
        Node n = new Node(val);
        if(root==null){
            root = n;
        }else{
            Node temp = root;
            while(true){
                if(temp.val < n.val){
                    if(temp.right == null){
                        temp.right = n;
                        break;
                    }else{
                        temp = temp.right;
                    }
                }else if(temp.val > n.val){
                    if(temp.left == null){
                        temp.left = n;
                        break;
                    }else{
                        temp = temp.left;
                    }
                }
            }
        }
    }
    public void inOrder(){
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node node){
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.val);
            inOrderTraversal(node.right);
        }
    }
}

public class BinarySearchTree{
    public static void main(String args[]){
        BTS b = new BTS();
        b.insert(10);
        b.insert(7);
        b.insert(12);
        b.insert(8);
        b.insert(5);
        b.inOrder();
    }
}
