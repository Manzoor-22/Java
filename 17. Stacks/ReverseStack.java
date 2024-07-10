import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> stk){
        if(stk.isEmpty()){
            int data = stk.pop();
            stk.push(data);
        }
        reverse(stk);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        System.out.println(stk);
        reverse(stk);
        System.out.println(stk);
        }
}
