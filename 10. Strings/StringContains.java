public class StringContains {
    public static void main(String[] args) {
        String s1 = "Helloworldorld";
        String s2 = "orl";
        int k = 0;
        for(int i = 0; i < s1.length(); i++){
            if(k == s2.length()){
                System.out.println(i-k-1);
                break;
            }
            if(s2.charAt(k) == s1.charAt(i)){
                k++;
            } else{
                k=0;
            }
        }
        System.out.println("Failed");
    }
}
