import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "race";
        if(s1.length() == s2.length()){
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for(int i = 0; i < c2.length; i++){
                if(c1[i] != c2[i]){
                    System.out.println(s1 + ", " + s2 + " are not anagrams!");
                    return;
                }
            }
            System.out.println(s1 + ", " + s2 + " are anagrams!");
        } else{
            System.out.println(s1 + ", " + s2 + " are not anagrams!");
        }
    }
}
