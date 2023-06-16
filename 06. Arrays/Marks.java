public class Marks{
    public static void update(int marks[], int notChangable){
        notChangable = 10;
        for(int i = 0; i < marks.length; i++){
            marks[i] += 2;
        }
    }
    public static void main(String args[]){
        int[] Marks = {76, 68, 92, 66};
        int notChangable = 25;
        update(Marks, notChangable);
        for(int i = 0; i < Marks.length; i++){
            System.out.println(Marks[i]);
            System.out.println(notChangable);
        }
    }
}