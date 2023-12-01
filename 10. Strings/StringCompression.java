public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String str2 = str + " ";
        StringBuilder ans = new StringBuilder("");
        int count = 1;
        for(int i = 0; i < str2.length() - 1; i++){
            if(str2.charAt(i) == str2.charAt(i+1)){
                count++;
            } else {
                ans.append(str2.charAt(i) + "" + count);
                count = 1;
            }
        }
        System.out.println(ans);
    }
}
