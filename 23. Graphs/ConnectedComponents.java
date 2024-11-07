import java.util.ArrayList;

public class ConnectedComponents {
    static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            src = s;
            des = d;
        }
    }
    
    public static ArrayList<Edge>[] graph;

    public static void createGraph(int V){
        graph = new ArrayList[V];

        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        int[][] edges = {{0,1},{0,2},{1,2},{3,4}};

        for(int i = 0; i < edges.length; i++){
            graph[edges[i][0]].add(new Edge(edges[i][0], edges[i][1]));
            graph[edges[i][1]].add(new Edge(edges[i][1], edges[i][0]));
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < graph[i].size(); j++){
                Edge curr = graph[i].get(j);
                System.out.println(curr.src + " " + curr.des);
            }
            System.out.println();
        }
    }

    public static void dfs(){
        boolean[] visited = new boolean[graph.length];

        for(int i = 0; i < visited.length; i++){
            if(!visited[i]){
                dfsUtil(visited);
            }
        }

    }

    public static void dfsUtil(boolean[] visited, int curr, int des){
        System.out.print(curr + " ");
        visited[curr] = true; 

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!visited[e.des]){
                dfsUtil(visited, curr, des);
            }
        }
    }

    public static void main(String[] args) {
        createGraph(6);
    }
}
