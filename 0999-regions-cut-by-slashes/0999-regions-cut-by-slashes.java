class Solution {

    private int solveDFS(int[][] dp, int i, int j) {
        // edge
        if (Math.min(i, j) < 0 || Math.max(i, j) >= dp.length || dp[i][j] != 0) {
            return 0;
        }

        dp[i][j] = 1;
        return (1 + solveDFS(dp, i, j + 1) + solveDFS(dp, i, j - 1)
                + solveDFS(dp, i + 1, j) + solveDFS(dp, i - 1, j));
    }

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;

        int[][] dp = new int[n * 3][n * 3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i].charAt(j) == '/') {
                    dp[i * 3][j * 3 + 2] = dp[i * 3 + 1][j * 3 + 1] = dp[i * 3 + 2][j * 3] = 1;
                } else if (grid[i].charAt(j) == '\\') {
                    dp[i * 3][j * 3] = dp[i * 3 + 1][j * 3 + 1] = dp[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n * 3; i++) {
            for (int j = 0; j < 3 * n; j++) {
                res += solveDFS(dp, i, j) > 0 ? 1 : 0;
            }
        }
        return res;
    }
}