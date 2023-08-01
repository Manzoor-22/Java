public class Occurences {
    public static int Solution(int[] Array, int k)
    {
        int count = 0;
        for(int i = 0; i < Array.length; i++)
        {
            if(Array[i] == k)
                count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        int[] Array = {2, 4, 1, 2 , 3, 4 ,2, 5, 6, 2, 7, 0};
        int k = 4;
        System.out.println(Solution(Array, k));
    }
}
