
import java.util.LinkedList;
import java.util.Queue;

public class Diameter{
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static void printTree(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);


        while(!q.isEmpty()){
            Node removed = q.remove();
            if(removed == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                System.out.print(removed.val + " ");
                if(removed.left != null)
                    q.add(removed.left);
                if(removed.right != null)
                    q.add(removed.right);
            }
        }
    }

    public static int height(Node root){
        if(root == null)
            return 0;
        
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH, rightH)+1;
    }

    public static int diameter(Node root){
        if(root == null)
            return 0;
        
        int leftD = diameter(root.left);
        int rightD = diameter(root.right);
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(Math.max(leftD, rightD), (leftH+rightH+1));
    }

    public static void main(String args[]){
        //       0
        //      / \
        //     1   2
        //    /   / \
        //   3   4   5
        //      /
        //     8
        //    /
        //   10
        
        Node tree = new Node(0);
        tree.left = new Node(1);
        tree.right = new Node(2);
        tree.left.left = new Node(3);
        tree.right.left = new Node(4);
        tree.right.right = new Node(5);
        tree.right.left.left = new Node(8);
        tree.right.left.left.left = new Node(10);

        printTree(tree);
        System.out.println("Height: " + height(tree));
        System.out.println("Diameter: " + diameter(tree));
    
    }
}