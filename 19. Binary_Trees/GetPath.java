import java.util.ArrayList;

public class GetPath {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    
    public static boolean getPath(Node root, int val, ArrayList<Integer> al){
        if(root == null){
            return false;
        }
        al.add(root.val);
        if(root.val == val){
            return true;
        }

        boolean left = getPath(root.left, val, al);
        boolean right = getPath(root.right, val, al);
        
        if(left || right){
            return true;
        }
        
        al.remove(al.size()-1);
        return false;
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right.right = new Node(6);

        ArrayList<Integer> al = new ArrayList<>();
        getPath(tree, 6, al);

        System.out.println(al);
    }
}
