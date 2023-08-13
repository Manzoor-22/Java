public class test {
    public static void main(String args[]){  
        int[] array = {1,3,5,7,3};
        int element = 3;
        int[] ans = new int[array.length];
        int x = 0;
        for(int i : array){
            if(element != i){
                ans[x] = i;
                x++;
            }
        }
        array = ans;
        for(int i : array){
            System.out.println(i + " ");
        }
        System.out.println(x);
    }
}
