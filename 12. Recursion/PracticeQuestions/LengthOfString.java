package PracticeQuestions;

public class LengthOfString {
    public static void main(String args[]){
        String name = "Manzoor";
        System.out.println(recursion(name, 0));
    }

    private static int recursion(String name, int index){
        if(name.isEmpty())
            return 0;

        return 1 + recursion(name.substring(1), index+1);
    }
}
