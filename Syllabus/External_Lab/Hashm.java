package Syllabus.External_Lab;
import java.util.*;

public class Hashm {
    public static void main(String args[]){
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("One", new Double(1.11));
        hm.put("Two", new Double(2.22));
        hm.put("Three", new Double(3.33));
        
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String,Double> me : set){
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        hm.put("One", hm.get("One") + 10);

        System.out.println(hm.get("One"));
    }
}
