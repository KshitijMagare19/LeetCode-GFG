class Solution {
    public String shortestCommonSupersequence(String x, String y) {
        int n = x.length(), m = y.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0 ; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(x.charAt(i-1) == y.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int i = n, j = m;
        String ans = "";
        while(i > 0 && j > 0){
            if(x.charAt(i -1) == y.charAt(j-1)){
                ans+= x.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]){
                    ans+= x.charAt(i-1);
                    i--;
                }
                else{
                    ans+= y.charAt(j-1);
                    j--;
                }
            }
        }
        while(i>0){
            ans+= x.charAt(i-1);
            i--;
        }
        while(j>0){
            ans+= y.charAt(j-1);
            j--;
        }
        String revAns = "";
        for(int k = ans.length()-1; k >=0; k--){
            revAns+=ans.charAt(k);
        }
        return revAns;
    }
}