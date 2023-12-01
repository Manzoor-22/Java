public class UpdateIthBit {
    /*  n = 12 = 1100
        i = 2, setBit = 0
        Using & operator
        1 << i = 0100
        ~(1 << i) = 1011
        1100 & 1011 = 1 0 0 0 
        if setBit = 1
        1100 | (1 << i) = 1100 | 0100 = 1 1 0 0
    */
    public static void main(String[] args) {
        int n = 12;
        int setBit = 1, i = 2;
        if(setBit == 0){
            int k = ~(1 << i);
            System.out.println(n & k);
        } else{
            int k = (1 << i);
            System.out.println(n | k);
        }
    }
}
