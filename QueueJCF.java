import java.util.PriorityQueue;

public class QueueJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(8);
        q.add(2);
        q.add(0);
        q.add(1);

        while(!q.isEmpty()){
            System.out.print(q.getMin() + " ");
        }
    }
}
