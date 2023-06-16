import java.util.Scanner;

public class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int Array[] = {4, 6, 9, 7, 8};

        int SearchElement, flag = -1;
        System.out.print("Enter the element to be searched: ");
        SearchElement = sc.nextInt();

        // By using for loop

        /*for(int i = 0; i < Array.length; i++){
            if(Array[i] == SearchElement){
                flag = i;
                break;
            }
        }*/

        flag = LS(Array, SearchElement, 0);

        if(flag != -1)
            System.out.println("Element found at " + (flag + 1));

        else    
            System.out.println("Element not found!");
    }

    public static int LS(int Array[], int Key, int Iterations){
        if(Array[Iterations] == Key)
            return Iterations;
        else if(Iterations == 4)
            return -1;
        else
            return(LS(Array, Key, Iterations+1));
    }
}

