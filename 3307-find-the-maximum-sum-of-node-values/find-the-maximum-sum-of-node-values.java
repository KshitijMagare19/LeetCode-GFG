class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {

        long res = 0;
        int count = 0;
        long sacrifice = Integer.MAX_VALUE;

        for (int n : nums) {
            res += Math.max(n, n ^ k);

            if ((n ^ k) > n)
                count++;

            sacrifice = Math.min(sacrifice, Math.abs(n - (n ^ k)));
        }

        return res - (count % 2 == 1 ? sacrifice : 0);
    }
}