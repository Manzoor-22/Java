package Syllabus.External_Lab;

interface A{
    void meth1();
    void meth2();
}

interface B extends A{
    void meth3();
}

class MyClass implements B{
    public void meth1(){
        System.out.println("Implemented meth1()");
    }
    public void meth2(){
        System.out.println("Implemented meth3()");
    }
    public void meth3(){
        System.out.println("Implemented meth3()");
    }
}

class Interfaces {
    public static void main(String args[]){
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
