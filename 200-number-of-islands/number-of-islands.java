class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean [][] visited = new boolean[m][n];
        int count = 0;
        for (int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(visited[i][j] == false && grid[i][j]=='1'){ //land
                    count ++;
                    fillComp(grid, visited, i, j);
                }
            }
        }
        return count;
    }
    
    public void fillComp(char[][]grid, boolean[][]visited, int i , int j){
        if(i<0|| j<0|| i>= grid.length|| j>= grid[0].length){
            return;
        }
        if(visited[i][j] == true || grid[i][j] == '0' ){ //water
            return;
        }
        visited[i][j]=true;
        fillComp(grid, visited, i+1, j);
        fillComp(grid, visited, i-1, j);
        fillComp(grid, visited, i, j+1);
        fillComp(grid, visited, i, j-1);
    }
}