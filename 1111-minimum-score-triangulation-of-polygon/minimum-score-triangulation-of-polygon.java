class Solution {
    public int mcm(int[] arr, int i, int j,int[][] dp){
	    if(i>=j){
	        return 0;
	    }
	    else if(dp[i][j] != -1){
	        return dp[i][j];
	    }
	    int ans = Integer.MAX_VALUE;
	    for(int k = i; k <= j -1; k++){
	        
	        int tempSolution = mcm(arr,i,k,dp) + mcm(arr,k+1,j,dp) + arr[i-1]*arr[k]*arr[j];
	        ans = Math.min(tempSolution,ans);
	    }
	    dp[i][j] = ans;
	    return dp[i][j];
	}
    public int minScoreTriangulation(int[] values) {
				int n = values.length;
				int[][] dp = new int[n+1][n+1];
				for(int[] row : dp){
						Arrays.fill(row,-1);
				}
        return mcm(values,1,n -1,dp);
    }
}