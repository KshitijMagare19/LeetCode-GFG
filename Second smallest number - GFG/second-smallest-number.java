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
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.secondSmallest(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String secondSmallest(int S, int D){
        // code here
        if(S >= D * 9)
			return "-1";

		char[] charAry = new char[D];
		S = S - 1;

		for (int i = D - 1; i > 0; i--) {
			if (S > 9) {
				charAry[i] = (char) (9 + '0');
				S -= 9;
			} else {
				charAry[i] = (char) (S + '0');
				S = 0;
			}
		}

		charAry[0] = (char) (S + 1 + '0');

		int index = D - 1;

		for (int i = D - 1; i >= 0; i--) {
			if (charAry[i] == '9')
				index = i;
			else
				break;
		}
		charAry[index] -= 1;
		charAry[index - 1] += 1;

		return String.valueOf(charAry);
    }
    
}