
public class Sb {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int x = 4, y = 5;
        int score = 0;

        while(s.contains("ab") && s.contains("ba")){
            if(x > y){
                score += x;
                s = s.replaceFirst("ab", "");
            }
            if(y > x){
                score += y;
                s = s.replaceFirst("ba", "");
            }
        }
        while(s.contains("ab")){
            score += x;
            s = s.replaceFirst("ab", "");
        }
        while(s.contains("ba")){
            score += x;
            s = s.replaceFirst("ba", "");
        }

        System.out.println(score);
    }
}
