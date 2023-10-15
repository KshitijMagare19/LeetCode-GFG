class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        
        int[] ans = new int[2];
        Arrays.fill(ans,-1);
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if((Math.abs(i - j) >= indexDifference)&&(Math.abs(nums[i] - nums[j]) >= valueDifference)){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        if((nums.length == 1) && (nums[0] == 0) && (indexDifference==0)){
            Arrays.fill(ans,0);
        }
        if((indexDifference==0) && (valueDifference==0)){
            Arrays.fill(ans,0);
        }
        return ans;
     }
}