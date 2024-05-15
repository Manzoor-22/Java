import java.util.*;

public class SortedPairsII {
    public static void solution(ArrayList<Integer> al, int target){
        int breakPoint = 0;
        for(int i=0; i < al.size()-1; i++){
            if(al.get(i) < al.get(i+1)){
                breakPoint = i;
                break;
            }
        }
        int lp = breakPoint+1;
        int rp = breakPoint;

        while(lp != rp){
            int sum = al.get(lp) + al.get(rp);
            if(sum == target){
                System.out.println(lp + " " + rp);
                break;
            }
            else if(sum < target){
                lp = (lp + 1) % (al.size()-1);
            }
            else{
                rp = (rp + 1) % (al.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);
        System.out.println(al);
        int target = 16;

        solution(al, target);
    }
}
