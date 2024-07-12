import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {0,0,0};

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            int a = i+1, b = nums.length-1;
            while(a < b){
                if(nums[i] + nums[a] + nums[b] == 0){
                    System.out.println(nums[i] + " " + nums[a] + " " + nums[b]);
                    break;
                } else if(nums[i] + nums[a] + nums[b] >= 0){
                    b--;
                } else{
                    a++;
                }
            }
        }
    }
}
