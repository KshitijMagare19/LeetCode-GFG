//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minOperation(String s) {
        // code here
        int n = s.length();
        // run a loop from half String
        for (int i = n / 2 - 1; i >= 0; --i)
        // check is string same or not
            if (s.substring(0, i + 1).equals(s.substring(i + 1, 2 * (i + 1))))
                return (i + 1) + 1 + (n - 2 * (i + 1));
        return n;
    }
}