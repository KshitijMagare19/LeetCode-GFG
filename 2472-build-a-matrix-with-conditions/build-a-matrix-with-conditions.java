class Solution {
    public List<Integer> topologicalOrder(int k, List<List<Integer>> gr) {
        int[] indeg = new int[k + 1];
        for (int node = 1; node <= k; node++) {
            for (int child : gr.get(node)) {
                indeg[child]++;
            }
        }
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] vis = new boolean[k + 1];
        for (int node = 1; node <= k; node++) {
            if (indeg[node] == 0) {
                q.add(node);
            }
        }

        List<Integer> topoSort = new ArrayList<>();
        while (!q.isEmpty()) {
            int sz = q.size();
            while (sz-- > 0) {
                int node = q.poll();
                vis[node] = true;
                topoSort.add(node);

                for (int child : gr.get(node)) {
                    if (!vis[child]) {
                        indeg[child]--;
                        if (indeg[child] == 0) {
                            q.add(child);
                        }
                    }
                }
            }
        }
        for (int node = 1; node <= k; node++) {
            if (indeg[node] != 0) {
                return new ArrayList<>();
            }
        }
        return topoSort;
    }

    public List<List<Integer>> buildGraph(int k, int[][] conditions) {
        List<List<Integer>> gr = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            gr.add(new ArrayList<>());
        }

        for (int[] condition : conditions) {
            int u = condition[0], v = condition[1];
            gr.get(u).add(v);
        }
        return gr;
    }

    public void fillTopoArray(int k, List<Integer> rowTopo) {
        Set<Integer> vis = new HashSet<>(rowTopo);

        for (int el = 1; el <= k; el++) {
            if (!vis.contains(el)) {
                rowTopo.add(el);
            }
        }
    }

    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<List<Integer>> rowGr = buildGraph(k, rowConditions);
        List<List<Integer>> colGr = buildGraph(k, colConditions);

        List<Integer> rowTopo = topologicalOrder(k, rowGr);
        List<Integer> colTopo = topologicalOrder(k, colGr);

        if (rowTopo.isEmpty() || colTopo.isEmpty()) {
            return new int[0][0];
        }

        fillTopoArray(k, rowTopo);
        fillTopoArray(k, colTopo);

        Map<Integer, Integer> colInd = new HashMap<>();
        for (int j = 0; j < k; j++) {
            colInd.put(colTopo.get(j), j);
        }

        int[][] ans = new int[k][k];
        for (int i = 0; i < k; i++) {
            ans[i][colInd.get(rowTopo.get(i))] = rowTopo.get(i);
        }
        return ans;
    }
}