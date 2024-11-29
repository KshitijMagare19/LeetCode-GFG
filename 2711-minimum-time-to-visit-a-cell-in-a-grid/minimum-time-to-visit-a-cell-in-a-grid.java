class Solution {
    public int minimumTime(int[][] grid) {
    if (grid[0][1] > 1 && grid[1][0] > 1) return -1;
    
    int m = grid.length, n = grid[0].length;
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    boolean[][] visited = new boolean[m][n];
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
    pq.offer(new int[]{grid[0][0], 0, 0});
    
    while (!pq.isEmpty()) {
        int[] curr = pq.poll();
        int time = curr[0], row = curr[1], col = curr[2];
        
        if (row == m - 1 && col == n - 1) return time;
        if (visited[row][col]) continue;
        visited[row][col] = true;
        
        for (int[] dir : dirs) {
            int r = row + dir[0], c = col + dir[1];
            if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c]) continue;
            int wait = ((grid[r][c] - time) % 2 == 0) ? 1 : 0;
            pq.offer(new int[]{Math.max(grid[r][c] + wait, time + 1), r, c});
        }
    }
    return -1;
}}