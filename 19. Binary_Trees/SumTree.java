
import java.util.LinkedList;
import java.util.Queue;

public class SumTree{
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    static Node tree;
    
    public static void createTree(){
        tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right.left = new Node(6);
        tree.right.right = new Node(7);
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node removed = q.remove();
            if(removed == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            } else{
                System.out.print(removed.val + " ");
                if(removed.left != null)
                    q.add(removed.left);
                if(removed.right != null){
                    q.add(removed.right);
                }
            }
        }
    }

    public static int sumTreeConversion(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumTreeConversion(root.left);
        int rightSum = sumTreeConversion(root.right);
        
        int root_val = root.val;
        root.val = leftSum + rightSum;
        if(root.left != null){
            root.val += root.left.val;
        }
        if(root.right != null){
            root.val += root.right.val;
        }

        return root_val;
    }

    public static void main(String args[]){
        createTree();
        levelOrder(tree);
        sumTreeConversion(tree);
        levelOrder(tree);
    }
}