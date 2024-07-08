class Solution {
   public int findTheWinner(int n, int k) {
    return helper(n,k)+1;
}
public int helper(int n,int k){
    return (n == 1) ? 0 : (helper(n-1,k)+k)%n;
    // if(n==1)
    //     return 0;
    // else
    //     return (helper(n-1,k)+k)%n ;
}
}