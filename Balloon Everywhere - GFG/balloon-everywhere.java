//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        String tmp="balon";

        HashMap<Character,Integer> hm=new HashMap<>();

        for(char ch:s.toCharArray()){

            if(hm.containsKey(ch)){

                hm.put(ch,hm.get(ch)+1);

            }

            else hm.put(ch,1);

        }

        int ans=Integer.MAX_VALUE;

        for(char ch:tmp.toCharArray()){

            if(!hm.containsKey(ch)){

                ans=0;

                break;

            }

            else{

                if(ch=='l' || ch=='o')ans=Math.min(ans,hm.get(ch)/2);

                else ans=Math.min(ans,hm.get(ch));

            }

        }

        return ans;
    }
}