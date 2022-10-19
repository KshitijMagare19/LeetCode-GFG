class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        double ans = 0;
        int n = nums1.length + nums2.length;
        int i = 0, j = 0;
        int t = 0;
        while(i != nums1.length && j != nums2.length){  
            if(nums1[i] < nums2[j]){
                nums[t] = nums1[i];
                i++;              
            }
            else{
                nums[t] = nums2[j];
                j++;
            }
            t++;
        }
        while(i < nums1.length){
            nums[t] = nums1[i];
            i++;
            t++;
        }
        while(j < nums2.length){
            nums[t] = nums2[j];
            j++;
            t++;
        }
        if(n % 2 == 1){
            return (double)nums[n/2];
        }
        else{
            return ((double)(nums[n/2]+nums[n/2 - 1])/2.00000);
        }
    }
}