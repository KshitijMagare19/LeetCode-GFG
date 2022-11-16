class Solution {
    public int distinctAverages(int[] nums) {
        LinkedHashSet<Double> set = new LinkedHashSet<>();
        Arrays.sort(nums);
        int j = nums.length -1;
        for(int i = 0; i < nums.length/2; i++,j--){
            set.add(((double)nums[i] + (double)nums[j])/(double)2);
        }
        return set.size();
    }
}