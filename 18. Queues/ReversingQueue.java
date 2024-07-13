import java.util.*;
import java.util.Arrays;

class ReversingQueue{
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.addAll(Arrays.asList(1,2,3,4));

        int size = q.size();
        System.out.println(q);
        
        reverse(q);

        System.out.println(q);

    }
}