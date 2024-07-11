public class CircularQueue {
    static class CQ{
        static int size, queue[];
        static int front = -1, rear = -1;

        CQ(int size){
            this.size = size;
            queue = new int[size];
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public boolean isFull(){
            return front == (rear + 1) % size;
        }

        public void push(int val){
            if(isFull()){
                System.out.println("Queue is full!");
                return;
            }
            if(isEmpty()){
                front = 0;
            }
            queue[(rear+1) % size] = val;
            rear = (rear+1) % size;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            int element = queue[front];
            if(front == rear){
                front = rear = -1;
            } else{
                front = (front + 1) % size;
            }
            return element;
        }

        public int peek(){
            return queue[front];
        }
    }
    
    public static void main(String[] args) {
        CQ q = new CQ(5);
        q.push(5);
        q.push(4);
        q.push(3);
        q.push(2);
        q.push(1);
        q.pop();
        q.pop();
        q.push(4);
        while(!q.isEmpty()){
            System.out.print(q.pop() + " ");
        }
    }
}
