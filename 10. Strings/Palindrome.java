public class Palindrome {
    public static void main(String args[]){
        String str = "racecar";
        System.out.println(CheckPalindrome(str));
    }
    public static boolean CheckPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
