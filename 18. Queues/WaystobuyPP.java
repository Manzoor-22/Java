public class WaystobuyPP {
    static int sol = 0;
    public static long waysToBuyPensPencils(int total, int cost1, int cost2) {
        ans(total, cost1, cost2, 0, 0);
        return sol;
    }

    public static void ans(int total, int c1, int c2, int q1, int q2){
        int cost = (c1*q1) + (c2*q2);
        if(cost > total){
            return;
        }
        sol++;
        ans(total, c1, c2, q1+1, q2);
        ans(total, c1, c2, q1, q2+1);
    }
    public static void main(String[] args) {
        
    }
}
