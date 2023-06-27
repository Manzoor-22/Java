public class SelectionSort{
    public static void main(String args[]){
        int Array[] = {1,4,-6,5,-2,0};

        for(int i = 0; i < Array.length - 1; i++){
            for(int j = i + 1; j < Array.length; j++){
                if(Array[i] > Array[j]){
                    int k = Array[i];
                    Array[i] = Array[j];
                    Array[j] = k;
                }
            }
        }

        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }
}