class Solution {
    public int firstIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                if(mid == 0 ||nums[mid] != nums[mid - 1]){
                   return mid; 
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public int lastIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                if(mid == nums.length - 1 ||nums[mid] != nums[mid + 1]){
                   return mid; 
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int n1 = firstIndex(nums,target);
        
        if(n1 == -1) return ans;
        int n2 = lastIndex(nums,target);
        ans[0] = n1;
        ans[1] = n2;
        return ans;
    }
}