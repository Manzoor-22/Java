public class ClearIthBit {
    /* Clear the bit at Ith position
        a = 24 = 11000
        i = 2
        expected ans = 10000 = 18

        logic:
        1 << i = 00001 << 2 = 00100
        ~(1<<i) = 11011
        11011 & 11000 = 10000
     */
    public static void main(String[] args) {
        int n = 24;
        int bitMask = ~(1<<3);
        System.out.println(n & bitMask);
    }
}
