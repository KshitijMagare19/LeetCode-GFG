class Solution {
    public int longestCommonSubsequence(String x, String y) {
        int[][] dp = new int[1001][1001];
        int n = x.length();
        int m = y.length();
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j <m+1; j++){
                if(n == 0 || m == 0) dp[i][j] = 0;
            }
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j <m+1; j++){
                if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}