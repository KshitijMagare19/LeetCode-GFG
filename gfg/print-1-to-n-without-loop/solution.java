...// } Driver Code Ends
//User function Template for Java
class Solution
{
  public void printNos(int N)
    {
        //Your code here
        if(N<1) return;
        printNos(N-1);
        System.out.print(N + " ");
            
    }
}