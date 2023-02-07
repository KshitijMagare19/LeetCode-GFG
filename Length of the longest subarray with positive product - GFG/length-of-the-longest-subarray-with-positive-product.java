//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            int arr[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
             arr[i] = Integer.parseInt(s[i]);
             
            out.println(new Solution().maxLength(arr, n)); 
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    /* Function to return the length of the
       longest subarray with ppositive product */
    int maxLength(int arr[], int n) { 
        //code here
        int maxLen = 0;
            int negCount = 0;
            int prevZero = -1;
            int firstNeg = -1;
            for (int index = 0; index < n; index++)
            {
                // negative value
                if (arr[index] < 0)
                {
                    negCount++;
                    if (firstNeg == -1)
                    {
                        firstNeg = index;
                    }
                }
                // zero -> so fresh start
                if (arr[index] == 0)
                {
                    firstNeg = -1;
                    negCount = 0;
                    prevZero = index;
                }
                //positive value
                else 
                {
                    if (negCount % 2 == 0)
                    {
                        maxLen = Math.max(maxLen,index - prevZero);
                    }
                    else 
                    {
                        maxLen = Math.max(maxLen,index - firstNeg);
                    }
                }
            }
            return maxLen;
    }
   
}