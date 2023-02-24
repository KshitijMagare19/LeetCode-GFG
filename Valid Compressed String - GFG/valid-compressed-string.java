//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            String T = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkCompressed(S,T));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkCompressed(String S, String T) {
        // code here
        int i = 0, j = 0, len = 0;
        while(i < S.length()){
            // if both are char
            if(!Character.isDigit(T.charAt(j)) && !Character.isDigit(S.charAt(i))){
                if(S.charAt(i) != T.charAt(j)) return 0;
                i++; j++;
            } else {
                int size = 0;
                while(j<T.length() && Character.isDigit(T.charAt(j))){
                    size = (size*10)+ (int)(T.charAt(j)-'0');
                    j++;
                }
                while(size > 0) {
                    i++;
                    size--;
                }
            }
        }
        //check length
        return S.length() == i ? 1 : 0;
    
    }
}