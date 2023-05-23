class Solution {
    public String makeSmallestPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        int ans = 0;
        char[] ch = s.toCharArray();
        for(; start <= (s.length()/2) && start!=end;start++, end--){
            if(s.charAt(start) != s.charAt(end)){
                if(s.charAt(start) > s.charAt(end)){
                    ch[start] = ch[end];
                }
                else{
                    ch[end] = ch[start];
                }
            }
        }
        return String.valueOf(ch);
    }
}