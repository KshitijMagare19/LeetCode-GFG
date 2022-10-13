class Solution {
     public boolean containsDuplicate(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < nums.length; i++) set.add(nums[i]);
        return set.size() != nums.length;
    }
}