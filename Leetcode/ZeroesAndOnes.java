public class ZeroesAndOnes {
    public static void main(String[] args) {
        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
        int m = grid.length;
        int n = grid[0].length;
        int[][] diff = new int[m][n];
        int[] onesRow = new int[m];
        int[] zeroesRow = new int[m];
        int[] onesCol = new int[n];
        int[] zeroesCol = new int[n];
        for(int i = 0; i < m; i++){
            int ones = 0, zeroes = 0;
            int cones = 0, czeroes = 0;
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0)
                    zeroes++;
                if(grid[i][j] == 1)
                    ones++;
                if(grid[j][i] == 0)
                    czeroes++;
                if(grid[j][i] == 1)
                    cones++;
            }
            onesRow[i] = ones;
            zeroesRow[i] = zeroes;
            onesCol[i] = cones;
            zeroesCol[i] = czeroes;
        }
        for(int i = 0; i < onesRow.length; i++)
            System.out.print(onesRow[i]);
        System.out.println();
        for(int i = 0; i < zeroesRow.length; i++)
            System.out.print(zeroesRow[i]);
        System.out.println();
        for(int i = 0; i < zeroesCol.length; i++)
            System.out.print(zeroesCol[i]);
        System.out.println();
        for(int i = 0; i < onesCol.length; i++)
            System.out.print(onesCol[i]);
        System.out.println();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(onesRow[i] + onesCol[j] - zeroesRow[i] - zeroesCol[j] + " ");
            }
            System.out.println();
        }
    }
}
