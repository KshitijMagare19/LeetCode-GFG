class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			int difference = target- nums[i];
            //System.out.println(map);
			if(map.containsKey(difference)) {
				return new int[]{map.get(difference), i};
			}
			map.put(nums[i], i);
            //System.out.println(map);
		}
		return new int[]{};
    }
}