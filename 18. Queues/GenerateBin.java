import java.util.*;

public class GenerateBin {
    public static String binaryEq(int e){
        StringBuilder ans = new StringBuilder("");
        while(e > 0){
            int remainder = e % 2;
            ans.append(remainder);
            e /= 2;
        }
        return ans.reverse().toString();
    }

    public static void binEqQ(int n){
        Queue<String> q  = new LinkedList<>();
        q.add("1");
        System.out.println(q.peek());
        while(n-- > 0){
            String s1 = q.peek()+"0";
            String s2 = q.peek()+"1";
            System.out.println(s1);
            System.out.println(s2);
            q.add(s1);
            q.add(s2);
            q.remove();
        }
    }
    
    public static void main(String[] args) {
        int n = 11;

        binEqQ(n);
    }
}
