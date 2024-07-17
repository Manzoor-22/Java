public class CountNodesRec {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static class BT{
        public int countRecursion(Node root){
            if(root == null){
                return 0;
            }
            int leftNodes = countRecursion(root.left);
            int rightNodes = countRecursion(root.right);
            
            return leftNodes + rightNodes + 1;
        }

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
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        BT tree = new BT();
        Node root = tree.createTree(nodes);
        System.out.println(tree.countRecursion(root));
    }
}
