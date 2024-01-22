package PracticeQuestions;

public class CountOfSubstring{
    public static void main(String args[]){
        String input = "abcab";
        System.out.print(recursion(input, 0, input.length()-1, input.length()));
    }

    private static int recursion(String input, int i, int j, int n){
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;

        int ans = recursion(input, i+1, j, n-1) + recursion(input, i, j-1, n-1) - recursion(input, i+1, j-1, n-2);
        
        if(input.charAt(i) == input.charAt(j))
            ans = ans + 1;

        return ans;
    }
}