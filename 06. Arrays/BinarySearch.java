import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class BinarySearch{
    public static void main(String args[]){
        int Array[] = {1, 5, 9, 11, 13};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int Key = sc.nextInt();
        int max = Array.length, min = 0;
        int ans = search(Array, Key, max, min);

        System.out.println(ans);

    }
    public static int bs(int Array[], int Key){
        int min = 0, max = (Array.length - 1);
        while(min <= max){
            int mid = (min + max) / 2;

            if(Array[mid] == Key)
                return mid;
            else if(Array[mid] > Key)
                max = mid - 1;
            else
                min = mid + 1;
        }
        return -1;
    }

    public static int search(int Array[], int Key, int max, int min){
        int mid = (max + min) / 2;

        if(max <= min)
            return -1;

        else if(Array[mid] == Key)
            return mid;

        else if(Array[mid] > Key)
            return search(Array, Key, mid - 1, min);

        else
            return search(Array, Key, max, mid + 1);
    }
}