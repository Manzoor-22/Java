import java.util.HashMap;

public class CountGoodNodes{
    public static void countGoodNodes(int[][] edges) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = edges.length-1; i >= 0; i--){
            int curr = edges[i][1];

            hm.put(curr, 0);

            for(int j = i+1; j < edges.length; j++){
                if(edges[j][0] == curr){
                    hm.replace(curr, hm.get(edges[j][1])+1);
                }
            }
        }

        System.out.println(hm);
    }
    public static void main(String args[]){
        int[][] edges = {{0,1},{1,2},{1,3},{1,4},{0,5},{5,6},{6,7},{7,8},{0,9},{9,10},{9,12},{10,11}};

        countGoodNodes(edges);
    }
}