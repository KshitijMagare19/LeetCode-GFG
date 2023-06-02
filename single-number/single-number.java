class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums) arr.add(i);
        for(int i : nums){
            if(arr.indexOf(i) == arr.lastIndexOf(i)) return i;
        }
        return -1;
    }
}