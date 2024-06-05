public class ReverseDLL {
    public class ListNode{
        int val;
        ListNode prev;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printLL(ListNode head){
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void reverse(){
        ListNode prev = null;
        ListNode curr = head, next = head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static ListNode head;
    public static ListNode tail;

    public static void main(String[] args) {
        ReverseDLL ll = new ReverseDLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLL(head);
        ll.reverse();
        ll.printLL(head);
    }
}
