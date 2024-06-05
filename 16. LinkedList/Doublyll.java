public class Doublyll {
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
    
    public static ListNode head;
    public static ListNode tail;
    public static int size;
    
    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev=newNode;
        head=newNode;
    }

    public void addLast(int data){
        if(head == null){
            addFirst(data);
            return;
        }
        ListNode newNode = new ListNode(data);
        size++;
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void printLL(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("Linked List is Empty!");
            return -1;
        }
        else if(head == tail){
            int data = head.val;
            head = tail = null;
            size--;
            return data;
        }
        int data = head.val;
        head = head.next;
        head.prev = null;
        size--;
        return data;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("Linked List is Empty!");
            return -1;
        }
        else if(head == tail){
            removeFirst();
        }
        int data = tail.val;
        tail = tail.prev;
        tail.next = null;
        size--;
        return data;
    }

    public static void main(String[] args) {
        Doublyll ll = new Doublyll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addLast(0);
        System.out.println("Size = " + size);
        printLL(head);
        System.out.println("Removed = " + ll.removeFirst());
        System.out.println("Size = " + size);
        printLL(head);
        System.out.println("Removed = " + ll.removeLast());
        System.out.println("Size = " + size);
        printLL(head);
    }
}
