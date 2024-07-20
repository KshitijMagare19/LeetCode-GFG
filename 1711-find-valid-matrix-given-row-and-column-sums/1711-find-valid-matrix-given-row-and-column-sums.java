class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m=rowSum.length;
        int n=colSum.length;
        int result[][]=new int[m][n];
        int r=0;
        int c=0;
        while(r<m&&c<n){
            int min=Math.min(rowSum[r],colSum[c]);
            result[r][c]=min;
            rowSum[r]-=min;
            colSum[c]-=min;
            if(rowSum[r]==0){
                r++;
            }else{
                c++;
            }
        }return result;
    }
}