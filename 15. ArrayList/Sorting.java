import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(5);
        al.add(9);
        al.add(0);
        System.out.println(al);

        //Sorting in ascending order
        Collections.sort(al);
        System.out.println(al);
        
        //Sorting in descending order
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
    }
}
