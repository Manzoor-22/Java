import java.util.ArrayList;

public class PrintAllPaths {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        
    }
    private static void getPaths(Node root, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr){
        if(root.left == null && root.right == null){
            ans.add(curr);
            curr.remove(curr.size()-1);
        }
        curr.add(root.data);
        if(root.left != null)
            getPaths(root.left, ans, curr);
        if(root.right != null)
            getPaths(root.right, ans, curr);
            
        curr.remove(curr.size()-1);
    }
    
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        
        getPaths(root, ans, curr);
        
        return ans;
}
