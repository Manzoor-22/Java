public class GetIthbit {
    /*  5 = 101
        i = 2
        5 >> 2 = 001
        print last bit using & operator
        1 & (5 >> 2) = 1
        
        n = 27 = 11011
     */
    public static void main(String[] args) {
        int n = 27;
        System.out.println(1 & (n >> 3));
    }
}
