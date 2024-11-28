class Solution {
    int n,m;
    int []dx = new int[]{0,0,1,-1};
    int []dy = new int[]{1,-1,0,0};
    int [][]dp;
    int [][]grid;
    private boolean isValid(int i, int j, int cost) {
        boolean valid = (Math.min(i,j)>=0 && i<n && j<m && dp[i][j]>cost+grid[i][j]);
        if(valid) dp[i][j]=cost+grid[i][j];
        return valid;
    }
    
    public int minimumObstacles(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        dp = new int[n][m];
        for(int []row:dp)Arrays.fill(row,Integer.MAX_VALUE);
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,0});
        int res = n*m+1;// At most i have to remove all the blockers.
        
        while(!queue.isEmpty()) {
            int thisLevel = queue.size();
            while(thisLevel-->0 ) {
                int []temp = queue.remove();
                int i=temp[0], j=temp[1];
                if(i==n-1 && j == m-1) {
                    res = Math.min(res, temp[2]);
                    continue;
                }
                
                if(temp[2]>dp[i][j]) {
                    // This is invalid path because we have achived better which already might be running in the queue
                    continue;
                }
                
               for(int k=0;k<4;k++) {
                    int newI = i+dx[k], newJ = j+dy[k];
                   
                   // if newi and newj is valid and which is not increasing the cost for newi and newj which already i have achieved.
                    if(isValid(newI, newJ, temp[2])) {
                        queue.add(new int[]{newI, newJ, dp[newI][newJ]});
                    }
                }
            }
        }
        return res;
    }
}