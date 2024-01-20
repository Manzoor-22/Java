public class FirstOccurence {
    public static void main(String args[]){
        int key = 8;
        int[] array = {1,4,5,7,9,13,15,0,2,5,8};

        System.out.println(recursion(array, key, 0));
    }

    private static int recursion(int[] array, int key, int i) {
        //base condition
        if(i == array.length) {
            return -1;
        }
        if(array[i] == key){
            return i;
        }
        return recursion(array, key, i+1);
    }
}
