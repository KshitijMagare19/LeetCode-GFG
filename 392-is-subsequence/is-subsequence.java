class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0, i = 0;
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        while(index < s.length() && i < t.length()){
            if(s.charAt(index) == t.charAt(i)) index++;
            i++;
        }
        return index == s.length();
    }
}