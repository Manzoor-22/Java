import java.util.Arrays;
import java.util.Scanner;

class PrimeRange{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of n: ");
        n = sc.nextInt();
        boolean primes[] = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for(int i = 2; i < primes.length; i++){
            if(primes[i] == false)
                continue;
            for(int j = 2; j * i < primes.length; j++){
                primes[j*i] = false;
            }
        }

        for(int i = 0; i < primes.length; i++){
            if(primes[i] == true)
            System.out.println("{ " + i + " : " + primes[i] + " }");
        }

        sc.close();
    }
}