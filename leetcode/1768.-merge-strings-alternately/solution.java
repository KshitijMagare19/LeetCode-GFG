class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i = 0, j = 0, k = 0;
        int len = Math.min(word1.length(),word2.length());
        for(;i<len;i++){
            ans+=word1.charAt(k++);
            ans+=word2.charAt(j++);
        }
        if(word1.length() > word2.length()) ans+= word1.substring(k);
        else ans+= word2.substring(j);
        return ans;
    }
}