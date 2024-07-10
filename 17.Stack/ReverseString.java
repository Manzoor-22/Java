import java.util.Stack;

public class ReverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }
        str = "";
        while(!s.isEmpty()){
            str += s.pop();
        }
        return str;
    }
    
    public static void main(String[] args) {
        String st = "Hello";
        st = reverse(st);

        System.out.println(st);
    }
}
