class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int i=1;
        for(;i<=x/i;i++) //using division instead of multiplication to avoid integer overflow
            if(x/i==i)  return i;
        return i-1;
    }
}