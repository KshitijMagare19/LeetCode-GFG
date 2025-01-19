class Solution {

    public int trapRainWater(int[][] heightMap) {
        int m=heightMap.length;
        int n=heightMap[0].length;
        boolean[][] visited=new boolean[m][n];

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

        //Set the boundary element as visited
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==m-1 || j==0 || j==n-1){
                    pq.add(new int[]{heightMap[i][j], i, j});
                    visited[i][j]=true;
                }
            }
        }


        int[][] direction={ {0,1}, {0,-1}, {1,0}, {-1,0} };

        int waterVolume=0;

        //Applying the BFS Traversal
        while(!pq.isEmpty()){
            int[] arr=pq.poll();
            int cv=arr[0];    //Curr value
            int cr=arr[1];    //Curr row
            int cc=arr[2];    //Curr column

            //Visiting the adjacent elemetns of current element
            for(int[] dir:direction){
                int nr=cr+dir[0];   //New row
                int nc=cc+dir[1];   //New column    

                // Checking the element is within row, column and not visited
                if(nr>=0 && nr<m && nc>=0 && nc<n && !visited[nr][nc]){
                    
                    //volume of water it can trap after raining.
                    if(cv-heightMap[nr][nc]>0){
                        waterVolume+=cv-heightMap[nr][nc];
                        pq.add(new int[]{cv, nr, nc});
                    }
                    else{
                        pq.add(new int[]{heightMap[nr][nc], nr, nc});
                    }

                    visited[nr][nc]=true;
                }
                
            }
        }

        return waterVolume;
    }

}             