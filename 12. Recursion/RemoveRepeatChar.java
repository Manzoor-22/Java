public class RemoveRepeatChar {
    public static void main(String args[]){
        Recursion("manzoormohd", new StringBuilder(""), new boolean[26], 0);
    }
    private static void Recursion(String str, StringBuilder ans, boolean[] check, int index){
        if(index == str.length()){
            System.out.println(ans);
            return;
        }
        char currentChar = str.charAt(index);
        if(check[currentChar - 'a'] == true){
            Recursion(str, ans, check, index+1);
        } else {
            check[currentChar - 'a'] = true;
            Recursion(str, ans.append(currentChar), check, index+1);
        }
    }
}
