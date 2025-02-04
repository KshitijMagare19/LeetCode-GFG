class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = nums[0], temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                temp += nums[i];
                ans = Math.max(temp,ans);
            }
            else{
                temp = nums[i];
            }
        }
        return ans;
    }
}