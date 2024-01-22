package PracticeQuestions;

public class ConvertToEnglish {
    static String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void main(String args[]){
        int number = 2506;
        recursion(number);
    }

    private static void recursion(int number){
        if(number == 0)
            return;

        recursion(number / 10);

        int current = number % 10;
        
        System.out.print(numbers[current] + " ");
    }
}
