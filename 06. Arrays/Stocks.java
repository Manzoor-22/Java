import java.util.*;

public class Stocks {
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
        else
        {
            int min = Prices[0], minIndex = 0;
            for(int i = 1; i < Prices.length; i++){
                if(min > Prices[i]){
                    min = Prices[i];
                    minIndex = i;
                }
            }
            int max = min;
            for(int i = minIndex; i < Prices.length; i++){
                if(max < Prices[i]){
                    max = Prices[i];
                }
            }

            int Profit = max - min;

            return Profit;
        }
    }
}
