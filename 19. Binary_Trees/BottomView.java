import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    static class Info{
        int weight;
        Node node;
        Info(Node node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        // root.left.right.left = new Node(10);
        // root.left.right.right = new Node(14);
        // root.right.right = new Node(25);

        ArrayList<Integer> ans = new ArrayList<>();
        
        //HashMap for storing the key and values
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        //Queue for level-order traversal
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 0));
        q.add(new Info(null, 0));
        
        while(!q.isEmpty()){
            Info removed = q.remove();
            
            if(removed.node == null){
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(new Info(null, 0));
                }
            } else{
                tm.put(removed.weight, removed.node.val);
                if(removed.node.left != null)
                    q.add(new Info(removed.node.left, removed.weight-1));
                if(removed.node.right != null)
                    q.add(new Info(removed.node.right, removed.weight+1));
            }
        }

        System.out.println(tm);
    }
}
