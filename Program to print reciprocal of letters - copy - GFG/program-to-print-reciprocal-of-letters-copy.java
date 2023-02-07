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
            String reciprocal = ob.reciprocalString(S);
            System.out.println(reciprocal);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        // code here
        String ans = "";
        char a = 'a', z = 'z', A = 'A', Z = 'Z';
        HashMap<Character, Character> map = new HashMap<>();
        int t = 26;
        while(t-->0){
            map.put(a++,z--);
            map.put(A++,Z--);
        }
        for(int i = 0; i < S.length(); i++){
            if(map.get(S.charAt(i)) == null) ans+= S.charAt(i);
            else ans += map.get(S.charAt(i));
        }
        return ans;
    }
}