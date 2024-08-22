package CodeChef;
import java.util.HashMap;

public class WinningPlayers {
    public static void main(String[] args) {
        int[][] pick = {{0,0},{1,0},{1,0},{2,1},{2,1},{2,0}};

        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        int[] count = new int[5];

        for(int i = 0; i < pick.length; i++){
            if(hm.containsKey(pick[i][0]) && hm.get(pick[i][0]) == pick[i][1]){
                hm.put(pick[i][0], hm.get(pick[i][0])+1);
                count[pick[i][0]]++;
            }else{
                hm.put(pick[i][0], pick[i][1]);
            }
        }
        for(int a : count){
            System.out.print(a + " ");
        }
        System.out.println(hm);
    }
}
