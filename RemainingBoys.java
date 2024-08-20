import java.util.Arrays;

public class RemainingBoys {
    public static void main(String[] args) {
        int boys[][] = {{1,0},{7,8}};
        int girls[][] = {
            {862 ,578},
            {234 ,233},
            {576 ,141},
            {822 ,509},
            {578 ,401},
            {415 ,922},
            {65 ,764},
            {161 ,654},
            {532 ,754},
        };
        int n = 9;

        // boolean[] isPaired = new boolean[n];
        // Arrays.fill(isPaired, false);
        
        // int ans = 0;

        Arrays.sort(girls, (a, b) -> {
            if(a[0]-a[1] > b[0]-b[1]){
                return 1;
            }
            else{
                return 0;
            }
        });
        
        // for(int i = 0; i < n; i++){
        //     int bx = boys[i][0], by = boys[i][1];
        //     for(int j = 0; j < n; j++){
        //         int gx = girls[j][0], gy = girls[j][1];
                
        //         if(bx < gx && by < gy && isPaired[j] == false){
        //             isPaired[j] = true;
        //             ans++;
        //             break;
        //         }
        //     }
        // }

        for(int i = 0; i < n; i++){
            System.out.println(girls[i][0] + " " + girls[i][1]);
        }
        
        // System.out.println(n-ans);
    }
}
