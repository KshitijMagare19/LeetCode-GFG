class Solution {
    public int appendCharacters(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length() && j < t.length(); i++)
            j += s.charAt(i) == t.charAt(j) ? 1 : 0;
        return t.length() - j;
    }
}