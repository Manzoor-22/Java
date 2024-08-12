import java.util.ArrayList;
import java.util.Random;

public class Delete {
    static class Heap{
        ArrayList<Integer> al = new ArrayList<>();

        public void add(int val){
            al.add(val);
            
            int child = al.size()-1;
            int parent = (child-1)/2;

            while(al.get(child) < al.get(parent)){
                int temp = al.get(child);
                al.set(child, al.get(parent));
                al.set(parent, temp);

                child = parent;
                parent = (child-1)/2;
            }
        }

        public int remove(){
            int last = al.size()-1;

            // swapping last with parent;
            int temp = al.get(last);
            al.set(last, al.get(0));
            al.set(0, temp);

            // Deleting last element
            int ans = al.remove(last);

            heapify(0);

            return ans;
        }

        private void heapify(int idx){
            int lc = (2*idx) + 1;
            int rc = (2*idx) + 2;
            int minIdx = idx;

            if(lc < al.size() && al.get(minIdx) > al.get(lc)){
                minIdx = lc;
            }

            if(rc < al.size() && al.get(minIdx) > al.get(rc)){
                minIdx = rc;
            }

            if(minIdx != idx){
                int temp = al.get(minIdx);
                al.set(minIdx, al.get(idx));
                al.set(idx, temp);

                heapify(minIdx);
            }
        }

        public boolean isEmpty(){
            return al.isEmpty();
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        Random r = new Random();

        for(int i = 0; i < 5; i++){
            h.add(r.nextInt(100));
        }

        while(!h.isEmpty()){
            System.out.println(h.remove());
        }
    }
}
