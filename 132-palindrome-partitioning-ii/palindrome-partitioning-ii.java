class Solution {
    // int[][] dp;
    public int minCut(String s) {
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for(int i[]:dp)
        Arrays.fill(i,-1);
        //idk what is the problem, but if i pass character array instead of String and wrote palindrome function inform of character array then it automatically work otherwise 36/37 test cases were passed.
        return solve(s.toCharArray(),0,n-1,dp);
    }
    int solve(char[] s,int i,int j,int[][] dp)
    {
        if(i>=j ||isPalindrome(s,i,j)==true)
        return 0;
        
        if(dp[i][j]!=-1)
        return dp[i][j];

        
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        { 
            if(isPalindrome(s,i,k)){
            int right=0;
            if(dp[k+1][j]==-1)
            right =solve(s,k+1,j,dp);
            else
            right=dp[k+1][j];   
            int temp_ans=1+right;
            ans=Math.min(ans,temp_ans);
            
            }
        }
        dp[i][j]=ans;
        return dp[i][j];
    }
    boolean isPalindrome(char[] str,int i,int j){

       while(i<j)
       {
           if(str[i]!=str[j])
           return false;
           i++;
           j--;
       }
       return true;
    }

}