import java.util.*;
public class practice {
    public static void main(String[] args) {
        Set<String> hash_Set = new HashSet<>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        // Printing elements of HashSet object
        System.out.println(hash_Set.toArray()[2]);
    }
}
