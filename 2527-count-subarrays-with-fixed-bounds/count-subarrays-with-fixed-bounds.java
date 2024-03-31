class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0, maxi = -1, mini = -1, badi = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxK || nums[i] < minK) badi = i;
            if(nums[i] == maxK) maxi = i;
            if(nums[i] == minK) mini = i;
            ans += Math.max(0,Math.min(maxi,mini)-badi);
        }
        return ans;
    }
}