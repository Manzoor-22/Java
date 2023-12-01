public class Countof7 {
    public static void main(String[] args) {
        int array[][] = {
            {1,7,3,4,7},
            {7,3,5,7,2}
        };
        int count = seven(array);
        System.out.println(count);
    }
    public static int seven(int[][] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == 7)
                    count++;
            }
        }
        return count;
    }
}
