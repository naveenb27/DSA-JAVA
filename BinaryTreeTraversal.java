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
                if(temp.val <n.val){
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
    public void postOrder(){
        postOrderTraversal(root);
    }
    public void preOrder(){
        preOrderTraversal(root);
    }
    private void inOrderTraversal(Node node){
        if (node != null) {
            inOrderTraversal(node.left);//7
            System.out.println(node.val);
            inOrderTraversal(node.right);
        }
    }
    private void postOrderTraversal(Node node){
        if (node != null) {
            postOrderTraversal(node.left);//7
            System.out.println(node.val);
            postOrderTraversal(node.right);
        }
    }
    private void preOrderTraversal(Node node){
        if (node != null) {
            preOrderTraversal(node.left);//7
            System.out.println(node.val);
            preOrderTraversal(node.right);
        }
    }

}

public class BinaryTreeTraversal{
    public static void main(String args[]){
        BTS b = new BTS();
        b.insert(10);
        b.insert(7);
        b.insert(12);
        b.insert(8);
        b.insert(5);
        System.out.println("In order traversal: ");
        b.inOrder();
        System.out.println("Pre order traversal: ");
        b.preOrder();
        System.out.println("Post order traversal: ");
        b.postOrder();
    }
}
