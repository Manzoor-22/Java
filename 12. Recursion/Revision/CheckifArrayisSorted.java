public class CheckifArrayisSorted {
    public static void main(String args[]){
        int[] array = {1,4,6,7,9};

        System.out.println(recursion(array, 0));
    }

    private static boolean recursion(int[] a, int i){
        if(i == a.length - 1)
            return true;
        if(a[i] > a[i+1])
            return false;
        return recursion(a, i+1);
    }
}
