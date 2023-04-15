//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String s){
        // code here
        Set<Character> set = new HashSet<>();
		int max = Integer.MIN_VALUE;
		int count = 0;
		int start = 0;
		while(start<s.length()) {
		    //System.out.println("set : "+ set + " c : "+s.charAt(start)+ " start : "+ start + " max : "+ max);
			if(set.contains(s.charAt(start))) {
				set.clear();
				count++;
				start = count;
			}else {
				set.add(s.charAt(start));
				start++;
				max = Math.max(max, set.size());
			}
		}
		return max<0?s.length():max;
    }
}