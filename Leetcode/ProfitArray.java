class ProfitArray {
    public static int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            int currentprofit = 0;
            for(int j = 1; j < prices.length; j++){
                currentprofit = prices[j] - prices[i];

                if(currentprofit > profit)
                    profit = currentprofit;
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int[] prices = {7,6,4,3,1};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
}
