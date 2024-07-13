import java.util.ArrayList;
import java.util.List;

public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int d1Sum = 0;
        int d2Sum = 0;
        
        for(int i = 0; i < arr.size(); i++){
            d1Sum += arr.get(i).get(i);
            d2Sum += arr.get(arr.size()-1-i).get(arr.size()-1-i);
        }
        
        return Math.abs(d1Sum-d2Sum);
    }
    public static void main(String[] args) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> rows = new ArrayList<>();
        rows.add(1);
        rows.add(2);
        rows.add(3);
        al.add(rows);
        rows = new ArrayList<>();
        rows.add(5);
        rows.add(6);
        rows.add(7);
        al.add(rows);
        rows = new ArrayList<>();
        rows.add(8);
        rows.add(9);
        rows.add(10);
        al.add(rows);
        
        System.out.println(diagonalDifference(al));
    }
}
