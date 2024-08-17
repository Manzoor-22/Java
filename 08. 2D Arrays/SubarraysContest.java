
public class SubarraysContest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,5};
        int k = 3;

        int n = nums.length;
        int[] ans = new int[n-k+1];
        int sum = 0;

        // 1st subarray
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        if(sum == getSum(nums[0], nums[k-1])){
            ans[0] = nums[k-1];
        } else{
            ans[0] = -1;
        }

        for(int i = 1; i < n-k; i++){
            sum -= nums[i-1];
            sum += nums[i+k-1];
            if(sum == getSum(nums[i], nums[i+k-1])){
                ans[i] = nums[k-1];
            } else{
                ans[i] = -1;
            }
        }

    }

    public static  int getSum(int start, int end){
        int fullSum = (end*(end+1))/2;
        int remove = (start*(start-1))/2;
        
        return fullSum - remove;
    }
}
