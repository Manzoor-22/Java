public class LargestBST {
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    static class Info{
        boolean isValid;
        int size;
        int min;
        int max;
        public Info(boolean isValid, int size, int min, int max){
            this.isValid = isValid;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int largest = 0;

    public static Info getLargest(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info left = getLargest(root.left);
        Info right = getLargest(root.right);

        int size = left.size + right.size + 1;
        int min = Math.min(root.val, Math.min(left.min, right.min));
        int max = Math.max(root.val, Math.max(left.max, right.max));

        if(left.max >= root.val || right.min <= root.val){
            return new Info(false, size, min, max);
        }

        if(left.isValid && right.isValid){
            largest = Math.max(largest, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node tree = new Node(50);
        tree.left = new Node(30);
        tree.left.left = new Node(5);
        tree.left.right = new Node(20);
        tree.right = new Node(60);
        tree.right.left = new Node(45);
        tree.right.right = new Node(70);
        tree.right.right.left = new Node(65);
        tree.right.right.right = new Node(80);

        System.out.print("Tree = "); inorder(tree);
        System.out.println();
        getLargest(tree);
        System.out.print("Largest Binary Search Tree = " + largest); 
    }
}
