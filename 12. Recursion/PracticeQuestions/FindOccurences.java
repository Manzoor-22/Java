package PracticeQuestions;

public class FindOccurences {
    public static void main(String args[]){
        int[] array = {1,4,3,5,6,1,3,5,6,1};
        int key = 1;
        recursion(array, key, 0);
    }
    private static void recursion(int array[], int key, int index){
        if(index == array.length)
            return;

        if(array[index] == key)
            System.out.print(index + " ");

        recursion(array, key, index+1);
    }
}
