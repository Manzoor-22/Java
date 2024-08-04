import java.util.LinkedList;
import java.util.List;

public class LLPath {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    public static void getPath(Node root, List<Node> ll){
        if(root == null){
            return;
        }
        getPath(root.left, ll);
        ll.add(root);
        getPath(root.right, ll);
    }
    public static Node insert(Node root, int val){
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }
        if(root.val < val){
            root.right = insert(root.right, val);
        }
        if(root.val > val){
            root.left = insert(root.left, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            System.out.print("null ");
            return;
        }
        System.out.print(root.val + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node bst = null;
        bst = insert(bst, 2);
        insert(bst, 1);
        insert(bst, 4);
        insert(bst, 3);
        // insert(bst, 8);
        // insert(bst, 1);
        System.out.print("Tree: ");
        // inorder(bst);

        LinkedList<Node> ll = new LinkedList<>();
        getPath(bst, ll);
        
        for(int i = 0; i < ll.size(); i++){
            System.out.print(ll.get(i).val + " ");
        }
    }
}
