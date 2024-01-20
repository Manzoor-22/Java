public class RemoveDupChar {
    public static void main(String args[]) {
        String str = "helllohejfaueredsssfsd";
        System.out.println(recursion(str, new StringBuilder(), 0, new boolean[26]));
    }

    private static String iterative(String str){
        boolean[] check = new boolean[26];
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(check[str.charAt(i) - 'a'] == false) {
                check[str.charAt(i) - 'a'] = true;
                ans.append(str.charAt(i));
            }
        }
        return String.valueOf(ans);
    }

    private static String recursion(String str, StringBuilder ans, int start, boolean[] check){
        if(start == str.length())
            return String.valueOf(ans);

        if(check[str.charAt(start)-'a'] == false){
            check[str.charAt(start)-'a'] = true;
            ans.append(str.charAt(start));
        }

        return  recursion(str, ans, start+1, check);
    }
}
