import java.util.Scanner;

public class Checkeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Number = sc.nextInt();

        boolean result = check(Number);

        System.out.println(result);
    }

    public static boolean check(int Number){
        if(Number % 2 == 0)
        return true;
        else
        return false;
    }
}
