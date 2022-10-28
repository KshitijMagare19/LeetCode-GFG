class Solution {
    public int reverse(int x) {
        int res = 0, units;
        boolean  isNegative = x < 0;
        if(isNegative) x = Math.abs(x);
       
        while(x > 0) {
            units = x % 10;
            if(res > Integer.MAX_VALUE/10) {
                return 0;
            }
            res = res*10 + units;
            x = x/10;
        }
        if(isNegative) res = -res;
        return res;
        
    }
}