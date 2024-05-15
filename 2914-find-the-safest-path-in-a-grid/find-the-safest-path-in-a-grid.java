class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
      int n=grid.size();
      int[][]dis=new int[n][n];
      Queue<int[]>q=new ArrayDeque<>();
       
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(grid.get(i).get(j)==1){
                 q.offer(new int[]{i,j,0}); 
                 dis[i][j]=0;
              }
          }
      }
      int[]dr={0,1,0,-1};
      int[]dc={1,0,-1,0};
      while(q.size()>0){
          int[]x=q.poll();
          for(int i=0;i<4;i++){
              int nr=x[0]+dr[i];
              int nc=x[1]+dc[i];
              if(nr>=0&&nc>=0&&nr<n&&nc<n&&grid.get(nr).get(nc)==0&&dis[nr][nc]==0){
                  dis[nr][nc]=x[2]+1;
                  q.offer(new int[]{nr,nc,x[2]+1});
              }
          }
      }
      int l=0;
      int r=n;
      while(l<r){
          int m=(l+r+1)/2;
          if(g(m,dis)){
              l=m;
          }
          else r=m-1;
      }
      return l;
    }
    public boolean g(int t,int[][]dis){
         Queue<int[]>q=new ArrayDeque<>();
         int[][]v=new int[dis.length][dis.length];
         v[0][0]=1;
                  if(t>dis[0][0])return false;
          int[]dr={0,1,0,-1};
      int[]dc={1,0,-1,0};
      q.offer(new int[]{0,0,dis[0][0]});
      while(q.size()>0){
          int[]x=q.poll();
         
          if(x[0]==dis.length-1&&x[1]==dis.length-1)return true;
             for(int i=0;i<4;i++){
              int nr=x[0]+dr[i];
              int nc=x[1]+dc[i];
           
              if(nr>=0&&nc>=0&&nr<dis.length&&nc<dis.length&&dis[nr][nc]>=t&&v[nr][nc]==0){ 
                  
                 v[nr][nc]=1;
                  q.offer(new int[]{nr,nc,dis[nr][nc]});
              }
      }
     
    }
     return false;
}
}