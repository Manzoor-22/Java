import java.util.HashSet;

public class LongestSS {
    public static void main(String[] args) {
        String s = "pwwkew";

        HashSet<Character> hs = new HashSet<>();
        int ans = 0, longest = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hs.contains(c)){
                ans = Math.max(ans, longest);
                longest = 0;
                hs.clear();
            }
            else{         
                longest++;
            }
            hs.add(c);
        }
        System.out.println(ans);
    }
}
