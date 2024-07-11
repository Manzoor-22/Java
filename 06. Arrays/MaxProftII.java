public class MaxProftII {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 4, 1, 9, 0, 3};
        // maxProfit =    7       8          = 15
        
        int maxProfit = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1])
                maxProfit += arr[i]-arr[i-1];
        }
        Integer.parseInt
        System.out.println(maxProfit);
    }
}
