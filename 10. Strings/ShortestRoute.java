public class ShortestRoute {
    public static void main(String[] args) {
        String route = "WNEENESENNN";
        int x = 0, y = 0;
        for(int i = 0; i < route.length(); i++){
            if(route.charAt(i) == 'N')
                y++;
            else if(route.charAt(i) == 'S')
                y--;
            else if(route.charAt(i) == 'E')
                x++;
            else
                x--; 
        }
        int x2 = x * x;
        int y2 = y * y;
        System.out.println(Math.sqrt(x2+y2));
    }
}
