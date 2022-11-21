class Solution {
    public int findMiddleIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

    int sum = 0; 
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i]; 
    }
    
    int left_sum = 0, right_sum = 0; 
    for (int i = 0; i < nums.length; i++) {
        right_sum = sum - left_sum;
        left_sum += nums[i]; 
        if (left_sum == right_sum) return i;
    }
    return -1;   
    }
}