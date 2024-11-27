
public class Solution {
    private void createAdjList(List<List<Integer>> adj, int n) {
        for (int i = 0; i < n - 1; i++) {
            adj.get(i).add(i + 1);
        }
    }

    private void DFS(int src, List<Integer> topo, boolean[] vis, List<List<Integer>> adj) {
        vis[src] = true;
        for (int neighbor : adj.get(src)) {
            if (!vis[neighbor]) {
                DFS(neighbor, topo, vis, adj);
            }
        }
        topo.add(src);
    }

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        createAdjList(adj, n);

        int[] result = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int u = queries[q][0];
            int v = queries[q][1];
            adj.get(u).add(v);

            // Topological Sort
            List<Integer> topo = new ArrayList<>();
            boolean[] vis = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!vis[i]) {
                    DFS(i, topo, vis, adj);
                }
            }
            Collections.reverse(topo);

            // Shortest Path Calculation
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[0] = 0;

            for (int node : topo) {
                if (dist[node] != Integer.MAX_VALUE) {
                    for (int neighbor : adj.get(node)) {
                        if (dist[neighbor] > dist[node] + 1) {
                            dist[neighbor] = dist[node] + 1;
                        }
                    }
                }
            }

            result[q] = dist[n - 1] == Integer.MAX_VALUE ? -1 : dist[n - 1];
        }
        return result;
    }
}