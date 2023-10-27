class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            set.add(i);
        }
        int ans = nums[0];
        for(int i : set){
            if(map.get(ans) < map.get(i))
                ans = i;
        }
        return ans;
    }
}