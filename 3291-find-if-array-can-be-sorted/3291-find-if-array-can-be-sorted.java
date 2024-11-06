class Solution {
    public boolean canSortArray(int[] nums) {
        int lastGroupHigh = 0;
        int high = nums[0];
        boolean bitChange;
        for (int i = 1; i < nums.length; i++) {
            bitChange = countBits(high) != countBits(nums[i]);
            if (bitChange) {
                lastGroupHigh = high;
            }
            if (nums[i] > high) {
                high = nums[i];
            }
            if (nums[i] < lastGroupHigh) {
                return false;
            }
        }
        return true;
    }

    private int countBits(int number) {
        int count = number % 2;
        while (number != 0) {
            number = (number >> 1);
            if (number % 2 == 1) {
                count++;
            }
        }
        return count;
    }

}