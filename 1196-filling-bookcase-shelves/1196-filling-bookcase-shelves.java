class Solution {
    int n;
    int width;
    int[][] dp = new int[1001][1001];
    public int solve(int[][] books,int index, int remWidth, int maxHeight){
        if(index >= n) return maxHeight;
        if(dp[index][remWidth] != -1) return dp[index][remWidth];
        int bookW = books[index][0];
        int bookH = books[index][1];
        
        int keep = Integer.MAX_VALUE;
        int skip = Integer.MAX_VALUE;
        //keep
        if(remWidth >= bookW){
            keep = solve(books,index+1,remWidth-bookW,Math.max(maxHeight,bookH));
        }
        //skip
        skip = maxHeight + solve(books,index+1,width-bookW,bookH);
        dp[index][remWidth] = Math.min(skip,keep);

        return dp[index][remWidth];
    }

    public int minHeightShelves(int[][] books, int shelfWidth) {
        n = books.length;
        width = shelfWidth;
        for (int[] row : dp) 
            Arrays.fill(row, -1);
        return solve(books,0,shelfWidth,0);
    }
}