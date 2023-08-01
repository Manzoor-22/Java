public class AddOne
{
    public static void main(String args[]){
        int[] digits = {1, 9, 2};
        int[] ans = Solution(digits);

        for(int i = 0; i < digits.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] Solution(int[] digits)
    {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] Sol = new int[digits.length + 1];
        return Sol;
    }
}