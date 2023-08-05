class Solution {
    int[][] dp = new int[101][10001];
    public int solve(int e, int f){
        if(f == 0 || f == 1 || e == 1){
            return f;
        }
        if(dp[e][f] != -1){
            return dp[e][f];
        }
        int l = 1, r = f;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int low = 0, high = 0;
            int k = (l+r)/2;
            if(dp[e-1][k-1] != -1){
                low = dp[e-1][k-1];
            }
            else{
                low = solve(e-1,k-1);
                dp[e-1][k-1] = low;
            }
            if(dp[e][f-k] != -1){
                high = dp[e][f-k];
            }
            else{
                high = solve(e,f-k);
                dp[e][f-k] = high;
            }
            int temp = 1 + Math.max(high,low);
            ans = Math.min(ans,temp);
            if(low < high){
                l = k+1;
            }
            else{
                r = k-1;
            }
        }
        dp[e][f] = ans;
        return ans;
    }
    public int twoEggDrop(int f) {
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return solve(2,f);
    }
}