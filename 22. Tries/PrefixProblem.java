public class PrefixProblem {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;
        int freq;

        public Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            eow = false;
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String s){
        Node curr = root;

        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static void getPrefix(Node curr, String ans){
        if(curr == null){
            return;
        }

        if(curr.freq == 1){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < 26; i++){
            if(curr.children[i] != null){
                getPrefix(curr.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args) {
        String[] strs = {"zebra", "dog", "duck", "dove"};
        for(int i = 0; i < 4; i++){
            insert(strs[i]);
        }
        root.freq = -1;
        getPrefix(root, "");
    }
}
