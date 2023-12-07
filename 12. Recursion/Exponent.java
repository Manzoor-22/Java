public class Exponent {
    public static void main(String[] args) {
        System.out.println(solution(2,0));
    }
    private static int solution(int a, int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return a;
        return a * solution(a, n-1);
    }
}
