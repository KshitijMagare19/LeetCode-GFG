class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i : nums) sum+=i;
        if((sum + target)%2 == 1) return 0;
        int s1 = (sum + target)/2;
        if(s1<0) return 0;
        int n = nums.length;
        int[][] dp = new int[n+1][s1+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < s1+1; j++){
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 1;
            }
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 0; j < s1+1; j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j-nums[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][s1];
    }
}