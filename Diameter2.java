import java.util.LinkedList;
import java.util.Queue;

public class Diameter2 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    static class Info{
        int height;
        int diameter;

        Info(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
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

    public static Info calDiameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = calDiameter(root.left);
        Info rightInfo = calDiameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height+rightInfo.height+1);
        int height = Math.max(leftInfo.height, rightInfo.height)+1;

        return new Info(height, diam);
    }

    public static void main(String[] args) {
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

        System.out.println(calDiameter(tree).diameter);
    }
}
