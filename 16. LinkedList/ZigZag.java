public class ZigZag {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
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

        ListNode mid = findMid(head);
        ListNode h1 = head, h2 = mid.next;
        mid.next = null;

        h2 = reverse(h2);

        ListNode tHead = new ListNode(-1);
        ListNode temp = tHead;

        while(h1 != null && h2 != null){
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }

        if(h1 != null) {
            temp.next = h1;
        }

        if(h2 != null) {
            temp.next = h2;
        }

        printList(tHead);
    }

    public static ListNode findMid(ListNode head){
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null, curr = head, next = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printList(ListNode head){
        ListNode temp = head;

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
