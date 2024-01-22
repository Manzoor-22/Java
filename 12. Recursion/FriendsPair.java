public class FriendsPair {
    public static void main(String[] args) {
        System.out.println(Recursion(3));
    }
    private static int Recursion(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int fnm1 = Recursion(n-1);
        int fnm2 = Recursion(n-2);
        return fnm1 + ((n-1) * fnm2);
    }
}
