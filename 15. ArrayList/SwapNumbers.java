import java.util.ArrayList;
public class SwapNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        //Swapping 2nd element with 3rd element
        int k = al.get(2);
        al.set(2, al.get(3));
        al.set(3, k);

        System.out.println(al);
    }
}
