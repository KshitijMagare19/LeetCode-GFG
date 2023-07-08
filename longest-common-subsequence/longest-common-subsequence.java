class Solution {
    int[][] dp = new int[1001][1001];
    public int lcs(String x, String y, int n, int m){
        if(n == 0 || m == 0) return 0;
        if(dp[n][m] != -1) return dp[n][m];
        else if(x.charAt(n-1) == y.charAt(m-1)) return dp[n][m] = 1 + lcs(x,y,n-1,m-1);
        else return dp[n][m] = Math.max(lcs(x,y,n-1,m),lcs(x,y,n,m-1)); 
    }
    public int longestCommonSubsequence(String x, String y) {
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return lcs(x,y,x.length(),y.length());
    }
}