import java.util.Arrays;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,4};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1])
                i++;
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
