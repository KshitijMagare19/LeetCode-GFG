class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        for(int i = 1; i <= grid[0].length * grid[0].length ;i++){
            if(!set.contains(i)) ans[1]=i;
        }
        return ans;
    }
}