import java.util.*;

public class XFromYMarks {
    
    public static int minStringFactor(String X, String Y, int S, int R) {
        int n = X.length();
        int m = Y.length();
        
        // DP array to store minimum cost to form X[0:i]
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;  // Base case: zero cost to form empty string

        // Precompute reversed Y for easy substring matching
        String reversedY = new StringBuilder(Y).reverse().toString();

        // Fill the DP array
        for (int i = 1; i <= n; i++) {
            // Check all possible substrings of X ending at i
            for (int j = 0; j < i; j++) {
                String subX = X.substring(j, i);
                
                // Check if subX is a substring in Y
                if (Y.contains(subX)) {
                    dp[i] = Math.min(dp[i], dp[j] + S);
                }
                
                // Check if subX is a substring in reversedY
                if (reversedY.contains(subX)) {
                    dp[i] = Math.min(dp[i], dp[j] + R);
                }
            }
        }

        // Result is dp[n] if it's been updated; otherwise, it's impossible
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input strings X and Y
        String X = scanner.nextLine().trim();
        String Y = scanner.nextLine().trim();
        
        // Input integers S and R
        int S = scanner.nextInt();
        int R = scanner.nextInt();
        
        // Calculate minimum String Factor
        int result = minStringFactor(X, Y, S, R);
        
        // Output the result
        if (result == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }
        
        scanner.close();
    }
}
