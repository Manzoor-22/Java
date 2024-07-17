import java.util.Arrays;
public class FirstMissing {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        boolean ans[] = new boolean[nums.length+1];
        Arrays.fill(ans, false);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 0 || nums[i] > nums.length-1){
                continue;
            }
            ans[nums[i]] = true;
        }

        for(boolean x : ans)
        System.out.print(x + " ");
    }
}
