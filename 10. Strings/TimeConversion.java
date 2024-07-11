public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:40:22AM"));
    }
    public static String timeConversion(String s) {
        int last = s.length()-1;
        
        if(s.charAt(0) == '1' && s.charAt(1) == '2'){
            if(s.contains("PM"))
                return s.substring(0, last-1);
            else{
                StringBuilder result = new StringBuilder("");
                result.append(s.substring(0, last-1));
                int fd = Character.getNumericValue(s.charAt(0));
                int sd = Character.getNumericValue(s.charAt(1));
                int time = (fd * 10) + sd;
                time -= 12;
                String t = Integer.toString(time);
                result.replace(0, 2, t);
                return result.toString();
            }
        }
        
        if(s.contains("AM"))
            return s.substring(0, last-1);
            
        else{
            StringBuilder result = new StringBuilder("");
            result.append(s.substring(0, last-1));
            int fd = Character.getNumericValue(s.charAt(0));
            int sd = Character.getNumericValue(s.charAt(1));
            int time = (fd * 10) + sd;
            time += 12;
            String t = Integer.toString(time);
            result.replace(0, 2, t);
            return result.toString();
        }

    }
}
