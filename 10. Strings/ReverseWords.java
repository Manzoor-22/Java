import java.util.LinkedList;

public class ReverseWords{
    public static String reverseWords(String s) {
        LinkedList<String> words = new LinkedList<>();
        String prev = "";

        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                prev += s.charAt(i);
            }
            else{
                words.add(prev);
                prev = "";
            }
        }

        System.out.println(words);

        StringBuilder ans = new StringBuilder("");
        for(int i = words.size()-1; i >= 0; i--){
            ans.append(words.get(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        reverseWords("  Hello   World     ");
    }
}