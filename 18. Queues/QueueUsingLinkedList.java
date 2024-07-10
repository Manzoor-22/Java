public class QueueUsingLinkedList {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class QueueLL{
        static ListNode front = null, rear = null;
        static int size = -1;

        public boolean isEmpty(){
            return rear == null;
        }

        public void push(int val){
            ListNode newNode = new ListNode(val);
            if(isEmpty()){
                front = newNode;
                rear = newNode;
            } else{
                rear.next = newNode;
            }
            rear = newNode;
            size++;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return Integer.MIN_VALUE;
            }
            int removed = front.data;
            if(front.next == null){
                front = null;
                rear = null;
            } else 
                front = front.next;
            return removed;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return front.data;
        }
    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        System.out.println(q.isEmpty());
        q.push(0);
        q.push(1);
        q.push(2);
        q.pop();
        q.push(5);
        while(!q.isEmpty()){
            System.out.println(q.pop());
        }
    }
}
