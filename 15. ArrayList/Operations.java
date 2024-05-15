import java.util.ArrayList;
public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Object al2;
        Object arr[];
        //add() operation
        al.add(1);
        al.add(2);
        al.add(3);
        
        //add() operation with index
        al.add(0, 0);

        //remove() operation
        al.remove(2);

        //size() operation
        System.out.println("al.size(): "+al.size());

        //indexOf() operation
        System.out.println("al.indexOf(3): "+al.indexOf(3));

        //clear() operation
        //al.clear();

        //clone() operation
        al2 = al.clone();
        //System.out.println(al2);

        //converting to array object
        // arr = al.toArray();
        // for (Object o : arr) {
        //     System.out.println(o);
        // }
        // System.out.println(arr);

        //get() method
        System.out.println("al.get(2): "+al.get(2));

        //set() method
        al.set(2, 2);

        System.out.println(al);
    }
}
