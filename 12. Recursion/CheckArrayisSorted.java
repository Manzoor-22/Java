public class CheckArrayisSorted {
    public static void main(String[] args) {
        int[] array = {1,6,3,4,7};
        System.out.println(check(array, 0));
    }
    private static boolean check(int[] array, int i){
        if(i == array.length - 1)
            return true;
        if(array[i] > array[i+1])
            return false;
        return check(array, i+1);
    }
}
