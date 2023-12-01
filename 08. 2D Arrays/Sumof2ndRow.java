public class Sumof2ndRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,5},
            {1,2,6,8}
        };
        int sum = count(matrix);
        System.out.println(sum);
    }
    public static int count(int[][] matrix){
        if(matrix.length < 2)
            return 0;
        int sum = 0;
        for(int i = 0; i < matrix[0].length; i++){
            sum += matrix[1][i];
        }
        return sum;
    }
}
