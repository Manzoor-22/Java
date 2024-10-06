import java.util.ArrayList;

public class AdjList {
    static class Node{
        int source;
        int destination;
        int weight;

        public Node(int s, int d, int w){
            source = s;
            destination = d;
            weight = w;
        }
    }
    public static void main(String args[]){
        /*
         *      1 ------- 0
         *      |         |
         *      |         |
         *      2 ------- 3
         *                |
         *                |
         *                4
         */
        int V = 5;
        ArrayList<Node>[] graph = new ArrayList[V];        
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Node(0, 1, 5));
        graph[0].add(new Node(0, 3, 5));
        graph[1].add(new Node(1, 0, 5));
        graph[1].add(new Node(1, 2, 5));
        graph[2].add(new Node(2, 1, 5));
        graph[2].add(new Node(2, 3, 5));
        graph[3].add(new Node(3, 1, 5));
        graph[3].add(new Node(3, 4, 5));

        // Get neighbours
        // 2
        for(int i = 0; i < graph[1].size(); i++){
            System.out.println("Source : " + graph[1].get(i).source);   
            System.out.println("Destination : " + graph[1].get(i).destination);   
            System.out.println("Weight : " + graph[1].get(i).weight);   
        }
    }
}
