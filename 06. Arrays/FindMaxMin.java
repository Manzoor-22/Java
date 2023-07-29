public class FindMaxMin {
    public static int[] Solution(int[] a)
    {
        int[] Answer = new int[2];
        
        if(a.length == 0){
            Answer[0] = -1; Answer[1] = -1;
        }
        else if(a.length == 1){
            Answer[0] = a[0]; Answer[1] = a[1];
        }
        else{
            int max = a[0], min = a[0];
            for(int i = 0; i < a.length; i++){
                if(max < a[i])
                    max = a[i];
                if(min > a[i])
                    min = a[i];
                Answer[0] = max; Answer[1] = min;
            }
        }
        return Answer;
    }
    public static void main(String args[])
    {
        int a[] = {1, 4, 6, 2, 10};

        int ans[] = Solution(a);

        System.out.println("Max = " + ans[0]);
        System.out.println("Min = " + ans[1]);
    }
}
