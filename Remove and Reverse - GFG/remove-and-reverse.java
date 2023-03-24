//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
          
            String S = read.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.removeReverse(S); 
            System.out.println(ans);
        }
    } 
} 

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    String ans = "";
    String removeReverse(String S) 
    { 
        // code here
        int i=0,j=S.length()-1;
        
        int[] map=new int[26]; Arrays.fill(map,0);
        boolean flag=true;
        int cnt=0;
        
        
        for(char ch:S.toCharArray()) map[ch-'a']++;
        
        String begin="",end="";
        
        while(i<=j)
        {
            char ch;
            if(flag) ch=S.charAt(i++);
            else ch=S.charAt(j--);
            
            if(map[ch-'a']>1)
            {
                map[ch-'a']--;
                cnt++;
                flag=!flag;
            }
            else
            {
                if(flag) begin+=ch;
                else end=ch+end;
            }
        }
        
        StringBuffer ans=new StringBuffer(begin+end);
        
        if(cnt%2==1) ans.reverse();
        
            return ans.toString();
    }
} 

//{ Driver Code Starts.

// } Driver Code Ends