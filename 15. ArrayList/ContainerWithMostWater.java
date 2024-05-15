import java.util.*;

public class ContainerWithMostWater {
    public static int solution(ArrayList<Integer> al){
        int i = 0, j = al.size()-1;
        int maxArea = 0, currentArea = 0;
        while(i < j){
            int base = j-i;
            int height = Math.min(al.get(i), al.get(j));
            currentArea = base * height;
            maxArea = Math.max(maxArea, currentArea);

            if(al.get(i) <= al.get(j))
                i++;
            else
                j--;
        }

        return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(8);
        al.add(6);
        al.add(2);
        al.add(5);
        al.add(4);
        al.add(8);
        al.add(3);
        al.add(7);
        System.out.println(al);
        System.out.println(solution(al));
    }
}
