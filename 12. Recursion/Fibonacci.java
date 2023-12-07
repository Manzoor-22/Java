public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
    private static int solution(int n){
        if(n == 0 || n == 1)
            return n;
        return solution(n-1)+solution(n-2);
    }
}
