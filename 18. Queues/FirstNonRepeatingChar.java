import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "aabccxb";
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, 0);
        Queue<Character> q = new LinkedList<>();
  
        for(char c : input.toCharArray()){
            alphabets[c-'a'] += 1;
            q.add(c);
            while(!q.isEmpty() && alphabets[q.peek()-'a'] > 1){
                q.remove();
            }
            if(q.isEmpty())
                System.out.print(-1 + " ");
            else
                System.out.print(q.peek() + " ");
        }
    }
}
