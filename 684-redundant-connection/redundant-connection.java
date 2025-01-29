class Solution {

    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;

       ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;

            boolean[] visited = new boolean[n];   //reinitializing the `visited` array before we start exploring again
/*
Checking if there is already a path between the two nodes before adding an edge, this way we can identify the additional edge that needs to be removed.
*/
            if (dfs(graph, u, v, visited)) {
                return edge;
            }

            graph.get(u).add(v);            //otherwise add to the graph
            graph.get(v).add(u);
        }
        
        return new int[0];          // returning empty list
    }

    private boolean dfs(ArrayList<ArrayList<Integer>>  graph, int u, int v, boolean[] visited) {

        if (u == v) {               // if src(u) reaches dest(v), then stop thr DFS
            return true;
        }

        visited[u] = true;

        for (int next : graph.get(u)) {
            if (!visited[next]) {
                if (dfs(graph, next, v, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
