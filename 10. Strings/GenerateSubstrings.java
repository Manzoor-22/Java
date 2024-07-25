import java.util.Collections;
import java.util.LinkedList;

public class GenerateSubstrings {
    public static void main(String[] args) {
        LinkedList<String> ans = new LinkedList<>();

        ans = substrings("abcs");
        ans.contains(ans)
        System.out.println(ans);
    }

    public String[] shortestSubstrings(String[] arr) {
        LinkedList<LinkedList<String>> all = new LinkedList<>();

        for(int i = 0; i < arr.length; i++){
            all.add(substrings(arr[i]));
        }

        
    }

    public static LinkedList<String> substrings(String s){
        LinkedList<String> ans = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                ans.add(s.substring(i, j));
            }
        }
        return ans;
    }
}
