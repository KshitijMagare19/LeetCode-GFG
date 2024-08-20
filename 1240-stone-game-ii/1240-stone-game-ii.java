 class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] prefixSum = new int[n];
        prefixSum[n - 1] = piles[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            prefixSum[i] = prefixSum[i + 1] + piles[i];
        }
        
        int[][] memo = new int[n][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        
        return dfs(piles, prefixSum, memo, 0, 1);
    }
     private int dfs(int[] piles, int[] prefixSum, int[][] memo, int i, int M) {
        if (i == piles.length) {
            return 0;
        }
        
        if (2 * M >= piles.length - i) {
            return prefixSum[i];
        }
        
        if (memo[i][M] != -1) {
            return memo[i][M];
        }
        
        int maxStones = 0;
        for (int x = 1; x <= 2 * M; x++) {
            int remainingStones = prefixSum[i] - dfs(piles, prefixSum, memo, i + x, Math.max(M, x));
            maxStones = Math.max(maxStones, remainingStones);
        }
        
        memo[i][M] = maxStones;
        return maxStones;
    }
}