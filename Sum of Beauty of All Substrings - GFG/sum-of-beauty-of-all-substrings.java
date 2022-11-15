//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        // code here
        int ans = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            int[] ar=new int[26];
            for(int j = i ; j < s.length() ; j++) {
                ar[s.charAt(j)-'a']++;
                
                int max = Integer.MIN_VALUE;
                 int min = Integer.MAX_VALUE;
                
                for(int k = 0 ; k < 26 ; k++){ 
                  max=Math.max(max,ar[k]);
                 if(ar[k]!=0) 
                    min=Math.min(min,ar[k]);
                 }
                ans+=max-min;
               
            } 
           
        }
        return ans;
    }
}
        
