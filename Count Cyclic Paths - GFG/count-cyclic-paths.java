//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
	public static int countPaths(int n){
		//code here
		 if(n==1)

      return 0;

  long mod=1000000007;

  long curr=3, prev=0;

  for(int i=3;i<=n;i++)

  {

      long temp=curr;

      curr=(curr*2+prev*3) %mod;

      prev=temp;

  }

  return (int)(curr);
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countPaths(N));
        }
    }
}

// } Driver Code Ends