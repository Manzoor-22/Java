public class UsingLL {
    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head = null, tail = null;

    static class Stack{
        public boolean isEmpty(){
            return (head == null);
        }
        public void push(int data){
            ListNode newNode = new ListNode(data);
            newNode.next = head;
            head = newNode;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("isEmpty()");
                return -1;
            }
            int temp = head.data;
            head = head.next;
            return temp;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("isEmpty()");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(5);
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);

        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }

    }
}
