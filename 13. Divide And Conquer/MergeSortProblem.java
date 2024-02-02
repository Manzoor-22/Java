public class MergeSortProblem{

    private static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void mergeSort(int[] arr, int si, int ei){
        if(si >= ei)
            return;
        
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    private static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si, j = mid+1, k = 0;
        
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
            temp[k++] = arr[i++];

        while(j <= ei)
            temp[k++] = arr[j++];

        for(i = si, k = 0; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        int[] arr = {9,3,5,1,0};
        
        System.out.print("Current Matrix: ");
        printArr(arr);
        
        System.out.print("Sorted Matrix: ");
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}