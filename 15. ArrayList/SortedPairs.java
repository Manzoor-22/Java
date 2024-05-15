import java.util.ArrayList;

public class SortedPairs {
    public static void solution(ArrayList<Integer> al, int target){
        int sp = 0, ep = al.size()-1;
        
        while(sp < ep){
            int sum = al.get(sp) + al.get(ep);
            if(sum == target){
                System.out.println(sp + " " + ep);
                return;
            }
            else if(sum < target)
                sp++;
            else
                ep--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        int target = 6;
        System.out.println(al);
        solution(al, target);
    }
}
