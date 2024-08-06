package CodeForces;
import java.util.Scanner;

public class B_Card_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            int ans = 0;

            if(s1 > c1 && s2 > c2){
                ans++;
            }
            if(s2 > c1 && s1 > c2){
                ans++;
            }
            if(s1 > c2 && s2 > c1){
                ans++;
            }
            if(s2 > c2 && s1 > c1){
                ans++;
            }

            System.out.println(ans);
        }
    }
}