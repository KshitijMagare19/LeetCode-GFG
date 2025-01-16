class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int xor = 0;        
        if(n % 2 != 0) {
            for(int i : nums1) {
                xor ^= i;
            }
        }        
        if(m % 2 != 0) {
            for(int i : nums2) {
                xor ^= i;
            }
        }
        return xor;
    }
}