import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        q.add('a');
        q.add('b');
        q.add('c');
        q.add('d');
        q.add('e');
        System.out.println(q);
        q.add(q.remove());
        System.out.println(q);
    }
}
