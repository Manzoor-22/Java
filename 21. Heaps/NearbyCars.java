
import java.util.PriorityQueue;

public class NearbyCars {
    static class Info implements Comparable<Info>{
        int[] points;
        int distance;

        public Info(int[] points, int distance){
            this.points = points;
            this.distance = distance;
        }

        @Override
        public int compareTo(Info i){
            return this.distance - i.distance;
        }
    }
        
    public static void main(String[] args) {
        PriorityQueue<Info> pq = new PriorityQueue<>();
        int k = 1;
        int points[][] = {{3,3},{5,-1},{-2,4}};

        for(int i = 0; i < points.length; i++){
            int x = points[i][0];
            int y = points[i][1];

            int distance = (int) Math.sqrt((x*x) + (y*y));
            pq.add(new Info(new int[]{x,y}, distance));
        }

        while(!pq.isEmpty()){
            Info removed = pq.remove();
            System.out.println(removed.points[0]+ "," + removed.points[1]+ " : " + removed.distance);
        }
    }
}
