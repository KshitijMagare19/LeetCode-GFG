class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0, i = 0,len = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                i++;
                j++;
                len++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }

         j = 0;
          i = 0;
         int k = 0;
        int[] ans = new int[len];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                
                ans[k++] = nums1[i];
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}