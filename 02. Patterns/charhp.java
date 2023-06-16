public class charhp {
    public static void main(String args[]){
        char A = 'A';
        for(int rows = 0; rows < 4; rows++){
            for(int columns = 0; columns < rows + 1; columns++){
                System.out.print(A++ + " ");
            }
            System.out.print("\n");
        }
    }
}
