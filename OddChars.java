import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class OddChars {
    public static void main(String[] args) {
        LinkedList<String> ans;
        ans = substrings("aabb");
        System.out.println(ans);
        System.out.println(ans.size());
    }

    public static LinkedList<String> substrings(String s){
        LinkedList<String> set = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String curr = s.substring(i,j);
                if(check(curr)){
                    set.add(curr);
                }
            }
        }

        return set;
    }


    public static boolean check(String curr){
        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c : curr.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            } else{
                hm.put(c, 1);
            }
        }
        boolean oneOdd = false;

        for(Map.Entry<Character, Integer> itr : hm.entrySet()){
            if(itr.getValue() % 2 != 0 && oneOdd == true){
                return false;
            }
            if(itr.getValue() % 2 != 0){
                oneOdd = true;
            }
        }

        return true;
    }
}
