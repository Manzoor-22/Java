public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;
        int stars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("   ");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print(" * ");
            }
            stars += 2;
            System.out.println();
        }
        stars -= 2;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("   ");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print(" * ");
            }
            stars -= 2;
            System.out.println();
        }
    }
}
