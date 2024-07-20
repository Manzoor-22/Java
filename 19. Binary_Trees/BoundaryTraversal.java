public class BoundaryTraversal {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static void preOrder(Node tree){
        if(tree == null){
            return;
        }
        System.out.print(tree.val + " ");
        preOrder(tree.left);
        preOrder(tree.right);
    }

    static void postOrder(Node tree){
        if(tree == null){
            return;
        }
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.print(tree.val + " ");
    }
    
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(3);
        tree.left.left.right = new Node(4);
        tree.left.left.right.left = new Node(5);
        tree.left.left.right.right = new Node(6);
        tree.right = new Node(7);
        tree.right.right = new Node(8);
        tree.right.right.left = new Node(9);
        tree.right.right.left.left = new Node(10);
        tree.right.right.left.right = new Node(11);


        if(tree != null){
            System.out.print(tree.val + " ");
            if(tree.left != null)
                preOrder(tree.left);
            if(tree.right != null)
            postOrder(tree.right);
        }
    }
}
