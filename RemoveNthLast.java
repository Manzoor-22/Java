public class RemoveNthLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(size == n){
            head = head.next;
            return head;
        }

        int nodeNumber = (size - n) - 1;
        int i = 0;
        temp = head;
        
        while (i != nodeNumber){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        return head;
    }
}
