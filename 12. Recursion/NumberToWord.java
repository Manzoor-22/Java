public class NumberToWord {
    public static void main(String[] args) {
        Recursion(4589);
    }
    private static void Recursion(int n){
        if(n == 0)
        return;
        Recursion(n/10);
        int num = n % 10;
        switch(num){
            case 1:
            System.out.print("One ");
            break;
            case 2:
            System.out.print("Two ");
            break;
            case 3:
            System.out.print("Three ");
            break;
            case 4:
            System.out.print("Four ");
            break;
            case 5:
            System.out.print("Five ");
            break;
            case 6:
            System.out.print("Six ");
            break;
            case 7:
            System.out.print("Seven ");
            break;
            case 8:
            System.out.print("Eight ");
            break;
            case 9:
            System.out.print("Nine ");
            break;
        }
    }
}
