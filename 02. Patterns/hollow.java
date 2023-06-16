public class hollow {
    public static void main(String args[]){
        for(int rows = 0; rows < 4; rows++){
            for(int columns = 0; columns < 4; columns++){
                if(rows == 0 || rows == 3 || columns == 0 || columns == 3){
                    System.out.print("* ");
                }
                else{
                    System.out.println("  ");
                }
            }
            System.out.print("\n");
        }
    }
}


/*

. . . .
.     .
.     .
. . . .

00 01 02 03
11       13
21       23
31 32 33 34

 */