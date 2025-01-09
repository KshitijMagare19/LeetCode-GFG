class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0; 
        for(String s : words) if(s.startsWith(pref)) ans++;
        return ans;
    }
}