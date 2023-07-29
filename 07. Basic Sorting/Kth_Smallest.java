import java.util.Arrays;

public class Kth_Smallest {
    public static int Solution(int[] Array, int k)
    {
        for(int i = 0; i < Array.length; i++)
        {
            for(int j = i + 1; j < Array.length; j++)
            {
                if(Array[i] > Array[j]){
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        // for(int i = 0; i < Array.length; i++){
        //     System.out.println(Array[i]);
        // }
        return Array[k - 1];
    }
    public static int Solution2(int[] Array, int k)
    {
        Arrays.sort(Array);
        return Array[k - 1];
    }
    public static void main(String args[])
    {
        int Array[] = {5, 2, 6, 1, 0};
        int k = 4;

        int ans = Solution(Array,k);
        int ans2 = Solution2(Array,k);

        System.out.println(ans + " " + ans2);
    }
}
