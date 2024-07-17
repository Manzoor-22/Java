import java.util.*;

public class LevelOrderTraversal {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static class Tree{
        static int idx = -1;

        public Node BT(int[] values){
            idx++;

            if(values[idx] == -1){
                return null;
            }

            Node newNode = new Node(values[idx]);
            newNode.left = BT(values);
            newNode.right = BT(values);

            return newNode;
        }

        public void printTree(Node head){
            if(head == null)
                return;
            
            Queue<Node> q = new LinkedList<>();
            q.add(head);
            q.add(null);

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
                    if(curr.left != null)
                        q.add(curr.left);
                    if(curr.right != null) 
                        q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree bt = new Tree();
        int[] nodes = {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        Node head = bt.BT(nodes);
        bt.printTree(head);
        System.out.println(bt.height(head));
    }
}
