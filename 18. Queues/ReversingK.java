import java.util.*;

public class ReversingK {
    public static void reverse(Queue<Integer> q, int k){
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q1 = new LinkedList<>();

        for(int i = 1; i <= k; i++){
            s.push(q.remove());
        }
        while(!q.isEmpty()){
            q1.add(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.addAll(java.util.Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(q);
        reverse(q, 5);
        System.out.println(q);
    }
}
