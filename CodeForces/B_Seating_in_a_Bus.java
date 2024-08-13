package CodeForces;
import java.util.HashSet;
import java.util.Scanner;

public class B_Seating_in_a_Bus{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int t;
        t=sc.nextInt();

        while(t-- > 0){
            solution();
        }
    }

    public static void solution(){
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0; i < n; i++){
            input[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        hs.add(input[0]);

        for(int i = 1; i < n; i++){
            int num = input[i];
            if(hs.contains(num+1) || hs.contains(num-1)){
                hs.add(num);
                continue;
            }
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }
}