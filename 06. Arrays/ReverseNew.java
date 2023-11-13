public class ReverseNew {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int n = array.length;
        for(int i = 0; i < n / 2; i++){
            int k = array[n - i - 1];
            array[n-i-1] = array[i];
            array[i] = k;
        }
        for(int k : array)
            System.out.println(k);
    }
}
