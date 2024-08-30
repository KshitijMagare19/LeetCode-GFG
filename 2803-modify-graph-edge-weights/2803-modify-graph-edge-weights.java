class Solution {
    public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) {
        int adj[][] = new int[n][n];
        for(int i [] :edges){
            int a = i[0];
            int b = i[1];
            int w = i[2];
            adj[a][b] = w;
            adj[b][a] = w;
        }
        Pair shortestPath = findPath(adj, source, destination, target); 
        if(shortestPath == null){
            return new int[][]{};
        }else if(shortestPath.w == target){
            return fill(adj);
        }else{
            while(true){
                int []curr = findFirstModifieableIndex(shortestPath.parent, destination, source, adj);
                if(curr == null){
                    return new int[][]{};
                }
                adj[curr[0]][curr[1]] = target-shortestPath.w+1;
                adj[curr[1]][curr[0]] = target-shortestPath.w+1;
                shortestPath = findPath(adj,source,destination, target);
                if(shortestPath.w == target){
                    return fill(adj);
                }else if(shortestPath.w>target){
                    return new int[][]{};
                }
            }
        }    
    }
    
    int[] findFirstModifieableIndex(int []parent, int dest, int source, int adj[][]){
        List<Integer> list = new ArrayList<>();
        int curr = dest;
        while(curr!=-1){
            list.add(curr);
            curr = parent[curr];
        }
        Collections.reverse(list);
        for(int i = 0;i<list.size()-1;i++){
            int v = list.get(i);
            int v2 = list.get(i+1);
            if(adj[v][v2]==-1){
                return new int[]{v,v2};
            }
        }
        return null;
    }
    
    
    int[][] fill(int [][] adj){
        int n = adj.length;
        List<int[]> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(adj[i][j]!=0){
                    int c = adj[i][j];
                    if(c==-1){
                        c = 1;
                    }
                    list.add(new int[]{i,j,c});
                }
            }
        }
        int res[][] = new int[list.size()][3];
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
    Pair findPath(int[][] adj, int source, int destination, int target){
        int n = adj.length;
        int dist[] = new int[n];
        int parent[] = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(parent,-1);
        dist[source ] = 0;
        parent[source] = -1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{source,dist[source]});
        while(!pq.isEmpty()){
            int curr [] = pq.poll();
            int c = curr[0], w = curr[1];
            if(w>target){
                
                return null;
            }
            if(c==destination){
                return new Pair(w,parent);
            }
            for(int i = 0;i<n;i++){
                if(adj[c][i] != 0 ){
                    int nw = adj[c][i];
                    if(nw == -1){
                        nw = 1;
                    }
                    if(nw + w < dist[i]){
                        dist[i] = nw+w;
                        parent[i] = c;
                        pq.offer(new int[]{i, dist[i]});
                    }
                }
            }
        }
        return null;
    }
    class Pair{
        int w;
        int[] parent;
        Pair(int w, int [] parent){
            this.w = w;
            this.parent = parent;
        }
    }
}