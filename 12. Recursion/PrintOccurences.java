public class PrintOccurences {
    public static void main(String args[]){
        Recursion(new int[]{1,2,4,6,8,2,4,6}, 4, 0);
    }
    private static void Recursion(int[] array, int key, int i){
        if(i == array.length)
            return;
        if(array[i] == key)
            System.out.print(i + " ");
        Recursion(array, key, i+1);
    }
}
