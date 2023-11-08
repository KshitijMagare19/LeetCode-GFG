class Solution {
    public int findChampion(int[][] grid) {
        int k = 0, max = 0, ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1 && i!= j){
                    k++;
                }
            }  
            if(k > max){
                max = k;
                ans = i;
            }
            k = 0;
                 
        }
        return ans;
    }
}