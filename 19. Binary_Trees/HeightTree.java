public class HeightTree {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BT{
        static int idx = -1;

        public Node createTree(int[] nodes){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = createTree(nodes);
            newNode.right = createTree(nodes);

            return newNode;
        }

        public int height(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight)+1;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        BT tree = new BT();
        Node root = tree.createTree(nodes);

        System.out.println(tree.height(root));
    }
}
