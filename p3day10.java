import java.util.*;
class Dijkstar_Alogrithum {
    static class Pair {
        int node, distance; 
        public Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
    public static void p3day10(int V, List<List<Pair> adj, int source) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        dist[source] = 0;
        pq.add(new Pair(source, 0));
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int v = current.node;
            for (Pair neighbor : adj.get(v)) {
                int u = neighbor.node;
                int weight = neighbor.distance;
                if (dist[v] + weight < dist[u]) {
                    dist[u] = dist[v] + weight;
                    pq.add(new Pair(u, dist[u]));
                }
            }
        }
        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + ": " + dist[i]);
        }
    }
    public static void main(String[] args) {
        int V = 5;
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Pair(1, 10));
        adj.get(0).add(new Pair(2, 5));
        adj.get(1).add(new Pair(3, 1));
        adj.get(2).add(new Pair(1, 3));
        adj.get(2).add(new Pair(3, 9));
        adj.get(2).add(new Pair(4, 2));
        
        int source = 0;
        dijkstra (V, adj, source);
    }
}