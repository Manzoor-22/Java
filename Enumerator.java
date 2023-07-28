import java.util.*;

public class Enumerator{
    public static void main(String args[]){
        Vector<Integer> vct = new Vector<>();
        vct.add(2);
        vct.add(3);
        vct.add(4);
        vct.add(5);
        Enumeration<Integer> en = Collections.enumeration(vct);
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
