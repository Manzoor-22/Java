import javax.lang.model.util.ElementScanner14;

public class Largest {
    public static void main(String args[]){
        int Array[] = {122, 22, 198, 4, 2};
        int Largest = Array[0];

        // for(int i = 1; i < Array.length; i++){
        //     if(Array[i] > Largest)
        //         Largest = Array[i];
        // }

        int ans = lar(Array, Largest, 1);

        System.out.println("Largest Element = " + ans);
    }

    public static int lar(int Array[], int Largest, int Iterator){
        if(Iterator == 5)
            return Largest;
        else{
            if(Array[Iterator] > Largest)
                Largest = Array[Iterator];
            return lar(Array, Largest, Iterator + 1);
        } 
            
    }
}
