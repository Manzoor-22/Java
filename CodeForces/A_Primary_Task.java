package CodeForces;
import java.util.Scanner;

public class A_Primary_Task{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int t;
        t=sc.nextInt();

        while(t-- > 0){
            solution();
        }
    }

    public static void solution(){
        String num = sc.next();

        if(num.length() <= 2){
            System.out.println("NO");
            return;
        }
        
        if(num.charAt(0) != '1' || num.charAt(1) != '0' || num.charAt(2) == '0'){
            System.out.println("NO");
            return;
        }

        StringBuilder pow = new StringBuilder();
        for(int i = 2; i < num.length(); i++){
            pow.append(num.charAt(i));
        }

        int power = Integer.parseInt(pow.toString());

        if(power >= 2){
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
}