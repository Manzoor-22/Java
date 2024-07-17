public class Preorder {
    static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        Node(int val){
            data = val;
        }
    }

    static class BinTree{
        static int idx = -1;

        public Node createTree(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = createTree(nodes);
            newNode.rightNode = createTree(nodes);
            return newNode;
        }

        public void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " -> ");
            preorder(root.leftNode);
            preorder(root.rightNode);
        }

        public void generateArray(Node root){
            if(root == null){
                System.out.print("-1 -> ");
                return;
            }
            System.out.print(root.data + " -> ");
            generateArray(root.leftNode);
            generateArray(root.rightNode);
        }
    }
    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinTree bt = new BinTree();
        Node root = bt.createTree(nodes);
        // bt.preorder(root);
        // root = bt.createTree(nodes);
        bt.generateArray(root);
    }
}
