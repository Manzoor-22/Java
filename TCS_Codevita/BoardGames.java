import java.util.*;

public class BoardGames {
    static class Cell {
        int x, y, moves;
        
        Cell(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }
    
    public static int minMovesToDestination(int[][] grid, int[] source, int[] destination, int[] moveRule) {
        int M = grid.length;
        int N = grid[0].length;
        int dx = moveRule[0];
        int dy = moveRule[1];
        
        // Define movement directions based on moveRule (Forward, Right, Left, Backward)
        int[][] directions = {
            {dx, dy},       // Forward
            {dy, -dx},      // Right (90 degrees clockwise)
            {-dy, dx},      // Left (90 degrees counterclockwise)
            {-dx, -dy}      // Backward (180 degrees)
        };
        
        // BFS initialization
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[M][N];
        queue.offer(new Cell(source[0], source[1], 0));
        visited[source[0]][source[1]] = true;
        
        // BFS Loop
        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            int x = cell.x;
            int y = cell.y;
            int moves = cell.moves;
            
            // Check if we've reached the destination
            if (x == destination[0] && y == destination[1]) {
                return moves;
            }
            
            // Try all four possible directions
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                
                // Check if the next cell is within bounds, walkable, and not visited
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && grid[nx][ny] == 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new Cell(nx, ny, moves + 1));
                }
            }
        }
        
        // If destination is unreachable
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] grid = new int[M][N];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        int[] source = {scanner.nextInt(), scanner.nextInt()};
        int[] destination = {scanner.nextInt(), scanner.nextInt()};
        int[] moveRule = {scanner.nextInt(), scanner.nextInt()};
        
        int result = minMovesToDestination(grid, source, destination, moveRule);
        System.out.println(result);
        
        scanner.close();
    }
}

