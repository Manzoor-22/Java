import java.util.Stack;

public class QueueUsingStack {
    public static void pushAtBottom(Stack<Integer> s, int num){
        if(s.isEmpty()){
            s.push(num);
            return;
        }
        int element = s.pop();
        pushAtBottom(s, num);
        s.push(element);
    }
    
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int element = s.pop();
        reverseStack(s);
        pushAtBottom(s, element);
    }

    public static void main(String[] args) {
        Stack<Integer> q = new Stack<>();

        q.push(3);
        q.push(2);
        q.push(1);

        // reverseStack(q);

        while(!q.isEmpty()){
            System.out.println(q.pop());
        }
    }
}
