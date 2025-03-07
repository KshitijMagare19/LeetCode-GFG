class Solution {
    public int[] closestPrimes(int left, int right) {
        int ans[] = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int count =0;
        for(int i=left;i<=right;i++){
            if(ans[1]-ans[0]==2 || ans[1]-ans[0]==1) break;
            if(isprime(i)){
                if(ans[0]==-1) ans[0]=i;
                else if(ans[1]==-1) ans[1]=i;
                else{
                    ans[0]=ans[1];
                    ans[1] = i;
                }
     }
    }
    if(ans[0]==-1 || ans[1]==-1) return new int[]{-1,-1};
     return ans;
}

    public boolean isprime(int n){
         if(n==2) return true;
         if(n==1 || n%2==0) return false;
         for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}