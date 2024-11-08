public class Knapsack_01{
    public static void main(String[] args) {
        int weights[] = {2,5,1,3,4};
        int prices[] = {15,14,10,45,30};

        int max = dp(weights, prices, 7, prices.length-1);

        System.out.println(max);
    }

    public static int dp(int[] weights, int[] prices, int maxWeight, int i){
        if(maxWeight == 0 || i == -1){
            return 0;
        }
        if(weights[i] <= maxWeight){
            int include = prices[i] + dp(weights, prices, maxWeight-weights[i], i-1);
            int exclude = dp(weights, prices, maxWeight, i-1);

            return Math.max(include, exclude);
        }
        else{
            return dp(weights, prices, maxWeight, i-1);
        }
    }
}