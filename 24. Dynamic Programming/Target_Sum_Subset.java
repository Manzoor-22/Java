public class Target_Sum_Subset {
    public static void main(String[] args) {
        int[] numbers = {4,2,7,1,3};
        int target = 10;

        boolean[][] dp = new boolean[numbers.length+1][target+1];

        for(int i = 0; i < dp.length; i++){
            dp[i][0] = true;
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(numbers[i-1] <= target){
                    int v = numbers[i-1];

                    if(v <= j && dp[i-1][j-v] == true){
                        dp[i][j] = true;
                    }
                    else if(dp[i-1][j] == true){
                        dp[i][j] = true;
                    }
                }
            }
        }

        System.out.println(dp[numbers.length][target]);
    }
}
