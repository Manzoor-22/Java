public class numhp {
    public static void main(String args[]){
        for(int rows = 0; rows < 4; rows++){
            for(int columns = 0; columns < rows + 1; columns++){
                System.out.print(columns + 1 +" ");
            }
            System.out.print("\n");
        }
    }
}
