public class XPowerN {
    public static void main(String args[]) {
        System.out.println(recursion(5,3));
    }
    private static int recursion(int x, int n){
        if(n == 0) {
            return 1;
        } else {
            return x * recursion(x, n - 1);
        }
    }
}
