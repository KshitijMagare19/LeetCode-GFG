//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.goodStones(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
public static int goodStones(int n, int[] arr) {
        int vis[]=new int[n];
        for(int i=0; i<n; i++){
            if(vis[i]==0) good(i, arr, vis);
        }
        int ans=0;
        for(int i: vis){
            if(i==2) ans++;
        }
        return ans;
}
    private static int good(int i, int arr[], int[] vis){
        int n=arr.length;
        if(i<0 || i>=n) return 2; // safe
        if(arr[i]==0) return 1; // self loop
        if(vis[i]!=0) return vis[i]; // already visited, either safe or unsafe
        vis[i]=1;
        return vis[i]=good(i+arr[i], arr, vis);
    }
}

        
