public class SandEwithChar {
    public static void main(String args[]){
        String inp = "Hellothere";
        char c = 'e';

        int start = 0, end = inp.length()-1;
        while(start <= end){
            if(inp.charAt(start) != c)
                start++;
            if(inp.charAt(end) != c)
                end--;
            if(inp.charAt(start) == inp.charAt(end))
                break;
        }
        System.out.println(start + " " + end);
    }
}
