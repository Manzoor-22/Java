public class PrintXN {
    public static void main(String[] args) {
        System.out.println(check(2,4));
    }
    private static int check(int x, int n){
        if(n == 0)
            return x;
        return(x * check(x,n-1));
    }
}
