class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String s1 = goal + goal;
        return s1.contains(s);
    }
}