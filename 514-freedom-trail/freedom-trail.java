class Solution {
    int dp[][] ; 
    int helper(int ri , int i , int n){
        int direct = Math.abs(ri-i) ;
        int wrapAround = n - direct ; 

        return Math.min(direct , wrapAround) ;  
    }
    int f(int ri , int ki , String ring , String key){
        if(ki == key.length()) return 0 ; 

        int res = Integer.MAX_VALUE ; 
        if(dp[ri][ki] != -1) return dp[ri][ki] ; 
        for(int i=0;i<ring.length();i++){
            if(key.charAt(ki) == ring.charAt(i)){
                int temp = helper(ri , i , ring.length()) + 1 + f(i,ki+1,ring,key);
                res = Math.min(res , temp) ; 
            }
        }

        return dp[ri][ki] =  res ; 
    }
    public int findRotateSteps(String ring, String key) {
        dp = new int[ring.length()+1][key.length()] ; 
        for(int[] i : dp) Arrays.fill(i,-1) ; 
        return f(0 , 0 , ring , key) ; 
    }
}