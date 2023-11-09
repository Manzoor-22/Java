public class InvertedRotHalfPyramid {
    /*
             *
           * *
         * * *
       * * * *
     */
    
    public static void main(String args[]){
        int n = 5;
        int spaces = n - 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(spaces > 0)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
                spaces--;
            }
            spaces = n - i - 1;
            System.out.println();
        }
    }
}
