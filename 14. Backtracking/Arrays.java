public class Arrays {
    public static void backtrack(int[] arr, int n){
        if(n == -1)
            return;
        arr[n] = n + 1;
        backtrack(arr, n-1);
        arr[n] = arr[n] - 2;
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        backtrack(arr, 4);
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
