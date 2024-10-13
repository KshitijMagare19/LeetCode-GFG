class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        List<int[]> ordered = new ArrayList<>();
        for (int k = 0; k < nums.size(); ++k) {
            for (int n : nums.get(k)) {
                ordered.add(new int[]{n, k});
            }
        }

        Collections.sort(ordered, (a, b) -> Integer.compare(a[0], b[0]));

        int i = 0, k = 0;  // i: start of current range, k: count of unique lists covered
        int[] ans = new int[0];   // Array to store the final answer (smallest range)
        Map<Integer, Integer> count = new HashMap<>();  // Map to keep track of number of elements from each list

        // Iterate through the sorted ordered list
        for (int j = 0; j < ordered.size(); ++j) {
            // If this is a new list or increment the count for this list
            if (count.getOrDefault(ordered.get(j)[1], 0) == 0) ++k;
            count.put(ordered.get(j)[1], count.getOrDefault(ordered.get(j)[1], 0) + 1);

            // If we have covered all lists
            if (k == nums.size()) {
                // Shrink the range from the start while maintaining coverage of all lists
                while (count.get(ordered.get(i)[1]) > 1) {
                    count.put(ordered.get(i)[1], count.get(ordered.get(i)[1]) - 1);
                    ++i;
                }

                // Update the answer if this is the first valid range or if it's smaller than the previous range
                if (ans.length == 0 || ans[1] - ans[0] > ordered.get(j)[0] - ordered.get(i)[0]) {
                    ans = new int[]{ordered.get(i)[0], ordered.get(j)[0]};
                }
            }
        }

        return ans; 
    }
}