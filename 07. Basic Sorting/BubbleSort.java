import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers of array: ");
        for(int i = 0; i < array.length; i++)
        array[i] = sc.nextInt();

        for(int j = 0; j < array.length - 1; j++){
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    int k = array[i];
                    array[i] = array[i+1];
                    array[i+1] = k;
                }
            }
        }
        for(int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");        
    }
}
