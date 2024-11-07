package Extra;
public class BinarySystem {
    public static void main(String[] args) {
        String str = "111";
        int pow = 1;
        int ans = 0;

        for(int i = str.length()-1; i >= 0; i--){
            int digit = Character.getNumericValue(str.charAt(i));
            ans = ans + pow*digit;
            pow *= 2;
        }

        System.out.println(ans);
    }
}
