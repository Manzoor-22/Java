import java.util.*;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder("S;M;plasticCup()");
        int i;
        input.delete(0, 2);
        input.delete(0, 2);
        for(i=0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))){
                break;
            }
        }
        input.insert(i, " ");
        input.replace(i+1,i+2, Character.toString((Character.toLowerCase(input.charAt(i+1)))));
        System.out.println(input);
        List<Integer> ans = new ArrayList<>();
        ans.si
    }
}
