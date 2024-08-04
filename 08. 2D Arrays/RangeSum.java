public class RangeSum {
    public static void rangeSum(int[] nums, int n) {
        int[] subArr = new int[sum(n)];
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            int prevSum = 0;
            for(int j = i; j < nums.length; j++){
                subArr[k] = prevSum + nums[j];
                prevSum += nums[j];
                k++;
            }
        }

        for(int i = 0; i < subArr.length; i++){
            System.out.print(subArr[i]+" ");
        }
    }

    public static void main(String args[]){
        int[] nums = {1,2,3,4};
        int n = 4;

        rangeSum(nums, n);
    }
}
