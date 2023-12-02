class Print1toN{
    public static void main(String[] args) {
        function(99);
    }
    static void function(int n){
        if(n == 0)
            return;
        function(n-1);
        System.out.print(n + " ");
    }
}