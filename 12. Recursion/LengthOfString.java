public class LengthOfString {
    public static void main(String args[]){
        String input = "Manzoor";
        System.out.println(length(input));
    }
    static int length(String inp){
        if(inp.isEmpty())
            return 0;
        return 1 + length(inp.substring(1));
    }
}
