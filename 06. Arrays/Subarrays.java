public class Subarrays {
    public static void main(String args[]){
        int Array[] = {1, 3, 4, 2, 5};

        for(int i = 0; i < Array.length - 1; i++){
            int Start = i;
            for(int j = i + 1; j < Array.length; j++){
                int End = j;
                for(int k = Start; k < End; k++)
                    System.out.print(Array[k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
