

public class Testparam {
    public static void main(String[] args) {
        String s = "www.deltax.com/carrer?test_param=google&param_1=india";
        String p1 = "test_param";
        String p2 = "param_15";
        int cases = 2;
        int k1 = s.indexOf(p1) + p1.length() + 1;
        while(s.charAt(k1) != '&'){
            System.out.print(s.charAt(k1));
            k1++;
        }
        boolean ifExists = s.contains(p2);
        if(ifExists){
            int k2 = s.indexOf(p2) + p2.length() + 1;
            while(s.charAt(k2) != '&'){
                System.out.print(s.charAt(k2));
                k2++;
            }
        } else{
            System.out.println("null");
        }
    }
}
