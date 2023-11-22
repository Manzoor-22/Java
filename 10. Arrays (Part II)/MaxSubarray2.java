public class MaxSubarray2 {
    public static void main(String[] args) {
        int[] array = {1,-2,6,-1,3};
        int n = array.length;
        int[] prefix = new int[n];
        prefix[0] = array[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + array[i];
        }
        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int CurrentSum;
                if(i == 0){
                    CurrentSum = prefix[j];
                }  else{
                    CurrentSum = prefix[j] - prefix[i-1];
                }
                if(CurrentSum > MaxSum)
                    MaxSum = CurrentSum;
            }
        }
        System.out.println(MaxSum);
    }
}
