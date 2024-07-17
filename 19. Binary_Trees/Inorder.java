public class Inorder {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static class BinTree{
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

        public void treeTraversal(Node head){
            if(head == null){
                return;
            }
            treeTraversal(head.left);
            System.out.println(head.val);
            treeTraversal(head.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinTree bt = new BinTree();
        Node head = bt.createTree(nodes);
        bt.treeTraversal(head);
    }
}
