public class Check2PowerNum {
    public static void main(String[] args) {
        int num = 64;
        if((num & (num - 1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not a power of 2");
    }
}
