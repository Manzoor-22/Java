import java.util.ArrayList;

public class UsingArraylist{
    static class Stack{
        static ArrayList<Integer> al = new ArrayList<>();

        public boolean isEmpty(){
            return al.size() == 0;
        }

        public void push(int data) {
            al.add(data);
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = al.size()-1;
            al.remove(top);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            return al.get(al.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        while(!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}