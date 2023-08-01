public class PeakElement {
    public static int Solution(int[] array)
    {
        for(int i = 1; i < array.length - 1; i++)
        {
            if(array[i] > array[i-1] && array[i] > array[i+1])
                return array[i];
        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] array = {1, 3, 4, 2, 5};
        int answer = Solution(array);

        System.out.println(answer);
    }
}
