import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "ACDGHR";


        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length(); i++){
            for(int j = i+1; j <= str1.length(); j++){
                al1.add(str1.substring(i,j));
            }
        }
        
        for(int i = 0; i < str2.length(); i++){
            for(int j = i; j < str2.length(); j++){
                al2.add(str2.substring(i,j));
            }
        }

        System.out.println(al1);

    }
}
