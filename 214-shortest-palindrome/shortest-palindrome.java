class Solution {
    public String shortestPalindrome(String s) {
        String temp = s;
        s += "#" + new StringBuilder(s).reverse().toString();
        int n = s.length();
        int lps[] = new int[n];
        int i = 1;
        int j = 0;
        
        while(i<n){
            if(s.charAt(i)==s.charAt(j)){
                lps[i++] = ++j;
            } else {
                if(j==0){
                    lps[i++]=j;
                } else {
                    j = lps[j-1];
                }
            }
        }
        
        return new StringBuilder(temp.substring(lps[lps.length-1])).reverse().toString()+temp;
    }
}