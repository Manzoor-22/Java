
import java.util.LinkedList;
import java.util.Queue;

public class SumOfNodesLevel {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static class BinaryTree{
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

        public void printTree(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curr = q.remove();

                if(curr == null){
                    System.out.println();
                    if(q.isEmpty())
                        return;
                    else
                        q.add(null);
                } else{
                    System.out.print(curr.val + " ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }

        public int SumOfNodes(Node root){
            int sum = 0;
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()){
                Node curr = q.remove();
                sum += curr.val;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {3,8,5,6,-1,-1,-1,-1,2,-1,1,-1,9,3,-1,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node head = bt.createTree(nodes);

        bt.printTree(head);

        System.out.println("Sum: " + bt.SumOfNodes(head));
    }
}
