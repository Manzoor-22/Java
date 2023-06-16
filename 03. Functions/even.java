public class even {
    public static boolean isEven(){
        int n = 921;

        if (n % 2 == 0)
        return true;

        else
        return false;
    }

    public static void main(String args[]){
        boolean a = isEven();

        if (a == true)
        System.out.println("Yes");

        else
        System.out.println("No");
    }
}
