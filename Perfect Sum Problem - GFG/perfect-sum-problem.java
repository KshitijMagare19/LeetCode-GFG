//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	static int dp[][]=new int[1001][1001];
    public int helper(int arr[],int n, int sum) 
    { 
       if(sum==0&&n==0)
       return dp[n][sum]=1;
       if(n==0)
       return dp[n][sum]=0;
       if(dp[n][sum]!=-1)
       return dp[n][sum];
       if(arr[n-1]>sum)
       return dp[n][sum]=helper(arr,n-1,sum)%1000000007;
       else{
           int include=helper(arr,n-1,sum-arr[n-1]);
           int not_include=helper(arr,n-1,sum);
           return dp[n][sum]=(include+not_include)%1000000007;
       }
    } 
    public int perfectSum(int arr[],int n, int sum) 
    { 
       for(int i=0;i<1001;i++){
           for(int j=0;j<1001;j++)
           dp[i][j]=-1;
       }
       return helper(arr,n,sum);
} 
}