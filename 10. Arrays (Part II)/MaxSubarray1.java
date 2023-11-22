class MaxSubarray1{
    public static void main(String[] args){
        int[] array = {1,-2,6,-1,3};
        int MaxSum = 0;
        for(int i = 0; i < array.length; i++){
            int start = i;
            for(int j = i; j < array.length; j++){
                int end = j;
                int CurrentSum = 0;
                for(int k = start; k <= end; k++){
                    CurrentSum += array[k];
                }
                if(MaxSum < CurrentSum)
                    MaxSum = CurrentSum;
            }
        }
        System.out.println(MaxSum);
    }
}