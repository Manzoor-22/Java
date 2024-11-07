package Extra;
import java.util.ArrayList;
import java.util.HashMap;

public class practice {
    static int[][] mat;
    static HashMap<Integer, ArrayList> hm = new HashMap<>();
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        mat = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                al.add(j);
                hm.put(grid[i][j], al);
                mat[i][j] = grid[i][j];
            }
        }

        System.out.println(hm);
        adjacentSum(6);
    }

    public static void adjacentSum(int value) {
        ArrayList<Integer> location = hm.get(value);
        int row = location.get(0);
        int col = location.get(1);
        int ans = 0;

        if(row-1 >= 0){
            ans += mat[row-1][col];
        }
        if(row+1 < mat.length){
            ans += mat[row+1][col];
        }
        if(col-1 >= 0){
            ans += mat[row][col-1];
        }
        if(col+1 < mat[0].length){
            ans += mat[row][col+1];
        }

        System.out.println(ans);
    }
}