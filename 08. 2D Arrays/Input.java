import java.util.*;

public class Input 
    {
    public static void main(String args[]){
        int[][] Matrix = new int[3][3];
        int rows = Matrix.length, columns = Matrix[0].length;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        
        Iterate(Matrix, rows, columns);
        Search(Matrix, rows, columns, 7);
    }

    public static void Iterate(int Matrix[][], int rows, int columns)
    {
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Search(int Matrix[][], int rows, int columns, int Element)
    {
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(Matrix[i][j] == Element){
                    System.out.println("Element found at = (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element not found!");
    }
}
