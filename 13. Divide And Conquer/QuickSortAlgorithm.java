public class QuickSortAlgorithm {
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei) {
            return;
        }
        int index = partition(arr, si, ei);  
        quickSort(arr, si, index-1);
        quickSort(arr, index, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int i = si-1;
        for(int j = si; j < ei; j++){
            if(arr[j] < arr[ei]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,5,6,8,1};
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
