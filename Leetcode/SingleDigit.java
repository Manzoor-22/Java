public class SingleDigit {
    public static void main(String[] args) {
        int num = 38;

        int ans = 0;
        while(num % 10 != num){
            while(num > 0){
                int digit = num % 10;
                ans += digit;
                num /= 10;
            }
            num = ans;
            ans = 0;
        }

        System.out.println(num);
    }
}
