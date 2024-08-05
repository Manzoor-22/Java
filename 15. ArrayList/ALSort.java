
import java.util.ArrayList;
import java.util.Collections;

public class ALSort {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(4);
        al.add(5);
        al.add(8);
        al.add(2);
        
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        al.add(3);
        Collections.sort(al);
        System.out.println(al);
    }
}
