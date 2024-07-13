import java.util.LinkedList;
import java.util.Queue;

public class InterleavesOf2half {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";

        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();

        for(Character c : s1.toCharArray()){
            q1.add(c);
        }
        for(Character c : s2.toCharArray()){
            q2.add(c);
        }

        for(char c : s3.toCharArray()){
            if(!q1.isEmpty() && q1.peek() == c){
                q1.remove();
            } else if(!q2.isEmpty() && q2.peek() == c){
                q2.remove();
            } else
                System.out.println("false");
        }
        System.out.println(true);
    }
}
