public class MaxSubArrII {
    public static void main(String args[]){
        int Array[] = {1,3,4,5,8};
        int[] PrefixArray = new int[5];
        int sum = 0, cs = Array[0];

        for(int i = 0; i < Array.length; i++){
            sum = sum + Array[i];
            PrefixArray[i] = sum;
        }

        for(int i = 0; i < Array.length; i++){
            int start = i;
            for(int j = i + 1; j < Array.length; j++){
                int end = j;

                if(start != 0)
                sum = PrefixArray[end] - PrefixArray[start - 1];
                else
                sum = PrefixArray[0];

                if(sum > cs)
                    cs = sum;
            }
        }

        System.out.println(cs);
    }
}
