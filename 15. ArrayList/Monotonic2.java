import java.util.*;

public class Monotonic2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(3);
        System.out.println(al);

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < al.size()-1; i++){
            if(al.get(i) < al.get(i+1))
                decreasing = false;
            if(al.get(i) > al.get(i+1))
                increasing = false;
        }

        System.out.println(increasing || decreasing);
    }
}
