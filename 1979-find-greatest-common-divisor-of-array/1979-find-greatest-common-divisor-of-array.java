class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;
        for(int i = nums[0]; i >=1 ; i--){
            //System.out.println(i);
            if(nums[nums.length - 1] % i == 0 && nums[0] % i == 0){
                //System.out.println(nums[nums.length - 1]);
                ans = i;
                break;
            }
        }
        return ans;
        
    }
}