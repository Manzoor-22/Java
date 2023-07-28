import java.util.*;

public class TrappingRainwater
{
    public static void main(String args[])
    {
        int Array[] = {4, 2, 0, 6, 3, 2, 5};
        int Size = Array.length;

        int LeftHighest[] = new int[Size];
        int RightHighest[] = new int[Size];
        int TrappedWater[] = new int[Size];

        LeftHighest[0] = Array[0];
        for(int i = 1; i < Size; i++){
            LeftHighest[i] = Math.max(LeftHighest[i-1], Array[i]);
        }

        RightHighest[Size - 1] = Array[Size - 1];
        for(int i = Size - 2; i >= 0; i--){
            RightHighest[i] = Math.max(RightHighest[i+1], Array[i]);
        }

        int SumofTrappedWater = 0;
        for(int i = 0; i < Size; i++){
            TrappedWater[i] = (Math.min(LeftHighest[i], RightHighest[i]) - Array[i]);
            SumofTrappedWater += TrappedWater[i];
        }

        System.out.println(SumofTrappedWater);
    }
}