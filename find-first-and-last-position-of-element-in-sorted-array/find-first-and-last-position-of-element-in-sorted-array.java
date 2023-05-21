class Solution {
    public int firstIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid] != arr[mid - 1]){
                    return mid;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public int lastIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                if(mid == (arr.length - 1) || arr[mid] != arr[mid + 1]){
                    return mid;
                }
                else{
                    start = start + 1;
                }
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstIndex(nums,target);
        ans[1] = lastIndex(nums,target);
        return ans;
    }
}