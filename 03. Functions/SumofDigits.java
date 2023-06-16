import java.util.Scanner;

public class SumofDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = sc.nextInt();

        int sum = 0, digits, n = Number;

        while(n != 0){
            digits = n % 10;
            n /= 10;
            sum = sum + digits;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Sum = " + Sum(Number, 0));
    }

    public static int Sum(int Number, int Data){
        if(Number == 0)
            return Data;
        else{
            int digit = Number % 10;
            Data += digit;
            Number /= 10;
            return (Sum(Number, Data));
        }
    }
}