package CodeForces;
import java.util.Scanner;

public class C_Showering{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();

        while(t-- > 0){
            solution();
        }
    }

    public static void solution(){
        int n = sc.nextInt(); // the number of time intervals Alex already has planned
        int s = sc.nextInt(); // time Alex takes to take a shower
        int m = sc.nextInt(); // amount of minutes a day has;

        boolean[] isFree = new boolean[m+1];
        java.util.Arrays.fill(isFree, true);
        
        for(int i = 1; i <= n; i++){
            int l = sc.nextInt();
            int h = sc.nextInt();

            for(int j = l; j <= h; j++){
                isFree[j] = false;
            }
        }

        int maxLen = 0, freeLen = 0;
        for(int i = 0; i < isFree.length; i++){
            if(isFree[i] == true){
                freeLen++;
                maxLen = Math.max(freeLen, maxLen);
            } else{
                freeLen = 0;
            }
        }

        if(maxLen >= s){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}