import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        //      0
        //    /   \
        //   1     2
        //  / \   / \
        // 3   4 5   6

        Node tree = new Node(0);
        tree.left = new Node(1);
        tree.left.left = new Node(3);
        tree.left.right = new Node(4);
        tree.right = new Node(2);
        tree.right.right = new Node(6);
        tree.right.left = new Node(5);

        printK(tree, 3);
    }

    public static void printK(Node tree, int k){
        Queue<Node> q = new LinkedList<>();
        q.add(tree);
        q.add(null);
        LinkedList<Integer> ll = new LinkedList<>();
        while(!q.isEmpty()){
            Node removed = q.remove();
            if(removed == null){
                k--;
                if(k == 0){
                    System.out.println(ll);
                    return;
                } else{
                    ll = new LinkedList<>();
                    q.add(null);
                }
            } else{
                ll.add(removed.val);
                if(removed.left != null){
                    q.add(removed.left);
                }
                if(removed.right != null){
                    q.add(removed.right);
                }
            }
        }

        System.out.println(ll);
    }
}
