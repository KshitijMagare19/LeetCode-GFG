class Solution {
    public boolean findSubarrays(int[] nums) {
        int len = nums.length;
        if(len<=2) return false;
        
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<len-1; i++){
            int sum = nums[i]+nums[i+1];
            if(set.contains(sum)) return true;
            set.add(sum);
        }
        
        return false;
        
    }
}