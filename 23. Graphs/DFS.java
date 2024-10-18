import java.util.ArrayList;

public class DFS {
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
    
    public static ArrayList<Edge>[] graph = new ArrayList[7];
    
    public static void createGraph(){
        /*       1 ----- 3
         *    /          | \
         * 0             |  5
         *    \          | / \
         *       2 ----- 4    6
         */ 

        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));
        
        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 0));
        
        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));
        
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));
        
        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));
        
        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));
        
        graph[6].add(new Edge(6, 5, 0));
    }

    public static void main(String[] args) {
        createGraph();

        boolean[] visited = new boolean[graph.length];
        
        dfs(4, visited);
    }

    public static void dfs(int curr, boolean[] visited){
        if(visited[curr] == true)
            return;

        System.out.print(curr + " ");
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            int edges = graph[curr].get(i).destination;
            dfs(edges, visited);
        }
    }
}
