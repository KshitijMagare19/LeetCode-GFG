class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] count = new int[n];
        int[] sum = new int[n];

        dfs1(0, -1, graph, count, sum);
        dfs2(0, -1, graph, count, sum, n);

        return sum;
    }
    private void dfs1(int node, int parent, List<List<Integer>> graph, int[] count, int[] sum) {
        count[node] = 1;

        for (int neighbor : graph.get(node)) {
            if (neighbor != parent) {
                dfs1(neighbor, node, graph, count, sum);
                count[node] += count[neighbor];
                sum[node] += sum[neighbor] + count[neighbor];
            }
        }
    }
    private void dfs2(int node, int parent, List<List<Integer>> graph, int[] count, int[] sum, int n) {
        for (int neighbor : graph.get(node)) {
            if (neighbor != parent) {
                sum[neighbor] = sum[node] - count[neighbor] + (n - count[neighbor]);
                dfs2(neighbor, node, graph, count, sum, n);
            }
        }
    }
}