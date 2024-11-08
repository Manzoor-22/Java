public class Knapsack_01_Tabulation {
    public static void main(String[] args) {
        int weights[] = {2,5,1,3,4};
        int prices[] = {15,14,10,45,30};
        int W = 7;

        int[][] dp = new int[weights.length+1][W+1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < dp[0].length; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                int v = prices[i-1];
                int w = weights[i-1];

                if(w <= j){
                    int accept = v + dp[i-1][j-w];
                    int decline = dp[i-1][j];

                    dp[i][j] = Math.max(accept, decline);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        System.out.println(dp[weights.length][W]);
    }
}
