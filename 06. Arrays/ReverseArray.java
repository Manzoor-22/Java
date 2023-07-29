public class ReverseArray {
    public static int[] reverse(int[] Array)
    {
        int ans[] = new int[Array.length];

        for(int i = Array.length - 1, j = 0; i >= 0; i--, j++){
            ans[j] = Array[i];
        }

        return ans;
    }
    public static void main(String args[])
    {
        int Array[] = {1, 3, 5, 2, 4, 8};

        Array = reverse(Array);

        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }
}
