import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VertivcalTraversal {
    static LinkedHashMap<Integer, ArrayList<Integer>> hm =  new LinkedHashMap<>();
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node tree= new Node(1);
        tree.left = new Node(2);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right = new Node(3);
        tree.right.left = new Node(6);
        tree.right.right = new Node(7);
        tree.right.right.right = new Node(4);

        traverse(tree, 0);
        // System.out.println(hm.get(9));
        // hm.remove(9);
        for (Map.Entry<Integer,ArrayList<Integer>> entry : hm.entrySet())  
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
        List<List<Integer>> ans = new LinkedList<>();
        // while(!hm.isEmpty()){
        //     int lowest = Integer.MAX_VALUE;
        //     List<Integer> curr = new LinkedList<>();
        //     for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
        //         if(entry.getValue() < lowest){
        //             lowest = entry.getValue();
        //         }
        //     }
        //     for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
        //         if(entry.getValue() == lowest){
        //             curr.add(entry.getKey());
        //         }
        //     }
        //     for(Integer i : curr){
        //         if(hm.containsKey(i)){
        //             hm.remove(i);
        //         }
        //     }
        //     ans.add(curr);
        // // }
        // System.out.println(ans);
    }

    private static void traverse(Node root, int parentVal){
        if(root == null){
            return;
        }
        hm.put(root.val, parentVal);
        traverse(root.right, parentVal+1);
        traverse(root.left, parentVal-1);
    }
}
