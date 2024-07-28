
public class CreateBST {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static void inOrder(Node root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
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

    public static void main(String[] args) {
        Node bst = null;
        int arr[] = {5,1,3,4,2,7};

        bst = insert(bst, 5);
        
        for (int i = 0; i < arr.length; i++) {
            insert(bst, arr[i]);
        }

        inOrder(bst);
    }
}
