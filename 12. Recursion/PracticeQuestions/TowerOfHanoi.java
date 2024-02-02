public class TowerOfHanoi {
    public static void main(String args[]){
        recursion(3, "A", "B", "C");
    }

    private static void recursion(int n, String source, String helper, String destination){
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        // transfer n-1 disks to B
        recursion(n-1, source, destination, helper);
        
        // move 1st disk to c
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        
        // transfer n-1 disks from helper to C using A
        recursion(n-1, helper, source, destination);
    }
}
