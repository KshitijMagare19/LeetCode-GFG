class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 0;i--){
            int n = ((-1)*nums[i]);
            if(IntStream.of(nums).anyMatch(x -> x == n)) return nums[i];
        }
        return -1;
    }
}