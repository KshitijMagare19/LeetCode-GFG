class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                ans.add((index+1));
            }
            else{
                nums[index] = nums[index] * -1;
            }
        }
        return ans;
    }
}