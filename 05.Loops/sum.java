import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        int evencount= 0, oddcount = 0;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < 5; i++){
            a[i] = sc.nextInt();

            if(a[i] % 2 == 0)
                evencount = evencount + a[i];
            else
                oddcount = oddcount + a[i];                
        }
        
        System.out.println("Even Count = " + evencount);
        System.out.println("Odd Count = " + oddcount);
    }
}
