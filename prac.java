public class prac {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,5,5,10,20,20,20};

        int countOf5 = 0;
        int countOf10 = 0;

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                countOf5++;
            }
            else if(bills[i] == 10){
                if(countOf5 == 0){
                    return;
                }
                countOf10++;
                countOf5--;
            }
            else{
                int curr = (countOf5*5)+(countOf10*10);
                if(curr < 15 || countOf10 < 1 || countOf5 < 1){
                    return;
                }
                if((countOf10 >= 1) && (countOf5 >= 1)){
                    countOf10--;
                    countOf5--;
                }
                else if(countOf5 > 3){
                    countOf5 = countOf5 - 3;
                }
            }
        }
    }
}
