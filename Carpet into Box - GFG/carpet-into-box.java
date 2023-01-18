//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int solve(int a, int b, int c, int d) { 
        //code here
        int count = 0;
        while(a > c) {
            a /= 2;
            count++;
        } 
    
        while(b > d) {
            count++;
            b /= 2;
        }
        
        return count;
    }
    int carpetBox(int a, int b, int c, int d){
        return Math.min(solve(a,b,c,d), solve(b,a,c,d));
        
    }
   
}
