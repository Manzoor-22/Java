import java.util.*;

public class TopView {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static class Info{
        Node node;
        int weight;

        Info(Node node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.right = new Node(4);
        tree.left.right.right = new Node(5);
        tree.left.right.right.right = new Node(6);
        
        // Queue for traversing (Level order traversal)
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(tree, 0));
        q.add(new Info(null, 0));

        // HashMap for storing key(weight) and value(node val)
        HashMap<Integer, Integer> hm = new HashMap<>();

        while(!q.isEmpty()){
            Info removed = q.remove();
            if(removed.node == null){
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(new Info(null, 0));
                }
            }else{
                if(!hm.containsKey(removed.weight)){
                    hm.put(removed.weight, removed.node.val);
                }
                if(removed.node.left != null){
                    q.add(new Info(removed.node.left, removed.weight-1));
                }
                if(removed.node.right != null){
                    q.add(new Info(removed.node.right, removed.weight+1));
                }
            }
        }

        for(Map.Entry itr : hm.entrySet()){
            System.out.println("Key = " + itr.getKey() + " Value = " + itr.getValue());
        }

        
    }
}
