public class FirstOccurence {
    public static void main(String[] args) {
        int[] array = {1,2,5,7,8,5};
        System.out.println(check(array, 0, 5));
    }
    private static int check(int[] array, int index, int key){
        if(index == array.length)
            return -1;
        if(array[index] == key)
            return index;
        else
            return(check(array, index+1, key));
    }
}
