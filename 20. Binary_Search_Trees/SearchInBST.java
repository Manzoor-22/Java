public class SearchInBST {
    static class Node{
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
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.val == val){
            return true;
        }
        boolean checkLeft = search(root.left, val);
        boolean checkRight = search(root.right, val);

        return (checkLeft || checkRight);
    }

    public static void main(String[] args) {
        Node bst = null;
        bst = insert(bst, 5);
        insert(bst, 2);
        insert(bst, 3);
        insert(bst, 6);
        insert(bst, 8);
        insert(bst, 1);
        System.out.print("Tree: ");
        inorder(bst);
        System.out.println();
        System.out.println(search(bst, 2));
    }
}
