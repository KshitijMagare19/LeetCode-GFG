class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0;
        int[] arr = heights.clone();
        Arrays.sort(arr);
        for(int i = 0; i < heights.length; i++){
            if(arr[i] != heights[i]) ans++;
        }
        return ans;
    }
}