import java.util.ArrayList;
import java.util.List;

public class DivisiblePairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int ans = 0;
        for(int i = 0; i < ar.size(); i++){
            for(int j = i+1; j < ar.size(); j++){
                if((ar.get(i)+ar.get(j)) % k == 0)
                    ans++;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(8);
        al.add(10);

        System.out.println(divisibleSumPairs(2, 2, al));
    }
}
