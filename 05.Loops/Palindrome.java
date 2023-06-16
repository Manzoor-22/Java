import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = sc.nextInt();
        int rev = pal(Number, 0);
        if(rev == Number)
        System.out.println(rev + " is a palindrome!");
        else
        System.out.println(rev + " is not a palindrome!");
    }

    public static int pal(int Number, int Reverse){
        if(Number == 0)
            return Reverse;
        else{
            Reverse = (Reverse * 10) + (Number % 10);
            Number = Number / 10;
            return pal(Number, Reverse);
        }
    }
}
