//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            long L = Long.parseLong(input_line[0]);
            long B = Long.parseLong(input_line[1]);

            Solution ob = new Solution();
            List<Long> ans = new ArrayList<Long>();
            ans = ob.minimumSquares(L, B);
            System.out.print(ans.get(0)+" ");
            System.out.println(ans.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long commanfactor(long A, long B ){

        if(B == 0) return A;

        return commanfactor(B,A%B);

    }

    static List<Long> minimumSquares(long L, long B)

    {

        // code here

        long dim = commanfactor(L,B); //dimension

        long nos = (L*B) / (dim*dim); // No.of squre

        List<Long> ls = new ArrayList<>();

        ls.add(nos);

        ls.add(dim);

        return ls;

    }

}