import java.util.HashSet;

public class Jewels {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        int ans = 0;
        for(Character c : jewels.toCharArray()){
            hs.add(c);
        }
        System.out.println(hs);
        for(Character c: jewels.toCharArray()){
            if(hs.contains(c)){
                ans++;
            }
        }

        return ans;
    }
}
