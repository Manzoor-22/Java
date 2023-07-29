public class SubarrayGivenSum {
    public static void Solution(int[] Array, int Sum)
    {
        int Calculated_Sum = 0;
        if(Sum == Array[0])
            System.out.println(0 + " " + 0);
        for(int i = 0; i < Array.length; i++)
        {
            for(int j = 0; j < Array.length; j++){
                    Calculated_Sum += Array[j];
                    if(Calculated_Sum == Sum){
                        System.out.println(i + " " + j);
                        break;
                    }
            }
        }
    }
    public static void main(String args[])
    {
        int Array[] = {1, 0, 3, 4, 2, 1};
        int Sum = 13;
        Solution(Array, Sum);
    }  
}
