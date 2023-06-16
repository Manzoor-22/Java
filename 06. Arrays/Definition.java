public class Definition{
    public static void main(String args[]){
        int[] a = {3, 4 , 5};
        String[] str = {"Red", "Green", "Yellow"};
        Double[] dble = {4.56, 2.89, 4.33};

        System.out.println(a[2]);
        System.out.println(str[0]);
        System.out.println(dble[1]);
        
        int[] b;
        b = new int[30];
        
        b[2] = 25;
        System.out.println(b[2]);
    }
}