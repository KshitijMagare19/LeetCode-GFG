//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[]=in.readLine().trim().split(" ");
            String a = s[0];
            String b = s[1];
            Solution g = new Solution();
            if(g.isScramble(a,b)){
                out.println("Yes");
            }
            else{
                out.println("No");
            }
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static HashMap<String,Boolean> map=new HashMap<>();

    

    static boolean isScramble(String s1,String s2)

    {

        //code here

         if(s1.equals(s2))

        {

            return true;

        }

             

        String key=s1+"_"+s2;

        if(map.containsKey(key))

        {

            return map.get(key);

        }

        boolean flag=false;

        int n=s1.length();

        for(int i=1;i<n;i++)

        {

             boolean swap=(isScramble(s1.substring(0, i),s2.substring(n - i,n)) && isScramble(s1.substring(i, n),s2.substring(0, n-i)));

         

            boolean noswap=(isScramble(s1.substring(0, i),s2.substring(0, i))  && isScramble(s1.substring(i, n),s2.substring(i, n)));

            

            if(noswap||swap)

            {

                flag=true;

                break;

            }

        }

        map.put(key,flag);

        return flag;

    }


}
