public class SinglyLL {
    public static class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int val){
        Node newNode = new Node(val);
        size++;
        
        if(head == null) {
            head = newNode;
            newNode.next = null;
            tail = head;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        size++;
        if(head == null) {
            head = newNode;
            tail = newNode;
            head.next = null;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void add(int index, int val) {
        if(index == 0){
            addFirst(val);
            return;
        }

        Node newNode = new Node(val);
        int temp = index;
        Node current = head;

        do {
            if(current.next == null){
                addLast(val);
                return;
            }
            current = current.next;
            temp--;
        } while (temp != 1);

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void printLL(Node head) {
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked List is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.val;
            head = null;
            tail = null;
            size--;
            return val;
        }
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(tail == null) {
            System.out.println("Linked List is empty!");
            return Integer.MIN_VALUE;
        } else if(tail == head){
            int val = tail.val;
            tail = head = null;
            size = 0;
            return val;
        }
        Node temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        size--;
        int val = tail.val;
        tail = temp;
        tail.next = null;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int position = 1;
        while(temp != null){
            if(temp.val == key) {
                return position;
            }
            position++;
            temp = temp.next;
        }
        return -1;
    }

    public int recSearch(int key, Node temp) {
        if(temp.val == key) {
            return 0;
        }
        if(temp.next == null){
            return -1;
        }
        int helper = recSearch(key, temp.next);

        if(helper == -1)
            return 0;
        else
            return helper+1;
    }

    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(1);
        ll.addLast(6);
        ll.add(2, 11);
        ll.add(17, 11);

        ll.printLL(head);
        System.err.println(ll.recSearch(6, head));
        // System.out.println(ll.size);
    }
}
