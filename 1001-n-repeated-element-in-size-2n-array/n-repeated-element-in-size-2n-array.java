class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        /*HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        } 
        for(int i : nums){
            if(map.get(i) == n) return i;
        }
        return -1;*/
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) 
                return i;
            else
                set.add(i);

        }
        return -1;
    }
}