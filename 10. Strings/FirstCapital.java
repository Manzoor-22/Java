public class FirstCapital {
    public static void main(String[] args) {
        String str = "hello world, this is new program";
        StringBuilder sb = new StringBuilder("");
        sb.append(str.toUpperCase().charAt(0));
        String ans = str.toUpperCase().charAt(0) + "";
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i-1) == ' '){
                ans += str.toUpperCase().charAt(i);
                sb.append(str.toUpperCase().charAt(i));
            } else {
                ans += str.charAt(i);
                sb.append(str.charAt(i));
            }
        }
        System.out.println(ans);
        System.out.println(sb);
    }
}
