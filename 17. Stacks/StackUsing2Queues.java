import java.util.*;

public class StackUsing2Queues{
    // Stack = LIFO
    // Queue = FIFO
    // 1 2 3 4
    // q1 = []
    // q2 = [1,2,3]
    static class Stk{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        
        public void push(int e){
            if(!q1.isEmpty()){
                q1.add(e);
            }
            else {
                q2.add(e);
            }
        }
        public int pop(){
            int element;

            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    if(q1.size() == 1){
                        element = q1.remove();
                        return element;
                    }
                    q2.add(q1.remove());
                }
            }
            if(!q2.isEmpty()){
                while(!q2.isEmpty()){
                    if(q2.size() == 1){
                        element = q2.remove();
                        return element;
                    }
                    q1.add(q2.remove());
                }
            }
            System.out.println("Stack is empty!");
            return -1;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    if(q1.size() == 1){
                        return q1.remove();
                    }
                    q2.add(q1.remove());
                }
            }
            if(!q2.isEmpty()){
                while(!q2.isEmpty()){
                    if(q2.size() == 1){
                        return q2.remove();
                    }
                    q1.add(q2.remove());
                }
            }
            return -1;
        }
    }

    public static void main(String args[]){
        Stk stack = new Stk();
        stack.push(10);
        stack.push(9);
        stack.push(8);

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}