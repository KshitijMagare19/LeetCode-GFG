class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int len = nums.length;
        Arrays.fill(leftProduct,1);
         Arrays.fill(rightProduct,1);
        for(int i = 1; i < len ; i++){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }
        for(int j=len-2;  j>=0 ; j--){
            rightProduct[j]=rightProduct[j+1]*nums[j+1];
        }
        //System.out.println(Arrays.toString(rightProduct));
        int[] ans = new int[len];
        for(int i = 0; i < len; i++){
            ans[i] = leftProduct[i]*rightProduct[i];
        }
        return ans;
    }
}