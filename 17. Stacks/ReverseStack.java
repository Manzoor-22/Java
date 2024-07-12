import java.util.Stack;

public class ReverseStack {
    public static void pushBottom(Stack<Integer> stk, int data){
        if(stk.isEmpty()){
            stk.push(data);
            return;
        }
        int element = stk.pop();
        pushBottom(stk, data);
        stk.push(element);
    }

    public static void reverse(Stack<Integer> stk){
        if(stk.isEmpty()){
            return;
        }
        int data = stk.pop();
        reverse(stk);
        pushBottom(stk, data);
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
