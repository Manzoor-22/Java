class LexSmallestString{
    public static String getSmallestString(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i = 1; i < s.length(); i++){
            int num1 = Character.getNumericValue(s.charAt(i-1));
            int num2 = Character.getNumericValue(s.charAt(i));

            if((num1%2) == (num2%2) && num2 < num1){
                ans.delete(ans.length()-1, ans.length());
                ans.append(num2);
                ans.append(num1);
            }
            else{
                ans.append(s.charAt(i-1));
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(getSmallestString("45320"));
    }
}