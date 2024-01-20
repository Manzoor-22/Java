public class Nto1 {
    public static void main(String args[]){
        recursion(10);
    }

    private static void recursion(int n){
        if(n == 0)
            return;

        System.out.println(n);
        
        recursion(n-1);
    }
}
