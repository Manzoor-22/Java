public class DeleteNode {
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

    public static Node delete(Node root, int val){
        if(root == null){
            return null;
        }
        if(val == root.val){
            //case 1 : If root is leaf
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 : If only right or left tree exists
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            // case 3 : If there exists both left subtree and right subtree
            // steps : 1) Go to right -> 2) Go until you find left most node -> 3) replace the value of that node with root

            Node leftMost = getLeftMost(root.right);
            root.val = leftMost.val;
            root.right = delete(root.right, leftMost.val);
        }
        if(val < root.val){
            root.left = delete(root.left, val);
        }
        if(val > root.val){
            root.right = delete(root.right, val);
        }

        return root;
    }

    public static Node getLeftMost(Node root){
        while(root.left != null){
            root = root.left;
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
        
        System.out.println();
        System.out.println("Deleting node " + 1);
        delete(bst, 1);
        inOrder(bst);

    }
}
