public class MissingNumber {
    public static void main(String args[]){
        int[] nums = {1,0,3,5,2};

        int Answer = Solution(nums);

        System.out.println(Answer);
    }

    public static int Solution(int[] nums){
        int size = nums.length;
        int Expected_Sum = (size*(size + 1)) / 2;
        int Actual_Sum = 0;

        for(int i = 0; i < nums.length; i++){
            Actual_Sum += nums[i];
        }

        return Expected_Sum - Actual_Sum;
    }
}
