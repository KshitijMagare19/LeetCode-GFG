class Solution {
    public boolean canConstruct(String s, int k) {
        Map<Character, Integer> M = new HashMap<>();
        int Single = 0;

        for (char c : s.toCharArray()) {
            M.put(c, M.getOrDefault(c, 0) + 1);
        }

        for (int freq : M.values()) {
            if (freq % 2 == 1) {
                Single++;
            }
        }

        return Single <= k && k <= s.length();
    }
}