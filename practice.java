public class practice {
    public static void main(String[] args) {
        int x= 121;
        int ans = 0, temp = x;
        while(temp > 0){
            int remainder = temp % 10;
            ans = ans * 10 + remainder;
            temp /= 10;
        }
        System.out.println(ans);
    }
}
