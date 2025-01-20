class Solution {
    public int subarraySum(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            // System.out.println(" start: " + Math.max(0, i - nums[i]) + " || end: "+ i);
            for (int j = Math.max(0, i - nums[i]); j <= i; j++) {
                // System.out.println(" temp : "+ temp +" arr[i]: "+ nums[j]);
                temp += nums[j];
            }
            ans += temp;
            // System.out.println("ans:"+ ans);
        }
        return ans;
    }
}