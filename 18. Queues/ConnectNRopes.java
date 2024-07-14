import java.util.PriorityQueue;
import java.util.Queue;

public class ConnectNRopes {
    public static int connectRopes(int a[]){
        Queue<Integer> pq = new PriorityQueue<>();
        int ans = 0;
        
        for(Integer element : a)
            pq.add(element);

        while(pq.size() > 1){
            int sum = pq.remove()+pq.remove();
            ans += sum;
            pq.add(sum);
        }

        return ans;
    }
    public static void main(String[] args) {
        int a[] = {4,3,2,6};
        System.out.println(connectRopes(a));
    }
}
