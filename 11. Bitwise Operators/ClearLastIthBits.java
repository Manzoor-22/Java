public class ClearLastIthBits {
    /*  int n = 11 = 1011
        int i = 2
        Expected ans = 1000 last 2 digits are cleared
        Using & operator, since 1 & 0 = 0, 0 & 0 = 0
        int bitMask = -1 << 2 = 100
        1011 & 1100 = 1 0 0 0
     */
    public static void main(String[] args) {
        int n = 11;
        int i = 2, bitMask = (-1 << i);
        System.out.println((n & bitMask));
    }
}
