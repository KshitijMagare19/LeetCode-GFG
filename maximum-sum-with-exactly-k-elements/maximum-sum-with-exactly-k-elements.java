class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, n = 0;
        while(n<k){
            ans += nums[nums.length - 1];
            ans += n++;
        }
        return ans;
    }
}