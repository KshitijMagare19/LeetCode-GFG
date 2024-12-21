import java.util.*;

class Solution {
    private long cnt = 0;

    private void getSubtree(int node, List<List<Integer>> adj, int parent, long[] subtree) {
        if (adj.get(node).size() == 1 && adj.get(node).get(0) == parent) return;
        for (int neighbor : adj.get(node)) {
            if (neighbor != parent) {
                getSubtree(neighbor, adj, node, subtree);
                subtree[node] += subtree[neighbor];
            }
        }
    }

    private void dfs(int node, List<List<Integer>> adj, int parent, long[] subtree, int k) {
        if (adj.get(node).size() == 1 && adj.get(node).get(0) == parent) return;
        for (int neighbor : adj.get(node)) {
            if (neighbor != parent) {
                long parSubtree = subtree[node] - subtree[neighbor];
                long childSubtree = subtree[neighbor];
                if (parSubtree % k == 0 && childSubtree % k == 0) {
                    cnt++;
                    subtree[node] -= subtree[neighbor];
                } else {
                    subtree[neighbor] = subtree[node];
                }
                dfs(neighbor, adj, node, subtree, k);
            }
        }
    }

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        long[] subtree = new long[n];
        for (int i = 0; i < n; i++) subtree[i] = values[i];

        getSubtree(0, adj, -1, subtree);
        dfs(0, adj, -1, subtree, k);

        return (int) (cnt + 1);
    }
}