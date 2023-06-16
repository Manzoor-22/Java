public class MaxSubArr {
    public static void main(String args[]){
        int Array[] = {-1, -2, -3, 4, -5};
        int sum = Integer.MIN_VALUE, currentsum;

        for(int i = 0; i < Array.length - 1; i++){
            int start = i;
            for(int j = i + 1; j < Array.length; j++){
                int end = j;
                currentsum = 0;
                for(int k = start; k <= end; k++){
                    currentsum += Array[k];
                    //System.out.println(currentsum);
                }
                if(sum < currentsum)
                    sum = currentsum;
            }
        }
        System.out.println(sum);
    }
}
