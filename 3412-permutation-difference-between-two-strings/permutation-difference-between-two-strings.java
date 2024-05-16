class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            int j = t.indexOf(c);
            if(i > j) ans = ans + i - j;
            else ans = ans + j - i;
        }
        return ans;
    }
}