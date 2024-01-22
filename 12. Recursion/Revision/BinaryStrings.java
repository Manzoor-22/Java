package Revision;

public class BinaryStrings {
    public static void main(String args[]) {
        recursion(4, 0, "");
    }

    private static void recursion(int n, int lastPos, String s) {
        if(n == 0){
            System.out.println(s);
            return;
        }
        recursion(n-1, 0, s + "0");
        if(lastPos == 0){
            recursion(n-1, 1, s + "1");
        }
    }
}
