//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int n) {
        
        // Your code here
        int ans = 0, flag = 0;
        if (n == 0) return 0;
        int temp = 2;
        String s = Integer.toBinaryString(n);
        for(int i = 1; i < s.length(); i++){
            
            if(s.charAt(i) == s.charAt(i-1)&& s.charAt(i) == '1' && flag == 0){
                ans = 2;
                temp = 2;
                flag = 1;
            }
            else if(s.charAt(i) == s.charAt(i-1) && s.charAt(i) == '1' && flag == 1){
                temp++;
                ans = Math.max(ans, temp);
            }
            else{
                temp = 1;
            }
        }
        if(ans == 0) return 1;
        return ans;
        
    }
}



//{ Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}



// } Driver Code Ends