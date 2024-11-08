public class Knapsack_01_Memoization {
    public static void main(String args[]){
        int weights[] = {2,5,1,3,4};
        int prices[] = {15,14,10,45,30};
        int maxW = 7;

        int mem[][] = new int[weights.length+1][maxW+1];
        for(int i = 0; i < mem.length; i++){
            for(int k = 0; k < mem[0].length; k++){
                mem[i][k] = -1;
            }
        }
        
        int ans = DP(weights, prices, maxW, weights.length-1, mem);
        System.out.println(ans);
    }

    public static int DP(int[] weights, int[] prices, int maxWeight, int i, int[][] mem){
        if(maxWeight == 0 || i == -1){
            return 0;
        }

        if(mem[i][maxWeight] != -1){
            return mem[i][maxWeight];
        }

        if(weights[i] <= maxWeight){
            int include = prices[i] + DP(weights, prices, maxWeight-weights[i], i-1, mem);
            int exclude = DP(weights, prices, maxWeight, i-1, mem);
            
            mem[i][maxWeight] = Math.max(include, exclude);
            
            return Math.max(include, exclude);
        }
        
        else{
            return DP(weights, prices, maxWeight, i-1, mem);
        }
    }
}
