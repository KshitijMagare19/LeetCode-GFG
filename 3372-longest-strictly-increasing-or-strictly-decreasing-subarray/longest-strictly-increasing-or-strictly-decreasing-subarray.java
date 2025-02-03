class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int dec = 1, inc = 1,temp =1;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i-1] > nums[i]){
                temp++;
                dec = Math.max(temp,dec);
            }
            else{
                temp = 1;
            }
        }
        temp = 1;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i-1] < nums[i]){
                temp++;
                inc = Math.max(temp,inc);
            }
            else{
                temp = 1;
            }
        }
        return Math.max(inc,dec);
    }
}