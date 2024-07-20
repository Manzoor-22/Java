import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKFreq {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,0};

        TreeMap<Integer, Integer> hm = new TreeMap<>();
        List<Integer> ans = new LinkedList<>();

        for(int i : arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            } else{
            hm.put(i, 1);
            }
        }
        int t = 2;
        int a = 0;
        while(t-- > 0){
            int highest = Integer.MIN_VALUE;
            int key = 0;
            for(Map.Entry<Integer, Integer> itr: hm.entrySet()){
                if(highest < itr.getValue()){
                    highest = itr.getValue();
                    key = itr.getKey();
                }
            }
            hm.remove(key);
            System.out.println("Highest: " + highest);
            System.out.println("Key: " + key);
        }
        System.out.println(hm);
    }
}
