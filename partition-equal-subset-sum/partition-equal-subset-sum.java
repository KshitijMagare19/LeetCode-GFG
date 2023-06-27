class Solution {
    
    boolean subsetSum(int[] nums, int n, int sum, boolean[][]dp){
        for(int i = 0; i < n+1; i++){
	        for(int j = 0; j < sum+1; j++){
	            if(i == 0){
	                dp[i][j] = false;
	            }
	            if(j == 0){
	                dp[i][j] = true;
	            }
	        }
	    }
	    for(int i = 1; i < n+1; i++){
	        for(int j = 1; j < sum+1; j++){
	            if(nums[i-1]<=j){
	                dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
	            }
	            else{
	                dp[i][j] = dp[i-1][j];
	            }
	        }
	    }
	    return dp[n][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for(int i : nums) sum+= i;
        
        if(sum % 2 == 1) return false;

        else{
            sum /= 2;
            boolean[][] dp = new boolean[n + 1][sum + 1];
            return subsetSum(nums,n,sum,dp);
        }
			
    }
}