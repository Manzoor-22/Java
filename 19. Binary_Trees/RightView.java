import java.util.*;

class RightView{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    static class Info{
        int val;
        TreeNode node;
        Info(TreeNode node, int val){
            this.node = node;
            this.val = val;
        }
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new LinkedList<>();

        //HashMap for storing nodes val with weights
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        //Queue for Level-Order traversal
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(root, 0));
        q.add(new Info(null, 0));

        while(!q.isEmpty()){
            Info removed = q.remove();
            if(removed.node == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(new Info(null, 0));
                }
            }
            else{
                if(!tm.containsKey(removed.val))
                    tm.put(removed.val, removed.node.val);
                if(removed.node.left != null){
                    q.add(new Info(removed.node.left, removed.val+1));
                }   
                if(removed.node.right != null){
                    q.add(new Info(removed.node.right, removed.val+1));
                }                 
            }
        }

        System.out.println(tm);

        for(Map.Entry<Integer, Integer> itr : tm.entrySet()){
            ans.add(itr.getValue());
        }
        
        return ans;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(3);
        // node.right.right = new TreeNode(4);

        System.out.println(rightSideView(node));
    }
}