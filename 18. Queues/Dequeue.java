import java.util.ArrayList;

public class Dequeue {
    static class DQ{
        ArrayList<Integer> dq = new ArrayList<>();

        boolean isEmpty(){
            return dq.isEmpty();
        }
        void addFirst(int e){
            dq.add(0, e);
        }
        void addLast(int e){
            dq.add(dq.size(), e);
        }
        int removeFirst(){
            return dq.remove(0);
        }
        int removeLast(){
            return dq.remove(dq.size()-1);
        }
    }
    
    public static void main(String[] args) {
        DQ q = new DQ();
        q.addFirst(1);
        q.addLast(2);
        q.addFirst(3);
        while(!q.isEmpty())
            System.out.println(q.removeLast());
    }
}
