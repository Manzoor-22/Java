import java.util.Stack;

public class pushBottom {
    public static void pushAtBottom(int n, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        else {
            int top = s.pop();
            pushAtBottom(n, s);
            s.push(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
