import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String str = sc.next();
        HashMap<Integer, Character> hm = new HashMap<>();

        if(arr.length != str.length()){
            System.out.println("No");
            return;
        }

        for(int i = 0; i < arr.length; i++){
            char c = str.charAt(i);
            if(hm.containsKey(arr[i])){
                if(hm.get(arr[i]) != c){
                    System.out.println("NO");
                    return;
                }
            } else{
                hm.put(arr[i], c);
            }
        }
    }
}
