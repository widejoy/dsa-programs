import java.util.*;

public class bfs {
    private int V;
    private LinkedList<Integer>[] adj;

    public bfs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void bfsa(int source) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (Integer adjacentNode : adj[node]) {
                if (!visited[adjacentNode]) {
                    visited[adjacentNode] = true;
                    queue.add(adjacentNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs graph = new bfs(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("BFS Traversal (starting from vertex 0):");
        graph.bfsa(0);
    }
}
