public class Fact {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }
    private static int solution(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else
            return n * solution(n-1);
    }
}
