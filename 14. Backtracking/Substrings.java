public class Substrings {
    public static void backtrack(String str, String ans, int i){
        if(str.length() == i){
            System.out.println(ans);
            return;
        }
        backtrack(str, ans+str.charAt(i), i+1);
        backtrack(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        backtrack(str, ans, 0);
    }
}
