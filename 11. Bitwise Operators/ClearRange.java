public class ClearRange {
    /* int n = 98 = 1 100 010
        i = 3, j = 6
        expected output = 1 000 010
        a = (-1 << j) = 1000000 
        b = (-1 << i) = 1111000 = ~b = 0000111
        bitMask = a | b = 1000111
        n & bitMask = 1100010 & 1000111 = 1000010 = 66
     */
    public static void main(String[] args) {
        int i = 3, j = 6, n = 98;
        int a = (-1 << j);
        int b = ~(-1 << i);
        int bitMask = (a | b);
        System.out.println(n & bitMask);
    }
}
