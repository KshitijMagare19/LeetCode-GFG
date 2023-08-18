class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) set.add(i);
        for(int i : nums) map.put(i , map.getOrDefault(i,0)+1);
        int ans = 0;
        for(int i : set) {
            if(map.get(i) == 1)
                ans+=i;
        }
        return ans;
    }
}