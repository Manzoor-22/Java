public class NthFibonacci {
    public static void main(String args[]) {
        System.out.println(recursion(5));
    }

    private static int recursion(int n) {
        if(n == 0 || n == 1)
            return 1;
        return recursion(n-1)+recursion(n-2);
    }
}
