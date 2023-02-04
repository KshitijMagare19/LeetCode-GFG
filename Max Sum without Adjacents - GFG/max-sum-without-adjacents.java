//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     int findMaxSum(int arr[], int n) {

        int dp[] = new int[n+1];

        Arrays.fill(dp,-1);

        return recur(0,arr,dp);

    }

    int recur(int i, int arr[],int dp[]){

        // base case

        if(i>=arr.length) return 0;

        if(dp[i]!=-1) return dp[i];

    

        int pick = arr[i]+recur(i+2,arr,dp);

        int notpick = recur(i+1,arr,dp);

        

        return dp[i]=Math.max(pick,notpick);

    }
}