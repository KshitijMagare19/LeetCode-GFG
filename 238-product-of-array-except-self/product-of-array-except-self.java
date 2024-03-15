class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int len = nums.length;
        Arrays.fill(leftProduct,1);
        Arrays.fill(rightProduct,1);
        for(int i = 1,j=len-2; i < len && j>=0 ; i++,j--){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
            rightProduct[j]=rightProduct[j+1]*nums[j+1];
        }
        // for(int ;  j>=0 ; j--){
            
        // }
        //System.out.println(Arrays.toString(rightProduct));
        int[] ans = new int[len];
        for(int i = 0; i < len; i++){
            ans[i] = leftProduct[i]*rightProduct[i];
        }
        return ans;
    }
}