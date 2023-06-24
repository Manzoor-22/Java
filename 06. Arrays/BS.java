public class BS{
    public static void main(String args[]){
        int Array[] = {2, 4, 6, 7, 8};

        int low = 0, high = Array.length;

        int key = 10;

        System.out.println(BinaryS(Array, low, high, key));
    }

    public static int BinaryS(int Array[], int low, int high, int key){
        int mid = (low + high) / 2;
        if(low >= high)
            return -1;
        else if(Array[mid] == key)
            return mid;
        else if(Array[mid] > key)
            return BinaryS(Array, low, mid - 1, key);
        else
            return BinaryS(Array, mid + 1, high, key);
    }
}