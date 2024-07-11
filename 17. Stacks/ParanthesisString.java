import java.util.Stack;

public class ParanthesisString {
    public static void main(String[] args) {
        System.out.println(Character.getNumericValue('5'));
    }
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder("");
        Stack<Integer> NS = new Stack<>();
        Stack<Character> CS = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            StringBuilder str = new StringBuilder("");
            if(s.charAt(i) == ']'){
                while(CS.peek() != ']'){
                    str.append(CS.pop());
                    str.reverse();
                }
                String temp = str.toString();
                for(int j = 1; j <= NS.pop(); j++){
                    str.append(temp);
                }
                CS.pop();
            }
            if(Character.isDigit(s.charAt(i))){
                NS.push(Character.getNumericValue(s.charAt(i)));
            } else{
                CS.push(s.charAt(i));
            }
        }
    }
}
