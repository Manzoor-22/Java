public class Stocks2 {
    public static void main(String args[]){
        int Prices[] = {2, 19, 20, 7};
        System.out.println(MaxProfit(Prices));
    }

    public static int MaxProfit(int[] Prices)
    {
        if(Prices.length == 0 || Prices.length == 1 || (Prices.length == 2 && Prices[0] > Prices[1]))
        {
            return 0;
        }
        else{
            int Profit = 0;
            int BuyPrice = Prices[0];

            for(int i = 1; i < Prices.length; i++)
            {
                if(BuyPrice < Prices[i]){
                    int ProfitGenerated = Prices[i] - BuyPrice;
                    Profit = Math.max(Profit, ProfitGenerated);
                }
                else{
                    BuyPrice = Prices[i];
                }
            }

            return Profit;
        }
    }
}
