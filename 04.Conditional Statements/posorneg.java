import java.util.*;

public class posorneg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        if(number == 0){
            System.out.println("The number entered is 0!");
        }
        else if(number > 0){
            System.out.println("The number entered is positive!");
        }
        else{
            System.out.println("The number entered is negative!");
        }
    }
}
