class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        
        int max = nums[0], min = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        int range = max - min + 1;
        int[] count = new int[range];
        
        for (int num : nums) {
            count[num - min]++;
        }
        
        int index = 0;
        for (int i = 0; i < range; i++) {
            int freq = count[i];
            if (freq > 0) {
                int value = i + min;
                while (freq-- > 0) {
                    nums[index++] = value;
                }
            }
        }
        
        return nums;
    }
}