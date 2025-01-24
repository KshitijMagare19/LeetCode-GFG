class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<Integer>();
        int[] visited = new int[graph.length];
        //0 -- unknown
        //1 -- visiting
        //2 -- safe
        
        for (int i = 0; i < graph.length; i++) {
            if (isSafe(i, graph, visited)) {
                res.add(i);
            }
        }
        
        return res;
    }
    
    private boolean isSafe(int index, int[][] graph, int[] visited) {
        if (visited[index] == 2) {
            //this vertex has been visited in previous path, and there is no cycle formed by this vertex
            return true;
        }
        
        if (visited[index] == 1) {
            //this vertex is visiting in current path, there exists a cycle formed by this vertex
            return false;
        }
        
        //this vertex is on visiting path
        visited[index] = 1;
        int[] neighbor = graph[index];
        
        //visit all neighbours, if visit to itself again, there exists cycle
        for (int i = 0; i < neighbor.length; i++) {
            if (!isSafe(neighbor[i], graph, visited)) {
                return false;
            }
        }
        
        //after visiting all neighbours and there is no cycle, mark this vertex to be safe
        visited[index] = 2;
        return true;
    }

}