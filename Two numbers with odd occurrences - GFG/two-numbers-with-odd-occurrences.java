//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int arr[], int N)
    {
        // code here
        int[] ans = new int[2];
        Arrays.sort(arr);
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < N ; i ++){
            set.add(arr[i]);
            if(map.containsKey(arr[i])) map.put(arr[i] , map.get(arr[i])+ 1);
            else map.put(arr[i],1);
            
        }
        //System.out.println(set);
        Integer[] a = new Integer[set.size()];
  
        // Convert LinkedHashSet to Array
        a = set.toArray(a);
        for(int i = set.size() - 1; i >= 0; i--){
            if(map.get(a[i]) % 2 == 1) ans[j++] = a[i];
            if(j == 2 ) break;
        }
        
        if((arr[0] != arr[1]) && j == 1) ans[1] = arr[0]; 
        //System.out.println((arr[0] != arr[1]) && j == 1);
        return ans;
    }
}