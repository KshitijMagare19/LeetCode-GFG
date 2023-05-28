class Solution {
     public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return canJump(nums, 0, dp);
    }
    
    public boolean canJump(int[] nums, int index, int[] dp) {
        if (index >= nums.length-1) {
            return true;
        } 
        
        if (nums[index] == 0) {
            dp[index] = 0;
            return false;
        }
        
        if (dp[index] != -1){
            return dp[index] == 1;
        } 
        
        int jumps = nums[index];
        for (int i = 1; i <= jumps; i++) {
            if (canJump(nums, index+i, dp)) {
                dp[index] = 1;
                return true;
            }
        }
        
        dp[index] = 0;
        return false;
    }
}