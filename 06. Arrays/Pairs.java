public class Pairs {
    public static void groups(int Array[], int i, int j){
        if(i == Array.length - 1)
            System.out.println();

        else{
            System.out.print("[" + Array[i] + " , " + Array[j] + "]");

            if(j < Array.length - 1)
                groups(Array, i, j + 1);

            else{
                System.out.println();
                groups(Array, i + 1, i + 2);
            }
        }
    }

    public static void main(String args[]){
        int Array[] = {2, 9, 7, 0, 3, 10, 2};
        
        // for(int i = 0; i < Array.length - 1; i++){
        //     for(int j = i + 1; j < Array.length; j++){
        //         System.out.print("[" + Array[i] + " , " + Array[j] + "]");
        //     }
        //     System.out.println();
        // }
        groups(Array, 0, 1);
    }
}
