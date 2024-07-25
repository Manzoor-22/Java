import java.util.LinkedList;

public class KthAncestor {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static boolean getPath(Node root, int val, LinkedList<Integer> ll){
        if(root == null){
            return false;
        }
        ll.add(root.val);
        if(root.val == val){
            return true;
        }
        if(getPath(root.left, val, ll) || getPath(root.right, val, ll)){
            return true;
        }
        ll.remove(ll.size()-1);
        return false;
    }

    public static int getLength(Node root, int target, int k){
        if(root == null){
            return -1;
        }
        if(root.val == target){
            return 0;
        }
        int left = getLength(root.left, target, k);
        int right = getLength(root.right, target, k);

        if(left == -1 && right == -1){
            return -1;
        }

        return Math.max(left,right)+1;
    }

    public static int getAncestor(Node root, int target, int k) {
        if(root == null) {
            return -1;
        }
        
        if(root.val == target) {
            return 0;
        }

        int left = getAncestor(root.left, target, k);
        int right = getAncestor(root.right, target, k);
        
        if(left == -1 && right == -1){
            return -1;
        }
        
        int max = Math.max(left, right)+1;
        if(max == k){
            System.out.println(k + " - ancestor: " + root.val);
        }

        return max;
    }

    public static void main(String[] args) {
        //          1
        //        /   \
        //       2     4
        //      /     / \
        //     6     8  10
        //    /     /   / \
        //   15    25  29  35
        
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(6);
        tree.left.left.left = new Node(15);
        tree.right = new Node(4);
        tree.right.left = new Node(8);
        tree.right.left.left = new Node(25);
        tree.right.right = new Node(10);
        tree.right.right.left = new Node(29);
        tree.right.right.right = new Node(35);

        // LinkedList<Integer> ll = new LinkedList<>();
        
        // getPath(tree, 8, ll);

        // if(ll.isEmpty()){
        //     System.out.println(-1);
        // } else{
        //     System.out.println("Path = " + ll);
        //     int k = 1;
        //     if(k >= ll.size())
        //         System.out.println(-1);
        //     else
        //         System.out.println("Ancestor " + k + " = " + ll.get(ll.size()-k-1));
        // }

        getAncestor(tree,35,1);
    }
}
