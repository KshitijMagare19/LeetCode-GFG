class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int w = 1, ans = 0, n = colors.length; 
        for (int i = 1; i <= n+k-2; i++) {
            if (colors[i % n] != colors[(i - 1 + n) % n]) {
                w++;
            } else {
                w = 1;
            }
            if (w >= k) {
                ans++;
            }
        }
        return ans;
    }
}