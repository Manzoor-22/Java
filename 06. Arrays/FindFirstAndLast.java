public class FindFirstAndLast {
    public static int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        int[] ans = {-1, -1};
        while(i <= j){
            int mid = (j+i)/2;
            if(nums[mid] == target){
                while(nums[i] != target)
                    i++;
                while(nums[j] != target)
                    j--;
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            else if(nums[mid] > target){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};

        System.out.println(searchRange(arr, 8));
    }
}
