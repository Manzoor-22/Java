

public class Validate {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }
        if(val > root.val){
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + "->");
        inOrder(root.right);
    }

    static Node prev = null;

    public static boolean validateBST(Node root){
        if(root == null){
            return true;
        }
        if(prev != null && root.val < prev.val){
            return false;
        }

        boolean checkLeft = validateBST(root.left);
        prev = root;
        boolean checkRight = validateBST(root.right);

        return checkLeft && checkRight;
    }
    
    public static void main(String args[]){
        int[] bst = {5,4,3,2,1,6,9};
        
        Node root = insert(null, bst[0]);

        for(int i = 1; i < bst.length; i++){
            insert(root, bst[i]);
        }
        
        inOrder(root);

        System.out.println(validateBST(root));
    }
}
