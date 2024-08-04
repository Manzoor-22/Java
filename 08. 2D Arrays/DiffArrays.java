import java.util.*;

public class DiffArrays{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int a : nums1){
            hm.put(a, 1);
        }

        for(int b : nums2){
            if(hm.containsKey(b)){
                hm.replace(b, -1);
            }
            else{
                hm.put(b, 2);
            }
        }

        System.out.println(hm);
    }
}