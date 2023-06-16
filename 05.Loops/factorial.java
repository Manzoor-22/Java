import java.util.*;

public class factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Number, Factorial = 1;

        System.out.print("Enter a number: ");
        Number = sc.nextInt();

        for(int i = 1; i <= Number; i++)
        {
            Factorial = Factorial * i;
        }

        Factorial = fact(Number, 1);

        System.out.println("Factorial = " + Factorial);
    }

    public static int fact(int Number, int Answer){
        if(Number == 0 || Number == 1){
            return Answer;
        }
        else
        {
            Answer = Answer * Number;
            Number--;
            return fact(Number, Answer);
        }
    }
}
