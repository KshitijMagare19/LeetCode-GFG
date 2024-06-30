class Solution {
    class DisjointSet {
        int[] parent;
        int[] rank;
        int n;
        
        public DisjointSet(int n) {
            this.n = n;
            parent = new int[n+1];
            rank = new int[n+1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }
        
        public int find(int node) {
            while (node != parent[node])
                node = parent[node];
            
            return node;
        }
        
        public boolean merge(int a, int b) {
            int parentA = find(a);
            int parentB = find(b);
            
            if (parentA == parentB) return false;
            
            if (rank[parentA] >= rank[parentB]) {
                parent[parentB] = parentA;
                rank[parentA]++;
            } else {
                parent[parentA] = parentB;
                rank[parentB]++;
            }
            
            return true;
        }
        
        public int countSeparateComponents() {
            int cnt = 0;
            
            for (int i = 1; i <= n; i++) 
                if (parent[i] == i) 
                    cnt++;
            
            return cnt;
        }
    }
    
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        DisjointSet ds = new DisjointSet(n);
        int cnt = n;
        
        for (int[] e : edges) {
            if (e[0] == 3) {
                boolean status = ds.merge(e[1], e[2]);
                if (!status) cnt--;
            }
        }
        
        int[] parentCopy = new int[n+1];
        int[] rankCopy = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parentCopy[i] = ds.parent[i];
            rankCopy[i] = ds.rank[i];
        }
        
        // Let's run for Bob only
        for (int[] e : edges) {
            if (e[0] == 2) {
                boolean status = ds.merge(e[1], e[2]);
                if (!status) cnt--;
            }
        }
        
        if (ds.countSeparateComponents() > 1) {
            return -1;
        } 
        
        ds.parent = parentCopy;
        ds.rank = rankCopy;
        
        // Let's run for Alice only
        for (int[] e : edges) {
            if (e[0] == 1) {
                boolean status = ds.merge(e[1], e[2]);
                if (!status) cnt--;
            }
        }
        
        if (ds.countSeparateComponents() > 1) {
            return -1;
        } 
        
        return n-cnt;
    }
}