import java.util.LinkedList;

public class LLpairs {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(2);
        ll.next.next = new ListNode(3);
        ll.next.next.next = new ListNode(4);
        ll.next.next.next.next = new ListNode(5);
        
        ListNode i = ll;

        while(i != null){
            ListNode j = i.next;
            while(j != null){
                System.out.println(i.data + " " + j.data);
                j = j.next;
            }
            i = i.next;
        }
    }
}
