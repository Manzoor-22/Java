import java.util.HashSet;

public class RemoveNode {
    static class ListNode{
        int val;
        ListNode next;
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for(Integer n: nums){
            hs.add(n);
        }
        while(hs.contains(head.val)){
            head = head.next;
        }

        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            if(hs.contains(current.val)){
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
        }

        return head;
    }
    public static void main(String[] args) {
        int[] nums = {0,5,1,4};
        HashSet<Integer> hs = new HashSet<>();
        for(Integer n: nums){
            hs.add(n);
        }
        System.out.println(hs);
    }
}
