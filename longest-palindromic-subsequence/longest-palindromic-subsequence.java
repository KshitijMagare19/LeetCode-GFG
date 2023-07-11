class Solution {
    public int lcs(String x, String y, int n, int m){
        int[][] dp = new int[n+1][m+1];
        for(int i = 0 ; i < n+1; i++){
	        for(int j = 0 ; j < m+1; j++){
	            if(i == 0 || j == 0) dp[i][j] = 0;
	            else if(x.charAt(i-1) == y.charAt(j-1)){
	                dp[i][j] = 1 + dp[i-1][j-1];
	            }
	            else{
	                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    return dp[n][m];
    }
    public int longestPalindromeSubseq(String x) {
        String y = "";
        for(int i = x.length() -1; i >=0 ; i--){
            y+=x.charAt(i);
        }
        System.out.println(x+ " "+ y);
        int n = x.length();
        return lcs(x,y,n,n);
    }
}