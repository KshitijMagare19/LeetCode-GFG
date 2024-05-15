class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < word.length(); i++) set.add(word.charAt(i));
        for(char c:set)if(set.contains((char)(c + 32))) ans++;     
        return ans;
    }
}