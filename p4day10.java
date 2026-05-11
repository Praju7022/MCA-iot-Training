import java.util.*;
class GraphCycledirected {
    int V;
    List<List<Integer>> adj;

    public GraphCycledirected(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        boolean dfs(int node, boolean[] visited,boolean recstack) {
            visited[node] = true;
            recstack[node] = true;
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    if (dfs(neighbor, visited, recstack)) {
                        return true;
                    }
                } else if (recstack[neighbor]) {
                    return true;
                }
            }
            recstack[node] = false;
            return false;
        

        }
        boolean isCyclic() {
            boolean[] visited = new boolean[V];
            boolean[] recstack = new boolean[V];
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    if (dfs(i, visited, recstack)) {
                        return true;
                    }
                }
            return false;
        }

    }
    
}
