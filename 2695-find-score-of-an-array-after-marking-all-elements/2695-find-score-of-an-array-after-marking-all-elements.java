import java.util.*;

class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        
        // Create a list of pairs (value, index)
        List<int[]> sortedNums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedNums.add(new int[] {nums[i], i});
        }

        // Sort the list based on the value in each pair
        Collections.sort(sortedNums, (a, b) -> Integer.compare(a[0], b[0]));
        
        long score = 0;  // Use long to avoid overflow
        
        // Iterate through the sorted array
        for (int i = 0; i < n; i++) {
            int num = sortedNums.get(i)[0];
            int idx = sortedNums.get(i)[1];
            
            if (nums[idx] != -1) {  // Process only if not already marked
                score += num;  // Add the value to the score
                nums[idx] = -1;  // Mark the current index as processed
                if (idx > 0) {
                    nums[idx - 1] = -1;  // Mark the left neighbor as processed
                }
                if (idx < n - 1) {
                    nums[idx + 1] = -1;  // Mark the right neighbor as processed
                }
            }
        }
        
        return score;
    }
}