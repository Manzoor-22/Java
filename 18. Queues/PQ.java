import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        Comparator<Integer> ascendingOrderComparator = (Integer o1, Integer o2) -> {
            if (o1 < o2)
                return -1;
            if (o1 == o2)
                return 0;
            return 1; 
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>(ascendingOrderComparator);
        // [1,2,6,3,5,4]
        pq.add(1);
        pq.add(2);
        pq.add(4);
        pq.add(6);
        pq.add(3);
        pq.add(5);

        System.out.println(pq);

        while(!pq.isEmpty()){
            pq.poll();
        }
        Array
    }
}
