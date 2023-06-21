class MaxSubArrIII{
    public static void main(String args[]){
        int Array[] = {-2,-3,4,-1,-2,1,5,-3};
        int CS = 0, MS = Integer.MIN_VALUE;

        for(int i = 0; i < Array.length; i++){
            CS = CS + Array[i];

            if(CS < 0)
                CS = 0;

            MS = Math.max(CS,MS);
        }

        System.out.println(MS);
    }
}