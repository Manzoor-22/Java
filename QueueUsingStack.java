import java.util.Stack;

public class QueueUsingStack {
    public static void removeFromQ(Stack<Integer> s){
        int last;
        if(s.isEmpty()){
            System.out.println(last);
            return;
        }
        last = s.pop();
        removeFromQ(s);
        s.push(last);
    }
    
    public static void main(String[] args) {
        Stack<Integer> q = new Stack<>();

        q.push(1);
        q.push(2);
        q.push(3);
    }
}
