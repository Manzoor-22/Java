package Syllabus.External_Lab;
import java.util.*;

public class STR {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input, ",");
        int sum = 0, count = 0;

        while(st.hasMoreTokens()){
            int n = 0;
            n = Integer.parseInt(st.nextToken());
            System.out.println("Number " + count + " is " + n);
            sum += n;
        }

        System.out.println("Sum = " + sum);
    }
}
