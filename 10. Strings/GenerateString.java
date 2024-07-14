public class GenerateString {
    public static void main(String[] args) {
        generateString(2, "", '1');
    }
    public static void generateString(int n, String s, char last){
        if(s.length() == n){
            System.out.println(s);
            return;
        }
        if(last != '0')
            generateString(n, s+"0", '0');
        generateString(n, s+"1", '1');
    }
}
