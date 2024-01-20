public class LastOccurence {
    public static void main(String args[]) {
        int key = 14, a[] = {1,4,5,2,5,21,14,53,41,14};
        System.out.println(recursion(a,key,a.length-1));
    }

    private static int recursion(int a[], int key, int i){
        //base condition
        if(i == -1)
            return -1;
        if(a[i] == key)
            return i;
        return recursion(a, key, i-1);
    }
}
