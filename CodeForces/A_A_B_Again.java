package CodeForces;
import java.util.Scanner;

public class A_A_B_Again{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int num = sc.nextInt();

            int ans = 0;
            while(num > 0){
                int digit = num % 10;
                ans += digit;
                num /= 10;
            }

            System.out.println(ans);
        }
    }
}