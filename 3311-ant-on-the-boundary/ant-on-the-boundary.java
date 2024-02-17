class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int ans = 0, cnt = 0;
        for(int i : nums){
            ans+=i;
            if(ans == 0) cnt++;
        }
        return cnt;
    }
}