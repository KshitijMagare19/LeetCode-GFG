class Solution {
    int[][] dp = new int[1001][1001]; 
    
    int solve(int currA, int copy, int n){
        if(currA == n){
            return 0;
        }
        
        if(currA > n){
            return 1001;
        }
        if(dp[currA][copy] != -1){
            return dp[currA][copy] ;
        }

        int CACC = 1 + 1 + solve(2*currA, currA, n);

        int CV = 1 + solve(currA + copy, copy, n);

        return dp[currA][copy] = Math.min(CACC, CV);

    }
    public int minSteps(int n) {
        //bottom up DP
        // if(n == 1)  return 0;

        // for(int[] i :dp){
        //     Arrays.fill(i,-1);
        // }

        // return 1 + solve(1,1,n);
        int ans=0;
        if(n == 1) return 0;
        for (int i=2;i*i<=n;){
            if(n%i==0){
                 ans+=i;
                n/=i; 
            }else{
              i++;
            }
        }
        if(n!=1){
            ans+=n;
        }
        return ans;
    }
}

