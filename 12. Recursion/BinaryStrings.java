public class BinaryStrings {
    public static void main(String[] args) {
        Recursion(new String(""), 0, 5);
    }
    private static void Recursion(String str, int lastPl, int n){
        if(n == 0){
            System.out.println(str);
            return;
        }
        Recursion(str + "0", 0, n-1);
        if(lastPl == 0){
            Recursion(str + "1", 1, n-1);
        }
    }
}
