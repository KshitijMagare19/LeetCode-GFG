class Solution {
    public boolean checkInclusion(String p, String s) {
        int[] cnt = new int[128];
        for (int i = 0; i < p.length(); ++i) {
            cnt[p.charAt(i)]++;
        }
        
        for (int r = 0, l = 0; r < s.length(); ++r) {
            char c = s.charAt(r);
            cnt[c]--;
            while (cnt[c] < 0) { // If number of characters `c` is more than our expectation
                cnt[s.charAt(l)]++;  // Slide left until cnt[c] == 0
                l++;
            }

            if (r - l + 1 == p.length()) { // If we already filled enough `p.length()` chars
                return true;
            }
        }
        return false;
    }
}