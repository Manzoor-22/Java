import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDQ {
    static class Stk{
        Deque<Integer> dq;
        Stk(){
            dq = new LinkedList<>();
        }

        public boolean isEmpty(){
            return dq.isEmpty();
        }
        public void push(int e){
            dq.addLast(e);
        }
        public int pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        Stk stack = new Stk();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        // while(!stack.isEmpty())
        //     System.out.println(stack.pop());

        stack.pop();
        System.out.println(stack.peek());
    }
}
