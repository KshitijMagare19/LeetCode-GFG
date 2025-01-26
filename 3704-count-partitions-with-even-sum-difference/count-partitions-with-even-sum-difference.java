class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for(int i : nums) totalSum += i;
        int temp = 0, ans = 0;
        for(int i = 0; i < nums.length - 1 ; i++){
            temp +=nums[i];
            if(Math.abs(temp -(totalSum - temp)) % 2 == 0) ans++;
        }
        return ans;
    }
}