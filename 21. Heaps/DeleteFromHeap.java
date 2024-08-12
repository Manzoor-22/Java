import java.util.ArrayList;
import java.util.Random;

public class DeleteFromHeap {
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

        public void print(){
            for(int i = 0; i < al.size(); i++){
                if(i == 1 || i == 3 || i == 7)
                    System.out.println();

                System.out.print(al.get(i) + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Heap h = new Heap();
        Random r = new Random();

        for(int i = 0; i < 15; i++){
            h.add(r.nextInt(100));
        }
        

        h.print();
    }
}
