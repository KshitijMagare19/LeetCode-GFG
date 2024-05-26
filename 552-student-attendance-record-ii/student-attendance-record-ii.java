class Solution {
    public int checkRecord(int n) {
        int maxConsecutiveLates = 2;
        int maxTotalAbsents = 1;
        Long[][][] dp = new Long[n + 1][maxConsecutiveLates + 1][maxTotalAbsents + 1];
        long mod = 1000000007;
        long ans = (possibleWays(n, maxConsecutiveLates, maxTotalAbsents, dp));
        System.out.println(ans);
        return (int)(possibleWays(n, maxConsecutiveLates, maxTotalAbsents, dp) % mod);
    }
    private long possibleWays(int days, int maxConsecutiveLates, int maxTotalAbsents, Long[][][] dp) {
        if (days <= 0) {
            return 1L;
        }
        if(maxConsecutiveLates < 0 || maxTotalAbsents < 0) {
            return 0;
        }
        if (dp[days][maxConsecutiveLates][maxTotalAbsents] != null) {
            return dp[days][maxConsecutiveLates][maxTotalAbsents];
        }
        long ans = possibleWays(days - 1, 2, maxTotalAbsents, dp);
        long mod = 1000000007;
        if(maxConsecutiveLates > 0) {
            ans = (ans + possibleWays(days - 1, maxConsecutiveLates - 1, maxTotalAbsents, dp)) % mod;
        }
        if(maxTotalAbsents > 0) {
            ans = (ans + possibleWays(days - 1, 2, maxTotalAbsents - 1, dp)) % mod;
        }
        return dp[days][maxConsecutiveLates][maxTotalAbsents] = ans;
    }
}