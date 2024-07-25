import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        int[] nums = {1,8,5,3,2,6,-5,-8,1,1,5};
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for(int i = 0; i < nums.length; i++){
            if(tm.containsKey(nums[i])){
                tm.put(nums[i], tm.get(nums[i])+1);
            } else{
                tm.put(nums[i], 1);
            }
        }

        System.out.println(tm);
    }
}
