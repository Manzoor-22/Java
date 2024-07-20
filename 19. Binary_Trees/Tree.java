public class Tree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static void Inorder(Node tree){
        if(tree == null){
            return;
        }
        Inorder(tree.left);
        System.out.print(tree.val);
        Inorder(tree.right);
    }

    public static void main(String[] args) {
        Node tree = new Node(5);
        tree.left = new Node(7);
        tree.right = new Node(8);
        tree.left.left = new Node(2);
        remove(tree);
        Inorder(tree);
    }

    public static void remove(Node root){
        if(root == null){
            return;
        }
        if(root.left != null && root.right == null){
            root = root.left;
        }
        if(root.left == null && root.right != null){
            root = root.right;
        }
        remove(root.left);
        remove(root.right);
    }
}
