class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items,(a,b)->a[0]-b[0]);
        int n=items.length;
        int[] maxbeauty=new int[n];
        maxbeauty[0]=items[0][1];
        for(int i=1;i<n;i++){
            maxbeauty[i]=Math.max(maxbeauty[i-1],items[i][1]);
        }
        for(int i=0;i<queries.length;i++){
            int q=queries[i];
            int left=0;int right=n-1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (items[mid][0] <= q) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }if(right>=0){queries[i]=maxbeauty[right];}
            else{queries[i]=0;}
        }
        return queries;
    }
}