public class BinaryStrings {
    public static void main(String args[]) {
        recursion(3, 0);
    }

    private static void recursion(int n, int lastPos) {
        if(n == 0){
            System.out.println("");
            return;
        }
        if(lastPos == 0) {
            System.out.print("0");
            recursion(n-1, 0);
            System.out.print("1");
            recursion(n-1, 1);
        } else {
            System.out.print("0");
            recursion(n-1, 1);
        }
    }
}
