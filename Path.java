
import java.util.LinkedList;

public class Path {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static boolean findPath(Node root, Node target, LinkedList<Integer> ll){
        if(root == null){
            return false;
        }
        ll.add(root.val);
        if(root == target){
            return true;
        }
        boolean checkLeft = findPath(root.left, target, ll);
        boolean checkRight = findPath(root.right, target, ll);

        if(checkLeft || checkRight)
            return true;
        
        ll.remove(ll.size()-1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.right = new Node(25);

        findPath(root, root.right.right, "");
    }
}
