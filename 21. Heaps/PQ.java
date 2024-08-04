import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(5);
        pq.add(-5);
        pq.add(25);
        pq.add(-17);
        pq.add(0);

        System.out.println("Queue: " + pq);
        System.out.println("Size: " + pq.size());
        System.out.println("Peek(): " + pq.peek());
        System.out.println("Remove(): " + pq.remove());
    }
}
