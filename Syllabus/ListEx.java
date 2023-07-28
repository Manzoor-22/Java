import java.util.*;

public class ListEx {
    public static void main(String args[]){
        List<Integer> L = new ArrayList<>(10);

        L.add(1);
        L.add(0,2);
        L.remove(1);
        System.out.println(L);
    }
}
