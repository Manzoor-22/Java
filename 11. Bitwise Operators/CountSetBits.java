public class CountSetBits {
    /*  n = 10 = 1010
        Logic check last bit and right shift the n to 1
        setBit = 1 = 0001
     */
    public static void main(String[] args) {
        int n = 57;
        int count = 0, setBit = 1;
        while(n > 0){
            if((setBit & n) == 1)
                count++;
            n = (n >> 1);
        }
        System.out.println(count);
    }
}
