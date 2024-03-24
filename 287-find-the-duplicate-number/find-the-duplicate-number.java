class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i : nums) {
        //     if(map.containsKey(i)) return i;
        //     else map.put(i,1);
        // }
        // return -1;
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];

        }while(slow!=fast);
slow = 0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }
}