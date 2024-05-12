class Solution {
    public int[][] largestLocal(int[][] grid) {
      int n = grid.length;
       int [][] res = new int [n-2][n-2];
       for(int i=0; i<n-2;i++){
           for(int j=0; j<n-2;j++){
               res[i][j]= getMaxVal(i,j,grid);
           }
       }
	return res;
   
   }

int getMaxVal(int i, int j, int[][] grid)
{
    int Max = Integer.MIN_VALUE;
    for(int a= i; a<=i+2; a++){
        for(int b= j; b<=j+2; b++){
            Max = Math.max(grid[a][b],Max);                              }
    }    
    return Max;
}}