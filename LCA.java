
import java.util.LinkedList;
import java.util.Stack;

public class LCA {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static void lowCA(Node root, Node first, Node second){
        LinkedList<Node> path1;
        LinkedList<Node> path2;

        path1 = getPath(root, first);
        while(!path1.isEmpty()){
            System.out.print(path1.remove().val + " ");
        }

        System.out.println();
        path2 = getPath(root, second);
        while(!path2.isEmpty()){
            System.out.print(path2.remove().val + " ");
        }
    }

    public static LinkedList<Node> getPath(Node root, Node target, String path){
        
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

        lowCA(root, root.left.right.right, root.right.right);
    }
}
