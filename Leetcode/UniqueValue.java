public class UniqueValue {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    static boolean unival(Node root, int head){
        if(root == null){
            return true;
        }
        if(root.val != head){
            return false;
        }

        return unival(root.left, head) && unival(root.right, head);
    }
    
    public static void main(String[] args) {
        /*
                0
               / \
              0   1
             /     \
            0       0
         */

        Node tree = new Node(1);
        tree.left = new Node(01);
        tree.left.left = new Node(01);
        tree.right = new Node(1);
        tree.right.left = new Node(01);

        System.out.println(unival(tree, tree.val));
    }
}
