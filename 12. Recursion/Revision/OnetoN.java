public class OnetoN {
    public static void main(String args[]){
        recursion(10);
    }

    private static void recursion(int n){
        //Base case
        if(n == 0)
            return;
        
        recursion(n-1);
        
        System.out.println(n);
    }
}
