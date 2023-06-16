public class Reverse {
    public static void main(String args[]){
        int Array[] = {1, 4, 2, 8, 9, 5};

        int first = 0, last = (Array.length - 1);

        // while(first < last){
        //     int k = Array[first];
        //     Array[first] = Array[last];
        //     Array[last] = k;

        //     first++;
        //     last--;
        // }
        Array = reversed(Array, first, last);
        for(int i = 0; i < Array.length; i++)
        System.out.print(Array[i] + " ");
    }

    public static int[] reversed(int Array[], int first, int last){
        if(first >= last)
            return Array;
        else{
            int k = Array[first];
            Array[first] = Array[last];
            Array[last] = k;
            return (reversed(Array, first + 1, last - 1));
        }
    }
}
