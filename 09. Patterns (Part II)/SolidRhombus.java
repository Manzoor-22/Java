public class SolidRhombus {
    public static void main(String args[]){
        int n = 7;
        
        for(int i = 1; i <= n; i++){
            int spaces = n - i;
            while(spaces != 0){
                System.out.print("   ");
                spaces--;
            }
            for(int j = 1; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
