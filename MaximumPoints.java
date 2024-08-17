public class MaximumPoints {
    public static void main(String[] args) {
        int points[][] = {
            {0,1,0},
            {2,3,2}
        };

        int prevIdx = 0;
        int ans = 0;

        int n = points.length;

        for(int i = 0; i < n; i++){
            int m = points[i].length;
            int currMax = Integer.MIN_VALUE, maxIdx = 0;
            for(int j = 0; j < m; j++){
                if(i == 0 && Math.abs(points[i][j]-prevIdx) > currMax){ 
                    currMax = points[i][j]-prevIdx;
                    maxIdx = j;
                }
                else if(Math.abs(points[i][j]-Math.abs(j-prevIdx)) > currMax){
                    currMax = points[i][j]-Math.abs(j-prevIdx);
                    maxIdx = j;
                }
            }
            ans += currMax;
            prevIdx = maxIdx;
        }

        System.out.println(ans);
    }
}
