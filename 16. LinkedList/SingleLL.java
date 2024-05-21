public class SingleLL {
    public static class Node{
        int val;
        Node next;
    
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        SingleLL ll = new SingleLL();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
    }
}
