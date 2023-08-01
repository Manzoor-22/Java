class A
{
    int i, j;   
    void showij(){
        System.out.println("i = " + i + ", j = " + j);
    }
}
class B extends A
{
    int k;
    void showk(){
        System.out.println("k = " + k);
    }
    void sum()
    {
        System.out.println("i + j + k = " + (i+j+k));
    }
}
class SingleInheritance
{
    public static void main(String args[]){
        A Aobj = new A();
        B Bobj = new B();
        Aobj.i = 10; Aobj.j = 15;
        System.out.println("Contents of class A:");
        Aobj.showij();
        Bobj.i = 5; Bobj.j = 6; Bobj.k = 7;
        System.out.println("Contents of class B:");
        Bobj.showij();
        Bobj.showk();
        System.out.print("Sum = ");
        Bobj.sum();
    }
}