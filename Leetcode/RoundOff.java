import java.util.*;
import java.util.Arrays;

public class RoundOff{
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> al = new ArrayList<>();
        
        for(Integer g : grades){
            if(g % 5 >= 3 && g >= 38){
                int ans = g + (g%5) -1;
                al.add(ans);
                continue;
            }
            al.add(g);
        }
        
        return al;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Integer[] values = {
            50, 59, 36, 97, 28, 61, 54, 27, 14, 29, 81, 16, 7, 1, 99, 42, 77, 39, 20, 29,
            0, 1, 82, 20, 71, 71, 73, 79, 77, 61, 7, 93, 36, 65, 11, 92, 87, 85, 62, 45,
            33, 9, 6, 37, 31, 67, 32, 67, 73, 59, 95
        };
        al.addAll(Arrays.asList(values));
        System.out.println(gradingStudents(al));
    }
}