package CodeForces;
import java.util.HashMap;
import java.util.Scanner;

public class C_Numeric_String_Template{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int t;
        t=sc.nextInt();

        while(t-- > 0){
            solution();
        }
    }

    public static void solution(){
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        while(m-- > 0){
            testCases(arr);
        }
    }

    public static void testCases(int[] arr){
        String str = sc.next();
        HashMap<Integer, Character> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        if(arr.length != str.length()){
            System.out.println("NO");
            return;
        }

        for(int i = 0; i < arr.length; i++){
            char c = str.charAt(i);
            if(hm1.containsKey(arr[i]) ){
                if(hm1.get(arr[i]) != c){
                    System.out.println("NO");
                    return;
                }
            }
            else if(hm2.containsKey(c)){
                if(hm2.get(c) != arr[i]){
                    System.out.println("NO");
                    return;
                }
            }
            else{
                hm1.put(arr[i], c);
                hm2.put(c, arr[i]);
            }
        }

        System.out.println("YES");
    }
}