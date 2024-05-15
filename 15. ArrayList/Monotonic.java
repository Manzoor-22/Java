import java.util.*;

public class Monotonic {
    public static boolean solution(ArrayList<Integer> al){
        if(al.get(0) < al.get(al.size()-1))
            return increasing(al);
        else
            return decreasing(al);
    }
    public static boolean increasing(ArrayList<Integer> al){
        for(int i=0; i < al.size()-1; i++){
            if(al.get(i)>al.get(i+1))
                return false;
        }
        return true;
    }
    public static boolean decreasing(ArrayList<Integer> al){
        for(int i=0; i < al.size()-1; i++){
            if(al.get(i)<al.get(i+1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(13);
        al.add(12);
        al.add(10);

        System.out.println(al);
        System.out.println(solution(al));
    }
}
