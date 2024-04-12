class Solution {
    public int trap(int[] height) {
        int n = height.length, ans  = 0;
        int[] right = new int[n];
        int[] left = new int[n];
         right[n-1] = height[n-1];
          left[0] = height[0];
        for(int i = 1; i < n; i++){
            //System.out.println(l1 +  " b " + left[i]);
            left[i] = Math.max(height[i],left[i-1]);
            //l1 = left[i];
            //System.out.println(l1 +  " a " + left[i]);
        }
        for(int i = n-2; i >= 0; i--){
            right[i] = Math.max(height[i],right[i+1]);
            //r1 = right[i];
        }
    //    System.out.println(Arrays.toString(right));
    //    System.out.println(Arrays.toString(left));
        for(int i = 0; i < n; i++){
           ans += (Math.min(right[i],left[i]) - height[i]);
        }
        return ans;

    }
}