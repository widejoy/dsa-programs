import java.util.*;

@SuppressWarnings("unchecked")

public class DFS {
    private int V;

    private LinkedList<Integer>[] adj;

    public DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void dfs(int source) {
        boolean[] visited = new boolean[V];
        dfsUtil(source, visited);
    }

    void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (Integer adjacentNode : adj[node]) {
            if (!visited[adjacentNode]) {
                dfsUtil(adjacentNode, visited);
            }
        }

    }

    public static void main(String[] args) {
        DFS graph = new DFS(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("DFS Traversal (starting from vertex 0):");
        graph.dfs(0);
    }
}
