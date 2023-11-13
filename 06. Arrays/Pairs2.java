public class Pairs2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                System.out.print("[" + array[i] + "," + array[j] + "]");
            }
            System.out.println();
        }
    }
}
