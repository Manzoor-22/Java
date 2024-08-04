import java.util.ArrayList;
import java.util.List;

public class NeighbourSum {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        List<List<Integer>> al = new ArrayList<>();

        for(int i = 0; i < grid.length; i++){
            List<Integer> curr = new ArrayList<>();
            for(int j = 0; j < grid[0].length; j++){
                curr.add(grid[i][j]);
            }
            al.add(curr);
            curr = new ArrayList<>();
        }

        System.out.println(al);

        
    }
}
