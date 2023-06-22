public class Test {
    public static void main(String args[]){
        int Array[] = {-2,-3,4,-1,-2,1,5,-3};
        int cs = 0, ms = Integer.MIN_VALUE;

        for(int i = 0; i < Array.length; i++){
            cs = cs + Array[i];
            if(cs < 0)
            cs = 0;
            if(cs > ms)
            ms = cs;
        }

        System.out.println(ms);
    }
}
