import java.util.ArrayList;

public class Subsequences {
    public static void main(String args[]){
        String s = "abcd";
        getSubStrings(s, 0, "");
    }

    public static void getSubStrings(String s, int i, String curr){
        if(i == s.length()){
            System.out.println(curr);
            return;
        }

        getSubStrings(s, i+1, curr+s.charAt(i));
        getSubStrings(s, i+1, curr);
    }
}
