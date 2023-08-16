package Syllabus.External_Lab;

class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail = a;
    }
    public String toString(){
        return "MyException[" + detail + "]" ;
    }
}

public class ExceptionHandling {
    static void compute(int a) throws MyException{
        System.out.println("Called compute (" + a + ")");

        if(a > 20)
            throw new MyException(a);

        System.out.println("Normal Exit!");
    }
    public static void main(String args[]){
        try{
            compute(10);
            compute(25);
        }
        catch(MyException e){
            System.out.println("Caught " + e);
        }
    }
}
