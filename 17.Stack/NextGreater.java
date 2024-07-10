import java.util.Stack;

class NextGreater{
    public static void main(String args[]){
        int[] nums2 = {1,2,3,4};
        nextGreaterElement(nums2);
    }
    public static void nextGreaterElement(int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[nums2.length];
        for(int i = nums2.length-1; i >= 0; i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = s.peek();
            }
            s.push(nums2[i]);
        }
        for(int k : ans)
        System.out.println(k);
    }
}