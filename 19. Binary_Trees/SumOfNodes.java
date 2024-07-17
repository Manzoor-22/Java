public class SumOfNodes {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static class BinaryTree{
        int idx = -1;

        public Node createTreee(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = createTreee(nodes);
            newNode.right = createTreee(nodes);

            return newNode;
        }

        public int SumOfNodes(Node root){
            if(root == null){
                return 0;
            }

            int leftSum = SumOfNodes(root.left);
            int rightSum = SumOfNodes(root.right);

            return leftSum+rightSum+root.val;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.createTreee(nodes);
        System.out.println(bt.SumOfNodes(root));
    }
}
