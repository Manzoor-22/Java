public class Remove0 {
    public static void main(String args[]){
        int k = 0;
        int arr[] = {1,0,2,0,4,6};

        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }

        while(k < arr.length){
            arr[k] = 0;
            k++;
        }

        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
