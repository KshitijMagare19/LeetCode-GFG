class Solution {
    public int tribonacci(int n) {
        int t0 = 0, t1 = 1, t2 = 1, t3 = 0,temp = 0;
        for(int i = 3; i <= n; i++){
            t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3; 
        }
        if(n <= 1) return n;
        else if(n == 2) return 1;
        else return t3;
    }
}