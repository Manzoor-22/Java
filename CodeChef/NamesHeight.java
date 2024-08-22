package CodeChef;
import java.util.Map;
import java.util.TreeMap;

public class NamesHeight {
    public static void main(String[] args) {
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {180,165,170};

        TreeMap<Integer, String> ht = new TreeMap<>();

        for(int i = 0; i < names.length; i++){
            ht.put(heights[i], names[i]);
        }

        String[] ans = new String[names.length];
        int i = names.length-1;
        for(Map.Entry<Integer, String> itr : ht.entrySet()){
            ans[i] = itr.getValue();
            i--;
        }
        
        for(String s : ans){
            System.out.println(s);
        }
    }
}
