class Solution {
    boolean isPalindrome(String s){
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        String s2 = s1.reverse().toString();
        return s.equals(s2);
    }
    public String firstPalindrome(String[] words) {
        String s = "";
        for(int i = 0, j = words.length -1; i<(words.length); i++ ,j--){
            if(isPalindrome(words[i])) return words[i];
            //else if(isPalindrome(words[j])) return words[j];
        }
        return s;
    }
}