import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i < n; i++){
            String s = Integer.toString(i);
            int pow = s.length();
            int exp = 0;
            for(Character c : s.toCharArray()){
                exp += Math.pow(Character.getNumericValue(c), pow);
            }

            if(exp == i){
                System.out.println(exp);
            }
        }

        sc.close();
    }
}
