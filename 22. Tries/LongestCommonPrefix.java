public class LongestCommonPrefix {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;
        int freq;

        public Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
                eow = false;
                freq = 0;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String str){
        Node curr = root;

        for(int i = 0; i < str.length(); i++){
            int idx = str.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
                curr.freq = 1;
            } else{
                curr.freq++;
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};

        for(int i = 0; i < strs.length; i++){
            insert(strs[i]);
        }

        Node curr = root;

        for(int i = 0; i < strs[0].length(); i++){
            int idx = strs[0].charAt(i)-'a';
            System.out.println(curr.freq);
            curr = curr.children[idx];
        }
    }
}
