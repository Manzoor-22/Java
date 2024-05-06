public class Test2 {
    public static void main(String[] args) {
        String str = "mom dad mom son";
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length - 1; j++)
                if(words[i] == words[j] )
                    System.out.println(words[i]);
        }
    }
}
