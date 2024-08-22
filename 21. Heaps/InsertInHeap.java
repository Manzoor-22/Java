import java.util.ArrayList;

public class InsertInHeap {
    static ArrayList<Integer> al = new ArrayList<>();
    public static void main(String args[]){
        insert(9);
        insert(6);
        insert(2);
        insert(4);
        insert(3);
        insert(1);
        insert(5);
        insert(7);
        
        int k =1;
        for(int i = 0; i < al.size(); i++){
            if(i == 1 || i == 3 || i == 7){
                System.out.println();
            }
            System.out.print(al.get(i)+" ");
        }
    }

    public static void insert(int val){
        al.add(val);
        
        int child = al.size()-1;
        int parent = (child-1)/2;

        while(child > 0 && al.get(child) > al.get(parent)){
            int k = al.get(child);
            al.set(child, al.get(parent));
            al.set(parent, k);

            child = parent;
            parent = (parent-1)/2;
        }
    }

    // child = 2n+1
    //       = 2n+2
    // parent = (child-1)/2
}
