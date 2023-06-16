public class Subarrays{
    public static void main(String args[]){
        int Array[] = {1, 2, 3, 4, 5};

        for(int i = 0; i < Array.length - 1; i++){
            for(int j = i + 1; j < Array.length; j++){
                for(int k = i; k < j; k++)
                    System.out.print("[" + Array[k] + "]");
                System.out.println();
            }
            System.out.println();
        }
    }
}