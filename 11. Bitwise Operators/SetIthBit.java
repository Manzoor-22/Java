public class SetIthBit {
    /*  n = 5 = 101
        i = 1
        ans = 111 = 6

        1 << i = 010
        using or operator
        010 | 101 = 111
        
        eg: n = 18 = 10010
            if i = 3
            expected ans = 11010 = 26
     */
    public static void main(String[] args) {
        int n = 18;
        int i = 3;
        System.out.println(n|(1<<i));
    }
}
