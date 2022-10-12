class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/2;
        for(int i = 0; i < nums.length - 1; i = i+2){
            if(nums[i] != nums[i+1]) return false;
        }
        return true;
    }
}