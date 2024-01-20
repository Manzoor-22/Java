public class FriendsPairing {
    public static void main(String args[]){
        int n = 3;
        System.out.println(recursion(n));
    }

    private static int recursion(int n){
        if(n == 1 || n == 2)
            return n;
        
        int single = recursion(n-1);
        int pair = (n-1) * recursion(n-2);

        return single + pair;
    }
}
