public class practice {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String s) {
        long ans = 0;
        s = s.strip();
        StringBuilder temp = new StringBuilder(s);
        if(temp.charAt(0) == '-' || temp.charAt(0) == '+')
            temp.deleteCharAt(0);
        
        for(Character c: temp.toString().toCharArray()){
            if(!Character.isDigit(c)){
                return (int)ans;
            }
            ans = (ans * 10) + Character.getNumericValue(c);
            
            if(ans < Integer.MIN_VALUE && s.charAt(0) == '-'){
                return Integer.MIN_VALUE;
            }
            if(ans > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
            
        
        if(s.charAt(0) == '-')
            return (int)-ans;
        
        return (int)ans;
    }
}
