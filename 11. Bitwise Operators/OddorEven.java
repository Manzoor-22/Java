public class OddorEven {
    /*  bitMask = 0001
        n = 9 =   1001
        1 & 9 =   0001 = 1
        
        bitMask = 00001
        n = 16  = 10000
        16 & 1  = 00000 = 0

        if(ans == 0) even;
        else odd;
    */
    public static void main(String[] args) {
        System.out.println("Is number even?: " + check(14));
    }
    public static boolean check(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            return true;
        }
        return false;
    }
}
