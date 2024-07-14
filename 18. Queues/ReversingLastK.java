import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingLastK {
    public static void reverse(Queue<Integer> q, int k){
        Queue<Integer> q1 = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();
        int size = q.size();
        for(int i = 1; i <= (size-k); i++){
            q1.add(q.remove());
        }
        while(!q.isEmpty()){
            stk.push(q.remove());
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
        }
        while(!stk.isEmpty()){
            q.add(stk.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.addAll(java.util.Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(q);
        reverse(q, 15);
        System.out.println(q);
    }
}
