class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < w1.length() || i < w2.length(); ++i) {
            if (i < w1.length())
                res.append(w1.charAt(i));
            if (i < w2.length())
                res.append(w2.charAt(i));
        }
        return res.toString();
    }
}