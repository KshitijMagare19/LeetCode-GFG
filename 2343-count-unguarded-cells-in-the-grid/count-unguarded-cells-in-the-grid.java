class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] flag = new int[m][n];
        for(int[] wall: walls){
            flag[wall[0]][wall[1]]=-1;
        }
        for(int[] guard: guards){
            int row = guard[0];
            int col = guard[1];
            int i=col;
            while(i>=0 && flag[row][i]!=-1 && flag[row][i]!=1){
                flag[row][i]=1;
                i--;
            }
            i=col+1;
            while(i<n && flag[row][i]!=-1 && flag[row][i]!=1){
                flag[row][i]=1;
                i++;
            }
            i=row-1;
            while(i>=0 && flag[i][col]!=-1 && flag[i][col]!=2){
                flag[i][col]=2;
                i--;
            }
            i=row+1;
            while(i<m && flag[i][col]!=-1 && flag[i][col]!=2){
                flag[i][col]=2;
                i++;
            }
        }
        int res=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(flag[i][j]==0){
                    res++;
                }
            }
        }
        return res;
    }
}