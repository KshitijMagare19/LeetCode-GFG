class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,j=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][j];
            j++;
            }
        j--;
        for(int i=0;i<mat.length;i++){
            if(i==j){
                j--; 
                continue;
            }
            sum+=mat[i][j];
            j--;
        }
        return sum;
    }
}