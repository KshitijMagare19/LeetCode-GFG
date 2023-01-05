//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution
{
    int n = 10000;
    boolean prime[];
    Solution()
    {
        prime = new boolean[n];
        Arrays.fill(prime, true);
        for(int i=2; i<n; i++)
        {
            if(prime[i])
            {
                for(int j=i*i; j<n; j += i)
                {
                    prime[j] = false;
                }
            }
        }
        
    }
    
    private boolean oneDigitDiff(int x, int y)
    {
        int diff = 0;
        
        for(int i=0; i<4; i++)
        {
            if(x%10!=y%10) diff++;
            
            x = x/10;
            y = y/10;
        }
        
        return diff == 1;
    }
    
    private void findAll(int num, ArrayList<Integer> parr, boolean visited[], Queue<Integer> queue)
    {
        for(int i : parr)
        {
            if(visited[i]==false && oneDigitDiff(num, i))
            {
                visited[i] = true;
                queue.add(i);
            }
        }
    }
    
    public int shortestPath(int Num1,int Num2){
        
        if(Num1==Num2) return 0;
        
        ArrayList<Integer> parr = new ArrayList<>();
        
        for(int i=1000; i<n; i++)
        {
            if(prime[i]) parr.add(i);
        }
        
        Queue<Integer> queue = new ArrayDeque<>();
        boolean visited[] = new boolean[n];
        
        int ans = 0;
        visited[Num1] = true;
        queue.add(Num1);
        
        while(!queue.isEmpty())
        {
            int n = queue.size();
            for(int i=0; i<n; i++)
            {
                int x = queue.poll();
                if(x==Num2) return ans;
                
                findAll(x, parr, visited, queue);
            }
            
            ans++;
        }
        
        
        return -1;
    }
}


//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        Solution ob = new Solution();
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int Num1=Integer.parseInt(input_line[0]);
            int Num2=Integer.parseInt(input_line[1]);
            System.out.println(ob.shortestPath(Num1,Num2));
        }
    }
}
// } Driver Code Ends