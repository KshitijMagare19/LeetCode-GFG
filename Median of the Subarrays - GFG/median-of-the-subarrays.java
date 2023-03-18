//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.countSubarray(N, A, M); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long solve(int[] A,int N,int M)
    {HashMap<Integer,Integer> map=new HashMap<>();
        int cur=0;
        long tot=0,ans=0;
        
        map.put(cur,1);
        
        for(int i=0;i<N;i++)
        {
            int x;
            if(A[i]>=M) x=1;
            else x=-1;
            
            if(x==-1) tot-=map.getOrDefault(cur-1,0);
            else tot+=map.getOrDefault(cur,0);
            
           // System.out.println(tot);
            
            cur+=x;
            ans+=tot;
            map.put(cur,map.getOrDefault(cur,0)+1);
        }
        
            return ans;
    }
    public long countSubarray(int N,int[] A, int M) {
        long v1=solve(A,N,M);
        long v2=solve(A,N,M+1);
        
            return (v1-v2);
    }
} 