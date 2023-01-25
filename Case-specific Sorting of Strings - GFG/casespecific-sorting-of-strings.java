//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        char temp[] = str.toCharArray();
        char ans[] = new char[str.length()];
        
        Arrays.sort(temp);              //--->O(nlogn)
        
        int l = 0;  //lower idex
        int u = 0;  //upper indx
        
        //find first lower case letter
        while(Character.isUpperCase(temp[l]) ){         //---->O(n)
            l++;
        }
        
        
        for(int i=0;i<str.length();i++){                //----->O(n)
            
            char x = str.charAt(i);
            if( Character.isUpperCase(x) )
                ans[i] = temp[u++];
            else
                ans[i] = temp[l++];
                
        }
        
        
        return new String(ans);
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends