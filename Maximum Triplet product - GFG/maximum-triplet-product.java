//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        long ans = Long.MIN_VALUE;
        ans = Math.max(ans,arr[0]*arr[1]*arr[n-1]);
        ans = Math.max(ans,arr[n-3]*arr[n-2]*arr[n-1]);
        ans = Math.max(ans,arr[0]*arr[1]*arr[n-1]);
        ans = Math.max(ans,arr[0]*arr[1]*arr[n-1]);
        ans = Math.max(ans,arr[0]*arr[1]*arr[n-1]);
        ans = Math.max(ans,arr[0]*arr[1]*arr[n-1]);
        return ans;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    Long[] arr = new Long[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Long.parseLong(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    Long res = obj.maxTripletProduct(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}


// } Driver Code Ends