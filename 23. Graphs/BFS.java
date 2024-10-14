import java.util.*;

public class BFS {
    static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w){
            source = s;
            destination = d;
            weight = w;
        }
    }
    public static ArrayList<Edge>[] graph;
        
    public static void createGraph(int V){
 
        /*       1 ----- 3
         *    /          | \
         * 0             |  5
         *    \          | / \
         *       2 ----- 4    6
         */      
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 5));
        
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 5));
        
        graph[1].add(new Edge(2, 0, 5));
        graph[1].add(new Edge(2, 4, 5));
        
        graph[1].add(new Edge(3, 4, 5));
        graph[1].add(new Edge(3, 5, 5));
        graph[1].add(new Edge(3, 1, 5));
        
        graph[1].add(new Edge(4, 2, 5));
        graph[1].add(new Edge(4, 3, 5));
        graph[1].add(new Edge(4, 5, 5));
        
        graph[1].add(new Edge(5, 3, 5));
        graph[1].add(new Edge(5, 4, 5));
        graph[1].add(new Edge(5, 6, 5));
    }

    public static void bfs(ArrayList<Edge>[] graph, int start){
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            int removed = q.remove();
            
            if(!visited[removed]){
                System.out.print(removed + " ");
                visited[removed] = true;
                for(int i = 0; i < graph[removed].size(); i++){
                    Edge e = graph[removed].get(i);
                    q.add(e.destination);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        graph = new ArrayList[V];
        createGraph(V);

        bfs(graph, 2);
    }
}
