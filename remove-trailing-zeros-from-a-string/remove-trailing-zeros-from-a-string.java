class Solution {
    public String removeTrailingZeros(String num) {
        int i = num.length() - 1, len = num.length();
        while(num.charAt(i)=='0'){
            len--;
            i--;
        }
        String ans = "";
        for(int j = 0; j < len; j++) ans+=num.charAt(j);
        return ans;
    }
    
}