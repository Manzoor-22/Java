import java.util.LinkedList;

public class Cycle {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode head;

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next = head;

        // 1 -> 2 -> 3 -> 4 -> 5 -> 1

        // Detecting cycle using 2 pointers
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                System.out.println("Cycle found!");
                return;
            }
        }
        System.out.println("Cycle not found!");
    }
}
