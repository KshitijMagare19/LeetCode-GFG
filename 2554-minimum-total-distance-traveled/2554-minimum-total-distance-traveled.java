class Solution {
    Long[][] dp;
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);  // sorting robot based on position
        Arrays.sort(factory,(a,b)->(a[0]-b[0])); // sorting factory based on position
        dp = new Long[robot.size()+1][factory.length+1];
        return solve(robot,factory,0,0);
    }
    
    public long solve(List<Integer> list,int[][] arr,int i,int j){
        
        if(i>=list.size()) return 0L;  // if all robot are repaired then there is no robot left to repair so return 0.
        if(j>=arr.length) return Long.MAX_VALUE; // here we check if there is no factory left for rapair robot but we have some robot to repair because we didnt pass on first condition.
        
        if(dp[i][j]!=null) return dp[i][j]; // checking memo for already calculated result.
        
        long x = 0;
        long res = solve(list,arr,i,j+1); // option 1 - no robot will repair on jth factory

		// here we check that ... from i to k will repair on jth factory and other will check with recurstion.... 
		// for k, we will check all possible index from i+1 to array.length
        for(int k = i;k<list.size() && k-i+1<=arr[j][1];k++){
            x += Math.abs(list.get(k)-arr[j][0]);
            long p = solve(list,arr,k+1,j+1);
			
			//p!=maxValue because of maxValue means there is no possible way to repair all robot with that 
            if(p!=Long.MAX_VALUE){
                res = Math.min(res,x+p);
            }
        }
        
        return dp[i][j] = res;
    }
    
}