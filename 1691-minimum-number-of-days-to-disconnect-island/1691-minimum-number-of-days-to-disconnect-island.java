class Solution {
    boolean ap; //articulation point
    int time; //visit time
    int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int minDays(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        ap = false;
        time = 0;
        int lands = 0, islands = 0;
        int[][] depth = new int[n][m];
        int[][] low = new int[n][m];
        int[][] parent = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(depth[i], -1);
            Arrays.fill(low[i], -1);
            Arrays.fill(parent[i], -1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    lands++;
                    if (depth[i][j] == -1) {
                        apDFS(grid, i, j, depth, low, parent);
                        islands++;
                    }
                }
            }
        }

        if (islands == 0 || islands >= 2) return 0;
        if (lands == 1) return 1;
        if (ap) return 1;
        return 2;
    }

    private void apDFS(int[][] grid, int i, int j, int[][] depth, int[][] low, int[][] parent) {
        int n = grid.length, m = grid[0].length;
        depth[i][j] = time++;
        low[i][j] = depth[i][j];
        int children = 0;
        for (int k = 0; k < dir.length; k++) {
            int ni = i + dir[k][0];
            int nj = j + dir[k][1];
            if (ni >= 0 && ni < n && nj >= 0 && nj < m && grid[ni][nj] == 1) {
                //valid connection
                if (depth[ni][nj] == -1) {
                    children++;
                    parent[ni][nj] = i*m + j;
                    apDFS(grid, ni, nj, depth, low, parent);
                    low[i][j] = Math.min(low[i][j], low[ni][nj]);
                    if (low[ni][nj] >= depth[i][j] && parent[i][j] > -1) {
                        ap = true;
                    }
                } else if (ni*m + nj != parent[i][j]) {//ignore the incoming path
                    low[i][j] = Math.min(low[i][j], depth[ni][nj]);
                }
            }
        }
        if (parent[i][j] == -1 && children > 1) {
            ap = true;
        }
    }
}