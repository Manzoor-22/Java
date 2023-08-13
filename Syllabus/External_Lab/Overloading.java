package Syllabus.External_Lab;

class OverloadDemo{
    void test(){
        System.out.println("No parameters");
    }
    void test(int a){
        System.out.println("a = " + a);
    }
    void test(int a, int b){
        System.out.println("a = " + a + ", b = " + b);
    }
    double test(double a){
        System.out.println("double a = " + a);
        return a * a;
    }
}

class Overloading {
    public static void main(String args[]){
        OverloadDemo obj = new OverloadDemo();

        obj.test();
        obj.test(5);
        obj.test(1,2);
        double ans = obj.test(2.33);
        System.out.println(ans);
    }
}
