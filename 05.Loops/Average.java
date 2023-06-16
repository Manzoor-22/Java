import java.util.Scanner;

public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float Array[] = new float[5];
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < 3; i++){
            Array[i] = sc.nextFloat();
        }

        System.out.println("Average = " + Avg(Array));
    }

    public static float Avg(float Array[]){
        return((Array[0] + Array[1] + Array[2]) / 3);
    }
}
