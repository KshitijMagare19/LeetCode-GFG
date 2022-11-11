class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        Arrays.sort(nums);
        int k = 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i] != nums[i-1]) nums[k++] = nums[i];
        }
        return set.size();
    }
}