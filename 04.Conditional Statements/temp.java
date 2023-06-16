import java.util.Scanner;

public class temp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        float Temp = sc.nextFloat();

        if(Temp > 100){
            System.out.println("Unfortunately, you have fever!");
        }
        else{
            System.out.println("Thankgod, you are good!");
        }
    }
}
