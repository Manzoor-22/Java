public class LexOrder {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Grapes", "Avacado", "Bear", "Mango"};
        String largest = fruits[0];

        for(int i = 1; i < fruits.length; i++){
            if(fruits[i].compareToIgnoreCase(largest) > 0)
                largest = fruits[i];
        }
        System.out.println(largest);
    }
}
