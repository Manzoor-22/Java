import java.util.Stack;

public class QueueUsing2Stacks {
    static class Q{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void enqueue(int num){            
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(num);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public int dequeue(){
            return s1.pop();
        }
        public int peek(){
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Q queue = new Q();
        queue.enqueue(0);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(6);

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
        
    }
}
