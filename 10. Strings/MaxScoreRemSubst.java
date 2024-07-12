
public class MaxScoreRemSubst {
    public static void main(String[] args) {
        int x = 4, y = 5;
        String s = "cdbcbbaaabab";
        int ans = 0;
        StringBuilder sb = new StringBuilder("abcd");
        sb.delete(sb.length()-1, sb.length());
        for(int i = 0; i < s.length()-2; i++){
            System.out.println(s.charAt(i));
        }
    }
}
