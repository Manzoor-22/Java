public class Exponential {
    /*  pow(5,3)
        5 pow 011
        ans = 1
        1st iteration -> lsb = 1 -> ans = ans * 5 = 5
        2nd iteration -> lsb = 1 -> ans = ans * 5 = 5 * 5 = 25
    */
    public static void main(String[] args) {
        int a = 5, n = 3;
        int ans = 1;

        while(n > 0){
            if((n & 1) == 1){
                ans = ans * a;
            }
            a = a * a;
            n = (n >> 1);
        }

        System.out.println(ans);
    }
}
