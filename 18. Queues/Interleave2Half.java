import java.util.*;

public class Interleave2Half {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.addAll(java.util.Arrays.asList(1,2,3,4,5,6,7,8));

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int half = q.size() / 2;

        while(q.size() > half){
            q1.add(q.remove());
        }
        while(!q.isEmpty()){
            q2.add(q.remove());
        }

        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q2.remove());
        }

        System.out.println(q);
    }
}
