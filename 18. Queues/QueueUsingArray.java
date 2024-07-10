public class QueueUsingArray {
    static class QueueA{
        static int size, array[];
        static int rear = -1;
        QueueA(int size){
            this.size = size;
            array = new int[size];
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public boolean isFull(){
            return rear == size - 1;
        }

        public void insert(int num){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            array[rear] = num;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            if(rear == 0){
                rear = -1;
            }
            int element = array[0];
            for(int i = 0; i < rear; i++){
                array[i] = array[i+1];
            }
            rear--;
            return element;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return Integer.MAX_VALUE;
            }
            return array[rear];
        }
    }

    public static void main(String[] args) {
        QueueA qa = new QueueA(5);
        System.out.println(qa.isEmpty());
        qa.pop();
        qa.peek();
        qa.insert(0);
        qa.insert(1);
        qa.insert(2);
        qa.insert(3);
        qa.insert(4);
        qa.pop();
        qa.pop();
        qa.pop();
        qa.insert(10);
        System.out.println(qa.isFull());
        System.out.println(qa.peek());
        
        while(!qa.isEmpty()){
            System.out.print(qa.pop() + " ");
        }
    }
}
