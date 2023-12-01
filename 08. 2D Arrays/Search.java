public class Search {
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int key = 7;
        StaircaseSearch(matrix, key);
    }
    public static boolean StaircaseSearch(int array[][], int key){
        int row = 0, col = array[0].length-1;
        while(col >= 0 && row < array.length){
            if(array[row][col] == key){
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            }
            else if(array[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
}
