import java.util.Scanner;

public class CountLowerCase {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++){
            char word = input.charAt(i);
            if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u')
                count++;
        }
        System.out.println("Number of lowercase vowels: " + count);
    }
}
