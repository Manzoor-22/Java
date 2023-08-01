class Demo
{
    public void test(){
        System.out.println("No parameters");
    }
    public void test(int a, int b){
        System.out.println("a and b : " + a + " " + b);
    }
    public double test(double a){
        System.out.println("Double a : " + a);
        return a*a;
    }
}
class MethodOverloading
{
    public static void main(String args[]){
        Demo d = new Demo();
        double cons = 3.14;
        d.test();
        d.test(5,4);
        double ans = d.test(cons);
        System.out.println("Ans = " + ans);
    }
}