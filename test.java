public class test {
    public static void main(String[] args) {
        String str = "ab123478xz";
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char num = str.charAt(i);
            switch(num){
                case '1':
                    sum += 1;
                    break;
                case '2':
                    sum += 2;
                    break;
                case '3':
                    sum += 3;
                    break;
                case '4':
                    sum += 4;
                    break;
                case '5':
                    sum += 5;
                    break;
                case '6':
                    sum += 6;
                    break;
                case '7':
                    sum += 7;
                    break;
                case '8':
                    sum += 8;
                    break;
                case '9':
                    sum += 9;
                    break;
            }
        }
        System.out.println(sum);
    }
}
