import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        BT tree = new BT();
        Node root = tree.createTree(nodes);
        // System.out.println("Count = " + tree.countNodes(root));
        System.out.println(tree.countRecursion(root));
    }

    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
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

        public int countNodes(Node root){
            int ans = 0;
            if(root == null){
                return ans;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            ans = 1;
            while(!q.isEmpty()){
                Node curr = q.remove();

                if(curr == null){
                    System.out.println();
                    if(q.isEmpty())
                        break;
                    else
                        q.add(null);
                } else{
                    System.out.print(curr.val + " ");
                    if(curr.left != null){
                        ans++;
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        ans++;
                        q.add(curr.right);
                    }
                }
            }
            return ans;
        }
    }
}
