class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        int pair = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums) arr.add(i);
        for(int i : nums){
            if(arr.indexOf(i) != arr.lastIndexOf(i)){
                arr.remove(Integer.valueOf(i));
                arr.remove(Integer.valueOf(i));
                pair++;
            }
        }
        ans[0] = pair;
        ans[1] = arr.size();
        return ans;
    }
}