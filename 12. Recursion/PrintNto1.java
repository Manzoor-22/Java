public class PrintNto1 {
    public static void main(String args[]){
        function(50);
    }
    static void function(int n){
        if(n == 0)
            return;
        else{
            System.out.print(n + " ");
            function(n-1);
        }
    }
}
