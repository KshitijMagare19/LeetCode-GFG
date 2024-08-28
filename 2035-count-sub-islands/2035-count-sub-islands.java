class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid2.length;
        int m = grid2[0].length;
        boolean[][] visited = new boolean[n][m];
        int answer =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid2[i][j]==1 && !visited[i][j]){
                    // System.out.println(i+" "+j);
                    if(dfs(grid2,grid1,visited,i,j)) answer++;
                }
            }
        }
        return answer;
        
    }
    boolean dfs(int[][] grid2 , int[][] grid1 , boolean[][] visited , int row, int col){

        if(grid1[row][col]==0) return false;
        visited[row][col]=true;
        int[] r = {0,0,1,-1};
        int[] c = {1,-1,0,0};
        boolean flag = true;
        for(int i=0;i<4;i++){

            int rr = row+r[i];
            int cc = col+c[i];
            if(rr>=0 && rr<grid1.length && cc>=0 && cc<grid1[0].length && visited[rr][cc]==false && grid2[rr][cc]==1){
                
                flag = dfs(grid2,grid1,visited,rr,cc) && flag;
            }
        }
        return flag;
    }
}