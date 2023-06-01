class Solution {
    public String removeTrailingZeros(String num) {
        int i = num.length() - 1, len = num.length();
        while(num.charAt(i)=='0'){
            len--;
            i--;
        }
        return num.substring(0,len);
    }
    
}