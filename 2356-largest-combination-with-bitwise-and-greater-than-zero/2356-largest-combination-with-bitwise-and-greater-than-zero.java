class Solution {
        public int largestCombination(int[] A) {
        int res = 0, cur = 0;
        for (int i = 0; i < 30; ++i) {
            cur = 0;
            for (int a : A)
                cur += a >> i & 1;
            res = Math.max(res, cur);
        }
        return res;
    }
}