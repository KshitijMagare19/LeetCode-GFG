class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        int[] ans = new int[nums.length];
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        // System.out.println(map);
        
        int index = 0;
         for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            while(freq-->0){
                ans[index++] = entry.getKey();
                // map.put(entry.getKey(),map.get(entry.getKey())-1);
                
            }
         }
        
        return ans;
    }
}