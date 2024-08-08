import java.util.HashSet;
import java.util.Set;

public class SetMatZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        setZeroes(matrix);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        Set<Integer> rs = new HashSet<>();
        Set<Integer> cs = new HashSet<>();
        int m = matrix.length, n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    rs.add(i);
                    cs.add(j);
                }
            }
        }

        System.out.println(rs);
        System.out.println(cs);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(rs.contains(i) || cs.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
