import java.util.*;

public class VectorOperations {
    public static void main(String args[]){
        Vector<Integer> v = new Vector<Integer>();
        System.out.println("Initial Size = " + v.size());
        v.add(1);
        v.add(4);
        v.add(6);
        System.out.println("Current size = " + v.size());
        v.add(1,2);
        v.add(2, 3);
        v.remove(1);
        System.out.println("Current size = " + v.size());
        Enumeration numbers = v.elements();
        
        while(numbers.hasMoreElements()){
            System.out.println(numbers.nextElement());
        }
    }
}
