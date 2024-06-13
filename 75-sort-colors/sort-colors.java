class Solution {
    public void sortColors(int[] nums) {
        int start = 0, middle = 0, end = nums.length - 1;
        while(middle <= end){
            if(nums[middle] == 2){
                nums[middle] = nums[end];
                nums[end] = 2;
                end--;
            }
            else if(nums[middle] == 1){
                middle++;
            }
            else if(nums[middle] == 0){
                nums[middle] = nums[start] ;
                nums[start] = 0;
                start++;
                middle++;
            }
        }

    }
}