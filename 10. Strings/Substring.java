public class Substring {
    public static void main(String[] args) {
        String str = "NewProgram";
        System.out.println(Calculate(str, 2, 5));
    }
    public static String Calculate(String s, int Start, int End){
        String result = "";
        for(int i = Start; i < End; i++){
            result += s.charAt(i);
        }
        return result;
    }
}
