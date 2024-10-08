import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, int[]> hm = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] characters = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                characters[strs[i].charAt(j) - 'a']++;
            }
            hm.put(strs[i], characters);
        }
        
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        
        boolean[] isUsed = new boolean[strs.length];

        for(int i = 0; i < strs.length; i++){
            ArrayList<String> curr = new ArrayList<>();
            if(isUsed[i]){
                continue;
            }
            curr.add(strs[i]);
            for(int j = i+1; j < strs.length; j++){
                if(Arrays.equals( hm.get(strs[i]) , hm.get(strs[j]) )){
                    if(isUsed[j] == false && isUsed[i] == false){
                       curr.add(strs[j]);
                       isUsed[j] = true;
                    }
                }
            }
            isUsed[i] = true;
            ans.add(curr);
        }

        System.out.println(ans);
    }
}
