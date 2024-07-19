class Subtree{
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static boolean isSubtree(Node tree, Node subTree){
        if(tree == null){
            return false;
        }
        if(tree.val == subTree.val){
            if(checkAllNodes(tree, subTree))
                return true;
        }
        boolean checkLeft = isSubtree(tree.left, subTree);
        boolean checkRight = isSubtree(tree.right, subTree);

        return (checkLeft || checkRight);
    }

    public static boolean checkAllNodes(Node tree, Node subTree){
        if(tree == null && subTree == null){
            return true;
        }
        if(tree == null || subTree == null || tree.val != subTree.val){
            return false;
        }
        boolean checkLeft = checkAllNodes(tree.left, subTree.left);
        boolean checkRight = checkAllNodes(tree.right, subTree.right);

        return (checkLeft && checkRight);
    }

    public static void main(String[] args) {
        Node tree = new Node(3);
        tree.left = new Node(4);
        tree.right = new Node(5);
        tree.left.left = new Node(1);
        tree.left.right = new Node(2);

        Node subTree = new Node(4);
        subTree.left = new Node(1);
        subTree.right = new Node(2);

        preOrder(tree);
        System.out.println();
        preOrder(subTree);
        System.out.println();
        System.out.println(isSubtree(tree, subTree));

    }
}