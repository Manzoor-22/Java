import java.util.*;

public class MultidimensionalAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> base = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        base.add(list1);
        base.add(list2);
        base.add(list3);

        System.err.println(base);

        for(int i = 0; i < base.size(); i++){
            ArrayList<Integer> current = base.get(i);
            for(int j = 0; j < current.size(); j++){
                System.out.print(current.get(j) + " ");
            }
            System.out.println();
        }
    }
}
