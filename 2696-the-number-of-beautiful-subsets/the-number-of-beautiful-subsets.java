class Solution {
    List<List<Integer>> list = new ArrayList<>();

    // BACKTRACKING
    private void solveBacktrack(int[] nums, int idx, int k, List<Integer> i_list) {
        // Base Case
        if (idx >= nums.length) {
            if (i_list.size() > 0) {
                list.add(i_list);
            }
            return;
        }

        // take it
        if (!(i_list.contains(nums[idx] - k))) {
            // Backtracking...
            i_list.add(nums[idx]);
            solveBacktrack(nums, idx + 1, k, i_list);
            i_list.remove(i_list.size() - 1);
        }

        // non-take
        solveBacktrack(nums, idx + 1, k, i_list);
    }

    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);

        solveBacktrack(nums, 0, k, new ArrayList<>());
        return list.size();
    }
}