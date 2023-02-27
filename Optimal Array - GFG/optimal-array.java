//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long arr[]=ob.optimalArray(n,a);
            for(long i:arr){
                out.print(i+" ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


class Solution {
    public long[] optimalArray(int n,int a[])
    {
         int sum1=0,sum2=0;

        long ans[]=new long[n];

        int mid=(n+1)/2;

        int ind=0;

        for(int i=0;i<mid;i++){

            sum1+=a[i];

            if(i*2<n){

                sum2+=a[i*2];

                int diff=((i+1)*a[i])-sum1+((sum2-sum1)-i*a[i]);

                ans[ind++]=diff;

            }

            if(i*2+1<n){

                sum2+=a[i*2+1];

                int diff=((i+1)*a[i])-sum1+((sum2-sum1)-(i+1)*a[i]);

                ans[ind++]=diff;

            }

        }

        return ans;
    }
}
        
