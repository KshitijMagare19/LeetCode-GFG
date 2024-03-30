class Solution {
    public int subarraysAtMostKDistinct(int[] nums, int k) {
        if(k == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, n = nums.length, ans = 0;
        while(j < n ){
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            while(map.size() > k && i<j){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysAtMostKDistinct(nums,k) - subarraysAtMostKDistinct(nums,k-1);
    }
}