public class RemovingCycle {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
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
        head.next.next.next.next.next = head;

        // check if cycle exists
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("Cycle exists!");
                break;
            }
        }

        // condition if cycle doesn't exist

        if(fast == null || fast.next == null){
            System.out.println("Cycle doesnt't exist!");
            return;
        }

        ListNode prev = fast;
        slow = head;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
