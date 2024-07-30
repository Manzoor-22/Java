public class PrintInRange {
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
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void getInRange(Node root, int low, int high){
        if(root == null){
            return;
        }
        // 1. if lies in the left side only
        if(root.val > high){
            getInRange(root.left, low, high);
        }
        // 2. If lies only on right side 
        else if(root.val < low){
            getInRange(root.right, low, high);
        }
        // 3. If lies in both left side and right side 
        else if(root.val >= low && root.val <= high){
            getInRange(root.left, low, high);
            System.out.print(root.val + " ");
            getInRange(root.right, low, high);
        }
    }

    public static void main(String[] args) {
        int[] tree = {6,3,5,8,9,2,1};
        Node root = insert(null, tree[0]);

        for(int i = 1 ; i < tree.length; i++){
            insert(root, tree[i]);
        }

        System.out.print("Tree: ");
        inOrder(root);
        
        int low = 2, high = 9;
        System.out.println();
        System.out.print("Values from "+ low + " to " + high + " : ");
        getInRange(root, low, high);
    }
}
