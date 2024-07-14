import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDQ {
    static class Que{
        Deque<Integer> dq;
        Que(){
            dq = new LinkedList<>();
        }

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void add(int e){
            dq.addLast(e);
        }

        public int remove(){
            return dq.removeFirst();
        }
        
        public int peek(){
            return dq.getFirst();
        }
    }
    
    public static void main(String[] args) {
        Que q = new Que();
        q.add(5);
        q.add(2);
        q.add(1);

        // while(!q.isEmpty())
        //     System.out.print("->" + q.remove());

        q.remove();
        System.out.println(q.peek());
    }
}
